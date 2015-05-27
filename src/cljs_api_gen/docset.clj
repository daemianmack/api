(ns cljs-api-gen.docset
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.string :refer [replace]]
    [cljs-api-gen.write :refer [get-last-written-result]]
    [cljs-api-gen.encode :refer [decode-fullname]]
    [clojure.java.jdbc :as j]
    [me.raynes.fs :refer [copy copy-dir list-dir base-name mkdirs]]
    ))

;; NOTE: you have to run docset/run-all.sh first to download/process the
;;       rendered html pages of our markdown docs from github.

;; code derived from Lokeshwaran's (@dlokesh) project:
;; https://github.com/dlokesh/clojuredocs-docset

(def offline-path "docset/offline")
(def docset-path "docset/cljs.docset")
(def docset-docs-path (str docset-path "/Contents/Resources/Documents"))
(def db-path (str docset-path "/Contents/Resources/docSet.dsidx"))

(def sqlite-db {:classname "org.sqlite.JDBC"
			          :subprotocol "sqlite"
                :subname db-path})

(defn resolve-path [& paths]
  (apply str "offline/github.com/cljsinfo/api-refs/blob/catalog/" paths))

(def type->dash
  {"var"                 "Variable"
   "dynamic var"         "Variable"
   "protocol"            "Protocol"
   "type"                "Type"
   "macro"               "Macro"
   "function"            "Function"
   "special form"        "Statement" ;; <-- Pending "Special Form"
   "special form (repl)" "Statement" ;;     (avaiable in next Dash version)
   })

(defn create!
  []

  (let [result (get-last-written-result)
        syms (merge (-> result :library-api :symbols)
                    (-> result :compiler-api :symbols))
        namespaces (set (map :ns (vals syms)))]

    (mkdirs docset-docs-path)

    ;; copy over offline pages
    (copy-dir offline-path docset-docs-path)

    ;; copy over resources
    (copy "docset/icon.png" (str docset-path "/icon.png"))
    (copy "docset/Info.plist" (str docset-path "/Contents/Info.plist"))

    ;; reset/create tables
    (j/db-do-commands sqlite-db
       "DROP TABLE IF EXISTS searchIndex"
       "CREATE TABLE searchIndex(id INTEGER PRIMARY KEY, name TEXT, type TEXT, path TEXT)"
       "CREATE UNIQUE INDEX anchor ON searchIndex (name, type, path)")

    ;; insert sections
    (j/insert! sqlite-db :searchIndex
       {:name "Library API"  :type "Section" :path (resolve-path "README.html#library-api-reference")}
       {:name "Compiler API" :type "Section" :path (resolve-path "README.html#compiler-api-reference")})

    ;; insert namespaces
    (apply j/insert! sqlite-db :searchIndex
      (for [ns- namespaces]
        {:name ns- :type "Namespace" :path (resolve-path "README.html#" (replace ns- "." ""))}))

    ;; insert symbols
    (let [refs-path (str docset-docs-path "/" (resolve-path "refs"))]
      (apply j/insert! sqlite-db :searchIndex
        (for [ref-file (list-dir refs-path)]
          (let [encoded-name (base-name ref-file true)
                full-name (decode-fullname encoded-name)
                item (get syms full-name)]
            {:name full-name
             :type (type->dash (:type item))
             :path (resolve-path "refs/" encoded-name ".html")}
            ))))
    ))

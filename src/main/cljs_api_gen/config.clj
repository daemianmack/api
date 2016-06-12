(ns cljs-api-gen.config)

(def default-out-dir "catalog")

;; location of manual cljsdoc files
(def cljsdoc-dir "cljsdoc")

;; cache directory
(defn edn-parsed-file [v] (str "cljs-api-parsed-" v ".edn"))
(defn edn-result-file [v] (str "cljs-api-" v ".edn"))

;; location of the clojure & clojurescript repos to parse
(def repos-dir "repos")

(def refs-dir "refs")

;; doc page generated for the cljs website
(def site-dir "site")

;; location of the documents generated by this program
(def ^:dynamic *output-dir* nil)
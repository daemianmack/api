(ns cljs-api-gen.config)

(def cache-dir "cache")

;; location of manual cljsdoc files
(def cljsdoc-dir "cljsdoc")

;; cache directory
(defn edn-parsed-file [v] (str v ".edn"))
(defn edn-result-file [v] (str "cljs-api.edn"))

;; location of the clojure & clojurescript repos to parse
(def repos-dir "repos")

(def refs-dir "refs")

;; doc page generated for the cljs website
(def site-dir "site")

## cljs.core/PersistentHashSet.EMPTY



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentHashSet.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashSet.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L6590-L6591):

```clj
(set! cljs.core.PersistentHashSet.EMPTY
  (PersistentHashSet. nil cljs.core.PersistentArrayMap.EMPTY 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6590-6591](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L6590-L6591)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentHashSet.EMPTY` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentHashSet.EMPTY)<br>
[`clojure.lang/PersistentHashSet.EMPTY` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentHashSet.EMPTY/)<br>
[`clojure.lang/PersistentHashSet.EMPTY` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentHashSet.EMPTY.html)<br>
[`cljs.core/PersistentHashSet.EMPTY` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentHashSet.EMPTY.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentHashSetDOTEMPTY.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentHashSet.EMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentHashSet",
 :type "var",
 :full-name-encode "cljs.core/PersistentHashSetDOTEMPTY",
 :source {:code "(set! cljs.core.PersistentHashSet.EMPTY\n  (PersistentHashSet. nil cljs.core.PersistentArrayMap.EMPTY 0))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6590 6591]},
 :full-name "cljs.core/PersistentHashSet.EMPTY",
 :clj-symbol "clojure.lang/PersistentHashSet.EMPTY"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashSet.EMPTY"]))
```

-->
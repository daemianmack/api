## cljs.pprint/\*print-pprint-dispatch\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-pprint-dispatch\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-pprint-dispatch*)
</td>
</tr>
</table>







Source docstring:

```
The pretty print dispatch function. Use with-pprint-dispatch or
set-pprint-dispatch to modify.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/cljs/pprint.cljs#L619-L623):

```clj
(defonce ^:dynamic
 ^{:doc "The pretty print dispatch function. Use with-pprint-dispatch or
set-pprint-dispatch to modify."
   :added "1.2"}
 *print-pprint-dispatch* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:619-623](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/cljs/pprint.cljs#L619-L623)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/*print-pprint-dispatch*` @ clojuredocs](http://clojuredocs.org/clojure.pprint/*print-pprint-dispatch*)<br>
[`clojure.pprint/*print-pprint-dispatch*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/*print-pprint-dispatch*/)<br>
[`clojure.pprint/*print-pprint-dispatch*` @ crossclj](http://crossclj.info/fun/clojure.pprint/*print-pprint-dispatch*.html)<br>
[`cljs.pprint/*print-pprint-dispatch*` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/*print-pprint-dispatch*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/STARprint-pprint-dispatchSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "*print-pprint-dispatch*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint/STARprint-pprint-dispatchSTAR",
 :source {:code "(defonce ^:dynamic\n ^{:doc \"The pretty print dispatch function. Use with-pprint-dispatch or\nset-pprint-dispatch to modify.\"\n   :added \"1.2\"}\n *print-pprint-dispatch* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [619 623]},
 :full-name "cljs.pprint/*print-pprint-dispatch*",
 :clj-symbol "clojure.pprint/*print-pprint-dispatch*",
 :docstring "The pretty print dispatch function. Use with-pprint-dispatch or\nset-pprint-dispatch to modify."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-pprint-dispatch*"]))
```

-->
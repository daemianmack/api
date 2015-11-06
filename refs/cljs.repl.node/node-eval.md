## cljs.repl.node/node-eval



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__node-eval__ repl-env js)<br>
</samp>

---





Source docstring:

```
Evaluate a JavaScript string in the Node REPL process.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2644/src/clj/cljs/repl/node.clj#L49-L55):

```clj
(defn node-eval
  [repl-env js]
  (let [{:keys [in out]} @(:socket repl-env)]
    (write out js)
    {:status :success
     :value (read-response in)}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2644
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:49-55](https://github.com/clojure/clojurescript/blob/r2644/src/clj/cljs/repl/node.clj#L49-L55)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.node/node-eval` @ crossclj](http://crossclj.info/fun/cljs.repl.node/node-eval.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/node-eval.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "node-eval",
 :signature ["[repl-env js]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.repl.node/node-eval",
 :source {:code "(defn node-eval\n  [repl-env js]\n  (let [{:keys [in out]} @(:socket repl-env)]\n    (write out js)\n    {:status :success\n     :value (read-response in)}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [49 55]},
 :full-name "cljs.repl.node/node-eval",
 :docstring "Evaluate a JavaScript string in the Node REPL process."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/node-eval"]))
```

-->
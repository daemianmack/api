## number literal



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#integers)
</td>
</tr>
</table>



ClojureScript numbers are the same as [JavaScript numbers],
double-precision 64-bit format IEEE 754.

[JavaScript numbers]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Numbers_and_dates#Numbers

Available formats listed below. Decimal points are not allowed when specifying
a custom base.

- decimal `123` `1.23`
- exponent `12e3` `1.2e3` `1.2e-3`
- hexadecimal `0x123`
- octal `0123`
- binary `2r0110`
- arbitrary `NrXXX` where `(<= 2 N 36)` and `X` is in `[0-9,A-Z]`



---

###### Examples:

```clj
123
;;=> 123

123.45
;;=> 123.45
```

Scientific notation;

```clj
12e3
;;=> 12000

1.2e-3
;;=> 0.0012
```

Standard hex and octal notations:

```clj
0x1f
;;=> 31

010
;;=> 8
```

Radix notation for using up to base 36.

```clj
2r10111
;;=> 23

8r32
;;=> 26

16rFF
;;=> 255

36rZ
;;=> 35
```



---

###### See Also:

[``](../syntax/Infinity.md)<br>
[``](../syntax/NaN.md)<br>
[`cljs.core/number?`](../cljs.core/numberQMARK.md)<br>
[`cljs.core/integer?`](../cljs.core/integerQMARK.md)<br>
[``](../cljs.core/int.md)<br>

---




 @ [github](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L):

```clj

```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.3.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
</pre>

-->

---




 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/number.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "ClojureScript numbers are the same as [JavaScript numbers],\ndouble-precision 64-bit format IEEE 754.\n\n[JavaScript numbers]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Numbers_and_dates#Numbers\n\nAvailable formats listed below. Decimal points are not allowed when specifying\na custom base.\n\n- decimal `123` `1.23`\n- exponent `12e3` `1.2e3` `1.2e-3`\n- hexadecimal `0x123`\n- octal `0123`\n- binary `2r0110`\n- arbitrary `NrXXX` where `(<= 2 N 36)` and `X` is in `[0-9,A-Z]`",
 :ns "syntax",
 :name "number",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/Infinity"
           "syntax/NaN"
           "cljs.core/number?"
           "cljs.core/integer?"
           "cljs.core/int"],
 :full-name-encode "syntax/number",
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :examples [{:id "f96060",
             :content "```clj\n123\n;;=> 123\n\n123.45\n;;=> 123.45\n```\n\nScientific notation;\n\n```clj\n12e3\n;;=> 12000\n\n1.2e-3\n;;=> 0.0012\n```\n\nStandard hex and octal notations:\n\n```clj\n0x1f\n;;=> 31\n\n010\n;;=> 8\n```\n\nRadix notation for using up to base 36.\n\n```clj\n2r10111\n;;=> 23\n\n8r32\n;;=> 26\n\n16rFF\n;;=> 255\n\n36rZ\n;;=> 35\n```"}],
 :edn-doc "https://github.com/edn-format/edn#integers",
 :full-name "syntax/number",
 :display "number literal",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/number"]))
```

-->
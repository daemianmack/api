# <img valign="middle" width="48px" src="http://i.imgur.com/Hi20huC.png"> ClojureScript API Reference

{{#release}}
 <table border="1">
<tr>
<td>__{{cljs-version}}__ [all](HISTORY.md)</td>
<td>{{cljs-date}}</td>
<td>[<img valign="middle" width="24px" src="http://i.imgur.com/1GjPKvB.png">
<kbd>Clojure {{clj-version}}</kbd>](http://clojure.github.io/clojure/branch-master/index.html)</td>
<td>[<img valign="middle" width="18px" src="http://i.imgur.com/yGyeE7k.png">
<kbd>Closure Lib {{gclosure-lib}}</kbd>](http://google.github.io/closure-library/api/)</td>
</tr>
</table>
{{/release}}

This is an [auto-generated](https://github.com/cljsinfo/api-refs) API reference
for ClojureScript.  All information here is rendered from
[autodocs.edn](autodocs.edn), a data structure of the API information which you
can download and use yourself.

ClojureScript has two APIs:  one for interacting with the compiler, and one for
its standard library.

 <dl>
<dt>[Library API](#library-api)</dt>
<dd>
The "Library API" is a loose classification of the symbols that you can use
inside any ClojureScript application.  They comprise ClojureScript's core
language features and standard libraries.
</dd>
<dt>[Compiler API](#compiler-api)</dt>
<dd>The "Compiler API" specifies how you can call out to the ClojureScript compiler
to perform analysis or compilation of ClojureScript code from a Clojure application.
</dd>
</dl>

## Library API

1. [Changes](#changes)
1. [Sources](#sources)
1. [Clojure vs. ClojureScript](#clojure-vs-clojurescript)
1. [Reference](#reference)

### Changes

Changes from __{{#release}}{{cljs-version}}{{/release}}__ ([See Full History](HISTORY.md)):

 <table>
{{#no-changes}}<tr><td>_no symbols were added or removed in this version_</td></tr>{{/no-changes}}
{{#changes}}
<tr>
<td>
<img valign="middle" src="https://img.shields.io/badge/{{change}}-{{shield-text}}-{{shield-color}}.svg">
</td>
<td><samp>[{{&text}}]({{&link}})</samp></td>
</tr>
{{/changes}}
</table>

### Sources

Symbols from ClojureScript's core language features and libraries span multiple
sources:

|             | clojure            | cljs compiler      | cljs library       | closure\*          | js\*               |
|-------------|:------------------:|:------------------:|:------------------:|:------------------:|:------------------:|
| macros      | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |                    |                    |
| functions   |                    |                    | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| vars        |                    |                    | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| specials    |                    | :heavy_check_mark: |                    |                    |                    |

_\* included in and accessible from every ClojureScript application:_

- [Google Closure Library](http://google.github.io/closure-library/api/)
- [JavaScript's native library](https://developer.mozilla.org/docs/Web/JavaScript/Reference)

### Clojure vs. ClojureScript

To show the significant overlap between Clojure and ClojureScript, we mark the symbols
in the following reference section as follows:

 <table>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"></td>
<td>
ported from Clojure (re-implemented)
</td>
</tr>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>→</samp></td>
<td>
imported directly from Clojure
</td>
</tr>
</table>

:no_entry_sign: Also, see the [Clojure symbols not yet ported](UNPORTED.md).

### Reference

{{#ns-symbols}}
- [{{&toc-text}}](#{{&ns-link}})
{{/ns-symbols}}

_* these are pseudo-namespaces since special forms have no namespace_

{{#ns-symbols}}
#### {{ns}}

 <table>
<thead><tr>
<th>=</th>
<th>Type</th>
<th>Name</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr>
<td>{{#clj-symbol}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&link}}){{#import}} <samp>→</samp>{{/import}}{{/clj-symbol}}</td>
<td><samp>{{type}}</samp></td>
<td><samp>[{{&display-name}}]({{&link}})</samp></td>
<td>{{#history}}{{&.}} {{/history}}</td>
</tr>
{{/symbols}}
</table>

{{/ns-symbols}}
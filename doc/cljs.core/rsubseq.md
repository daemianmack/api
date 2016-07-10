---
name: cljs.core/rsubseq
see also:
  - cljs.core/subseq
---

## Signature
[sc test key]
[sc start-test start-key end-test end-key]


## Details

`sc` must be a sorted collection.

`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.

Returns a reverse sequence of those entries with keys `ek` for which
`(test (.. sc comparator (compare ek key)) 0)` is true.
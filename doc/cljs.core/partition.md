---
name: cljs.core/partition
see also:
  - cljs.core/partition-all
  - cljs.core/split-at
  - cljs.core/partition-by
---

## Signature
[n coll]
[n step coll]
[n step pad coll]


## Details

Returns a lazy sequence of lists of `n` items each, at offsets `step` apart.

If `step` is not supplied, defaults to `n`, i.e. the partitions do not overlap.

If a `pad` collection is supplied, its elements will be used as necessary to
complete the last partition up to `n` items.

Returns a partition with less than `n` items if there are not enough padding
elements.


## TODO

This function really needs an example.
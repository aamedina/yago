(ns net.wikipunk.yago.boot
  {:rdf/type :jsonld/Context})

(def yago
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://yago-knowledge.org/resource/"
   :rdfa/prefix "yago"})


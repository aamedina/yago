(ns net.wikipunk.yago.boot
  {:rdf/type :jsonld/Context})

(def yago
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://yago-knowledge.org/resource/"
   :rdfa/prefix "yago"})

(def schema
  {:dcat/downloadURL "resources/yago-wd-schema.nt.gz"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://schema.org/"
   :rdfa/prefix      "schema"})

(def bioschema
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://bioschemas.org/"
   :rdfa/prefix "bioschema"})


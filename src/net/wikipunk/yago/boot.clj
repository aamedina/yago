(ns net.wikipunk.yago.boot
  {:rdf/type :jsonld/Context})

(def yago
  {:dcat/downloadURL "resources/yago-wd-class.nt.gz"
   :rdf/type    :rdfa/PrefixMapping
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

(def shapes
  {:dcat/downloadURL "resources/yago-wd-shapes.nt.gz"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://yago-knowledge.org/value/"
   :rdfa/prefix      "yago.shapes"})

(def facts
  {:dcat/downloadURL "resources/yago-wd-facts.nt.gz"})

(def labels
  {:dcat/downloadURL "resources/yago-wd-labels.nt.gz"})

(def annotated-facts
  {:dcat/downloadURL "resources/yago-wd-annotated-facts.ntx.gz"})

(def full-types
  {:dcat/downloadURL "resources/yago-wd-full-types.nt.gz"})

(def simple-types
  {:dcat/downloadURL "resources/yago-wd-simple-types.nt.gz"})

(def sameAs
  {:dcat/downloadURL "resources/yago-wd-sameAs.nt.gz"})


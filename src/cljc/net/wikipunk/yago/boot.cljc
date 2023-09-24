(ns net.wikipunk.yago.boot
  {:rdf/type :jsonld/Context})

;; @prefix yago: <http://yago-knowledge.org/resource/> .
;; @prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
;; @prefix xsd: <http://www.w3.org/2001/XMLSchema#> .
;; @prefix ontolex: <http://www.w3.org/ns/lemon/ontolex#> .
;; @prefix dct: <http://purl.org/dc/terms/> .
;; @prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
;; @prefix owl: <http://www.w3.org/2002/07/owl#> .
;; @prefix wikibase: <http://wikiba.se/ontology#> .
;; @prefix skos: <http://www.w3.org/2004/02/skos/core#> .
;; @prefix schema: <http://schema.org/> .
;; @prefix cc: <http://creativecommons.org/ns#> .
;; @prefix geo: <http://www.opengis.net/ont/geosparql#> .
;; @prefix prov: <http://www.w3.org/ns/prov#> .
;; @prefix wd: <http://www.wikidata.org/entity/> .
;; @prefix data: <https://www.wikidata.org/wiki/Special:EntityData/> .
;; @prefix sh: <http://www.w3.org/ns/shacl#> .
;; @prefix s: <http://www.wikidata.org/entity/statement/> .
;; @prefix ref: <http://www.wikidata.org/reference/> .
;; @prefix v: <http://www.wikidata.org/value/> .
;; @prefix wdt: <http://www.wikidata.org/prop/direct/> .
;; @prefix wpq: <http://www.wikidata.org/prop/quant/> .
;; @prefix wdtn: <http://www.wikidata.org/prop/direct-normalized/> .
;; @prefix p: <http://www.wikidata.org/prop/> .
;; @prefix ps: <http://www.wikidata.org/prop/statement/> .
;; @prefix psv: <http://www.wikidata.org/prop/statement/value/> .
;; @prefix psn: <http://www.wikidata.org/prop/statement/value-normalized/> .
;; @prefix pq: <http://www.wikidata.org/prop/qualifier/> .
;; @prefix pqv: <http://www.wikidata.org/prop/qualifier/value/> .
;; @prefix pqn: <http://www.wikidata.org/prop/qualifier/value-normalized/> .
;; @prefix pr: <http://www.wikidata.org/prop/reference/> .
;; @prefix prv: <http://www.wikidata.org/prop/reference/value/> .
;; @prefix prn: <http://www.wikidata.org/prop/reference/value-normalized/> .
;; @prefix wdno: <http://www.wikidata.org/prop/novalue/> .
;; @prefix ys: <http://yago-knowledge.org/schema#> .

;; @prefix geo: <http://www.opengis.net/ont/geosparql#> .

(def ys
  {:rdf/type :rdfa/PrefixMapping
   :rdfa/prefix "ys"
   :rdfa/uri "http://yago-knowledge.org/schema#"
   :dcat/downloadURL "net/wikipunk/yago/yago-schema.ttl"})

(def yago
  {:rdf/type :rdfa/PrefixMapping
   :rdfa/prefix "yago"
   :rdfa/uri "http://yago-knowledge.org/resource/"
   :dcat/downloadURL "net/wikipunk/yago/yago-taxonomy.ttl"})

(def ontolex
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.w3.org/ns/lemon/ontolex#"
   :rdfa/prefix "ontolex"})

(def synsem
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.w3.org/ns/lemon/synsem#"
   :rdfa/prefix "synsem"})

(def geo
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.opengis.net/ont/geosparql#"
   :rdfa/prefix "geo"
   :namespaces
   {"dcterms" "http://purl.org/dc/terms/",
    "geo"     "http://www.opengis.net/ont/geosparql#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "schema"  "https://schema.org/",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"}})

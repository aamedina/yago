(ns net.wikipunk.yago
  "YAGO"
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.yago.boot]
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.xsd]
   [net.wikipunk.rdf.dcterms]
   [net.wikipunk.rdf.skos]
   [net.wikipunk.rdf.cc]
   [net.wikipunk.rdf.prov]
   [net.wikipunk.rdf.ys]
   [net.wikipunk.rdf.sh]
   [net.wikipunk.rdf.schema]
   [net.wikipunk.rdf.ontolex]
   [net.wikipunk.rdf.wikibase]))

(defrecord YAGO []
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))


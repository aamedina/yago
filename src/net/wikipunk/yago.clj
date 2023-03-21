(ns net.wikipunk.yago
  "Load the YAGO knowledge off the classpath in your system
  using this component."
  (:require
   [com.stuartsierra.component :as com]))

(defrecord YAGO []
  com/Lifecycle
  (start [this]
    (require 'net.wikipunk.rdf.schema :reload)
    (require 'net.wikipunk.rdf.bioschema)
    (require 'net.wikipunk.rdf.yago)
    (require 'net.wikipunk.rdf.yago.full-facts)
    (require 'net.wikipunk.rdf.yago.shapes)
    this)
  (stop [this]
    this))

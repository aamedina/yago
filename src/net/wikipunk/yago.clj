(ns net.wikipunk.yago
  "Load the YAGO knowledge off the classpath in your system
  using this component."
  (:require
   [com.stuartsierra.component :as com]))

(defrecord YAGO []
  com/Lifecycle
  (start [this]
    (require 'net.wikipunk.rdf.yago)
    (require 'net.wikipunk.rdf.yago.full-facts)
    this)
  (stop [this]
    this))

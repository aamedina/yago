(ns net.wikipunk.yago
  "YAGO"
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.yago.boot]))

(defrecord YAGO []
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))

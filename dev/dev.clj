(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.pprint :refer [pprint pp]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [com.stuartsierra.component :as com]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.chat :as chat]
   [net.wikipunk.mop :as mop :refer [isa? descendants parents ancestors]]
   [net.wikipunk.openai :as openai]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [net.wikipunk.temple :as temple]
   [zprint.core :as zprint]
   [net.wikipunk.yago.boot :as boot]
   [xtdb.api :as xt])
  (:refer-clojure :exclude [isa? descendants parents ancestors]))

(set-init
  (fn [_]
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(defmacro inspect
  "Evaluate forms in an implicit do and inspect the value of the last
  expression using Reveal."
  [& body]
  `(do (@user/reveal (do ~@body))
       true))

(comment
  (let [full-types (ns-map 'net.wikipunk.rdf.yago.full-types)]
    (spit "resources/net/wikipunk/rdf/yago/full_facts.clj"
          (binding [*print-namespace-maps* nil
                    *print-meta*           true]
            (let [forms (cons `(~'in-ns 'net.wikipunk.rdf.yago)
                              (map (fn [[k v]]
                                     (list 'def k (merge @v @(get full-types k))))
                                   (ns-publics 'net.wikipunk.rdf.yago.facts)))]
              (with-out-str
                (doseq [form forms]
                  (zprint/zprint form {:map    {:justify?      true
                                                :nl-separator? false
                                                :hang?         true
                                                :indent        0
                                                :sort-in-code? true
                                                :force-nl?     true}
                                       :vector {:wrap? false}})
                  (newline))))))))

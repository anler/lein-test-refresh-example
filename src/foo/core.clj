(ns foo.core
  (:require [cprop.core :as cprop]
            [cprop.source :as cprop.source]))

(defn env
  []
  (select-keys
    (cprop/load-config
      :resource "config.edn"
      :merge
      [(cprop.source/from-system-props)
       (cprop.source/from-env)])
    [:db
     :foo]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

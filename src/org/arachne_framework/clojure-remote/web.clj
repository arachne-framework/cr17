(ns org.arachne-framework.template.clojure-remote.web
  (:require [org.arachne-framework.template.clojure-remote.visual-hash :refer [vhash]]))

(defn healthcheck
  [req]
  {:status 200
   :body "OK"})

(defn robot
  [req]
  (let [name (get-in req [:path-params :name])
        component (:vhash req)]
    {:status 200
     :headers {"Content-Type" "image/png"}
     :body (vhash component name)}))

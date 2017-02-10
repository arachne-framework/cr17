(ns org.arachne-framework.template.clojure-remote.web)

(defn healthcheck
  [req]
  {:status 200
   :body "OK"})

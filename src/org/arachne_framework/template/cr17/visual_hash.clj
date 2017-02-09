(ns org.arachne-framework.template.cr17.visual-hash
  (:import [java.net URL]))

(defprotocol VisualHash
  (vhash [this s] "Given a string, return an image (as an InputStream)"))

(defrecord RoboHash []
  VisualHash
  (vhash [this s]
    (let [url (URL. (str "https://robohash.org/" s))]
      (.openStream url))))

(defn new-robohash
  "Constructor function for a RoboHash"
  []
  (->RoboHash))
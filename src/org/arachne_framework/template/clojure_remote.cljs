(ns org.arachne-framework.template.clojure-remote
  (:require [rum.core :as rum]))

(rum/defc hello [text]
  [:div {:class "hello"} text])

(rum/mount (hello "Hello, world!")
  (.getElementById js/document "app"))

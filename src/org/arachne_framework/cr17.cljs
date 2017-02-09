(ns org.arachne-framework.cr17
  (:require [rum.core :as rum]))

(rum/defc hello [text]
  [:div {:class "hello"} text])

(rum/mount (hello "Hello, world!")
  (.getElementById js/document "app"))

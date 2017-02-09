(ns org.arachne-framework.template.cr17
  (:require [rum.core :as rum]))

(rum/defc hello [text]
  [:div {:class "hello"} text])

(rum/mount (hello "Hello, world!")
  (.getElementById js/document "app"))

 (ns user
   (:require [reloaded.repl :refer [set-init! system init start stop go reset reset-all]]
             [arachne.core :as a]
             [arachne.figwheel :as fig]
             [org.arachne-framework.template.cr17 :as app])
   )

(def ^{:dynamic true
       :doc "Bound to the config for the current application"}
  *cfg*
  nil)

(defn init-arachne
  "Create an Arachne runtime"
  [runtime]
  (let [cfg (a/config :org.arachne-framework.template/cr17)
        rt (a/runtime cfg runtime)]
    (alter-var-root #'*cfg* (constantly cfg))
    rt))

(set-init! #(init-arachne ::app/runtime))

(defn cljs-repl
  "Launch a CLJS repl for a Figwheel in the currently running Arachne system"
  []
  (fig/repl system))


(comment
  ;; This is what is involved in starting an Arachne system:

  ;; First, build a config:
  (def cfg (a/config :org.arachne-framework.template/cr17))
  (def rt (a/runtime cfg :org.arachne-framework.template.cr17/runtime))

  (require '[com.stuartsierra.component :as c])

  (def started-rt (c/start rt))

  (c/stop started-rt)


  )

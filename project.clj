(defproject org.arachne-framework/cr17 "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]

                 [org.arachne-framework/pedestal-assets "0.1.0-master-0006-46abdf0"]
                 [org.arachne-framework/arachne-figwheel "0.1.0-master-0011-735f99c"]

                 [datascript "0.15.5"]

                 [ch.qos.logback/logback-classic "1.1.3"]

                 [rum "0.10.8"]]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[com.cemerick/piggieback "0.2.1"
                                   :exclusions [org.clojure/clojurescript]]
                                  [reloaded.repl "0.2.3"
                                   :exclusions [com.stuartsierra/component]]]
                   :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
  :repositories [["arachne-dev"
                  "http://maven.arachne-framework.org/artifactory/arachne-dev"]])

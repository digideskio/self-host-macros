(defproject clojure-spec-playground "0.0.1"
  :description "Clojure.spec playground"
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [org.clojure/clojurescript "1.9.293"]
                 [net.cgrand/macrovich "0.1.0"]]
  :source-paths ["src"]
  :profiles {:dev {:dependencies [[org.clojure/test.check "0.9.0"]]}}
  :plugins [[lein-cljsbuild "1.1.5"]]
  :cljsbuild {:builds {:dev {
                             :source-paths ["src"]
                             :optimizations :whitespace
                             :compiler {:main "self-host-macros.broken"
                                        :output-to "out/main.js"
                                        :output-dir "out"}}
                       }}
  )

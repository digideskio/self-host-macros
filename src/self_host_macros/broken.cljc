(ns self-host-macros.broken
  (:require [self-host-macros.foo :as foo])
  #?(:cljs (:require-macros [self-host-macros.broken :refer [dbg]])))
   
#?(:cljs (enable-console-print!))
(defmacro dbg[x]
`(let [x# ~x]
   (println (str '~x ": " x#))
   x#))

 (defn arithmetic [a b]
    (* (foo/foo a) (dbg (+ a b))))

 #?(:clj (dbg "clojure")
    :cljs (dbg "clojurescript"))

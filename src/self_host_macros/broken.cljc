(ns self-host-macros.broken
   (:require-macros [self-host-macros.broken :refer [dbg]]))
   
   
(defmacro dbg[x]
`(let [x# ~x]
   (println (str '~x ": " x#))
   x#))

 (defn arithmetic [a b]
    (* a (dbg (+ a b))))

 #?(:clj (dbg "clojure")
    :cljs (dbg "clojurescript"))

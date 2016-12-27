(ns self-host-macros.broken
   (:require-macros [self-host-macros.core :refer [dbg]]))
   
   
(defmacro dbg[x]
`(let [x# ~x]
   (println (str '~x ": " x#))
   x#))

 (defn arithmetic [a b]
    (* a (dbg (+ a b))))

 (dbg (map inc [1 2 3]))

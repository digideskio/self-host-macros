(ns self-host-macros.core
    #?(:clj
       (:require [net.cgrand.macrovich :as macros])
     :cljs
       (:require-macros [net.cgrand.macrovich :as macros]
        [self-host-macros.core :refer [dbg]]))) 
   )
   
(macros/deftime
 (defmacro dbg[x]
  `(let [x# ~x]
     (println (str '~x ": " x#))
     x#))
   
 )

(macros/usetime
   (defn arithmetic [a b]
      (* a (dbg (+ a b))))
   
)


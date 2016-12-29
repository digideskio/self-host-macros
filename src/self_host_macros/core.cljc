(ns self-host-macros.core
    (:require 
          #?(:clj [net.cgrand.macrovich :as macros])
        [self-host-macros.foo :as foo]
        )
     :cljs
       (:require-macros
           [net.cgrand.macrovich :as macros]
           [self-host-macros.core :refer [dbg]]))
   )
   
(macros/deftime
 (defmacro dbg[x]
  `(let [x# ~x]
     (println (str '~x ": " x#))
     x#))
   
 )

(macros/usetime
   (defn arithmetic [a b]
      (* (foo/foo a) (dbg (+ a b))))
   
)


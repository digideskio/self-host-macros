(ns self-host-macros.broken
  #?(:cljs (:require-macros [self-host-macros.broken :refer [dbg]])))
   
#?(:cljs (enable-console-print!))
(defmacro dbg[x]
`(let [x# ~x]
   (println (str '~x ": " x#))
   x#))

 (defn arithmetic [a b]
    (* a (dbg (+ a b))))

 #?(:clj (dbg "clojure")
    :cljs (dbg "clojurescript"))

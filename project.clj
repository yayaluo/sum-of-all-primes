(defproject sum-of-all-primes "0.1.0-SNAPSHOT"
  :description "a sum of all primes project"
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :repl-options {:init-ns sum-of-all-primes.core}
  :main sum-of-all-primes.core
  :aot [sum-of-all-primes.core])
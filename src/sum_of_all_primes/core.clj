(ns sum-of-all-primes.core
    (:gen-class))

(defn sum-primes [n]
  (apply +
         (loop [p 2
         marked #{}
         primes []]
           (let [mults (->> n
                     (range p)
                     (map #(* p %))
                     (take-while #(< % n)))
                 next-p (->> p
                      (inc)
                      (iterate inc)
                      (remove marked)
                      (first))
                 new-primes (conj primes p)]
             (if (>= next-p n)
               new-primes
               (recur next-p (into marked mults) new-primes))))))

(defn -main [& args]
  ;Q: Find the sum of all prime numbers below 2,000,000
  (println "Answer of Q: ")
  (println (sum-primes 2000000)))
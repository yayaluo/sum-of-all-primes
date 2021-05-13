(ns sum-of-all-primes.core-test
    (:require [clojure.test :refer :all]
              [sum-of-all-primes.core :refer :all]))

(deftest sum-primes-test
  (testing "Test the sum of all prime numbers below 2,000,000"
           (is (= (sum-primes 2000000) 142913828922))))
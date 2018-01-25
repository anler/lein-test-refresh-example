(ns foo.core-test
  (:require [clojure.test :refer :all]
            [foo.core :refer :all]))

(deftest a-test
  (testing "Check environment"
    (is (= "my-test-value"
           (:db (env))))))

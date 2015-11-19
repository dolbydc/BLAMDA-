(ns blamda.count-down-test
  (:require [blamda.count-down :as cd]
            [clojure.test :refer [deftest testing is]]))

(deftest count-down-test
  (testing "Testing Count down from positive number."
    (is (= (cd/count-down 5) [5 4 3 2 1 0])))
  (testing "Testing Count down from zero."
    (is (= (cd/count-down 0) [0])))
  (testing "Testing Count down from negative number."
    (is (= (cd/count-down -5) :invalid))))

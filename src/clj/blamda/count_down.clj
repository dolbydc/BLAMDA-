(ns blamda.count-down
  (:require [clojure.pprint]))

(comment (defn count-down
  [starting-point]
  (if-not (neg? starting-point)
    (let [count-up (range 0 (inc starting-point))]
      (loop [results '() remainder count-up]
        (let [left (rest remainder)]
          (if (seq left)
            (recur (conj results (first remainder)) left)
            (conj results (first remainder))))))
    :invalid)))

(defn count-down
  [starting-point]
  (if-not (neg? starting-point)
    (reduce #(conj %1 %2) '() (range 0 (inc starting-point)))
    :invalid))

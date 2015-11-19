(comment "If divisible by 3 return \"fizz\" if divisible by 5 return \"buzz\".  If divisible by both return \"fizzbuzz\", otherwise return the number.")

(comment (defn all-ratios? [& args]
  (loop [args args all-ratios? nil]
    (if-let [arg (first args)]
       (recur (rest args) (if (nil? all-ratios?) (ratio? arg) (and all-ratios? (ratio? arg))))
       all-ratios?))))

(defn all-ratios?
  [& args]
  (reduce #(and %1 (ratio? %2)) true args))

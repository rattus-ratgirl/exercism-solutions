(ns hamming)

(def bool->int {true 1
                false 0})

(defn distance
  "Returns the hamming distance between two DNA strands."
  [strand1 strand2]
  (if-not (= (count strand1) (count strand2))
    (throw (IllegalArgumentException. "strands must be of equal length"))
    (count (filter true? (map not= strand1 strand2)))))

(distance "G" "T")
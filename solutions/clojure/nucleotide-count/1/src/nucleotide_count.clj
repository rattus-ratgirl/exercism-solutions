(ns nucleotide-count)

(defn count-of-nucleotide-in-strand [nucleotide strand]
  (if (contains? #{\G \A \T \C} nucleotide)
    (count (filter #{nucleotide} strand))
    (throw (Error. "No nucleotide"))))

(defn nucleotide-counts [strand]
  {\G (count-of-nucleotide-in-strand \G strand)
   \A (count-of-nucleotide-in-strand \A strand)
   \T (count-of-nucleotide-in-strand \T strand)
   \C (count-of-nucleotide-in-strand \C strand)})

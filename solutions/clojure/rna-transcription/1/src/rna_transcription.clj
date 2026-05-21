(ns rna-transcription)

(def rc {\G \C
         \C \G
         \T \A
         \A \U})

(defn to-rna
  "Returns the RNA complement of the given DNA string sequence."
  [dna]
  ;; function body
  (apply str (map rc dna)))
(ns rna-transcription)

(def dna-to-rna {\G \C
                 \C \G
                 \T \A
                 \A \U})

(defn- strand-complement
  [strand]
  (let [complement (get dna-to-rna strand)] (assert complement) complement))

(defn to-rna
  [dna-strand]
    (apply str (map strand-complement dna-strand)))

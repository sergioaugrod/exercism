(ns anagram
  (:require [clojure.string :as str]))

(defn- own-anagram?
  [word possible-anagram]
  (= (str/lower-case word) (str/lower-case possible-anagram)))

(defn- same-letters?
  [word other-word]
  (= (sort (str/lower-case word))
     (sort (str/lower-case other-word))))

(defn- anagram?
  [word possible-anagram]
  (and (not (own-anagram? word possible-anagram))
       (same-letters? word possible-anagram)))

(defn anagrams-for
  [word possible-anagrams]
  (filter #(anagram? word %) possible-anagrams))

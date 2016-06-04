(ns word-count
  (:require [clojure.string :as str]))

(defn word-count [words]
  (frequencies
    (re-seq #"\w+" (str/lower-case words))))

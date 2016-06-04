(ns bob
  (:require [clojure.string :as string]))

(defn letters-caps?
  [message]
  (and
    (not (= (string/lower-case message) (string/upper-case message)))
    (= (string/upper-case message) message)))

(defn question?
  [message]
  (and
    (not (letters-caps? message))
    (string/ends-with? message "?")))

(defn response-for
  [message]
  (cond
    (question? message) "Sure."
    (letters-caps? message) "Whoa, chill out!"
    (string/blank? message) "Fine. Be that way!"
    :else "Whatever."))

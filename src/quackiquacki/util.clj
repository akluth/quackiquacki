(ns quackiquacki.util
  (:use quackiquacki.speech))

(defn prompt []
  (print "> ")
  (flush)
  (loop [input (read-line)]
  (print "> ")
  (when-not (= ":done" input)
    (say input)
    (flush)
    (recur (read-line)))))

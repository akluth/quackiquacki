(ns quackiquacki.util)

(def prompt
  (loop [input (read-line)]
  (when-not (= ":done" input)
    (println (str "You entered: >>" input "<<"))
    (recur (read-line)))))

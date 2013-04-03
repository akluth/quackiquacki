(ns quackiquacki.core
  (:gen-class)
  (:use
    [quackiquacki.speech]
    [quackiquacki.util]))

(defn -main [& args]
  (println "quackiquacki - Speech recognition/text-to-speech")
  (println "Copyright (c) 2013 Alexander Kluth <contact@alexanderkluth.com>")
  (prompt))

;;  (println "Start speaking into your microphone...")
;;  (say "Hello World, this is a test!"))

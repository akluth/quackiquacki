(ns quackiquacki.core
  (:gen-class)
  (:use [quackiquacki.speech]))

(defn -main [& args]
  (println "quackiquacki - Speech recognition")
  (println "Copyright (c) 2013 Alexander Kluth <contact@alexanderkluth.com>")
  (println "Start speaking into your microphone...")
  (say "Hallo Welt!"))

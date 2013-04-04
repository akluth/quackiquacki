(ns quackiquacki.core
  (:gen-class)
  (:use [clojure.tools.cli :only [cli]])
  (:use
    [quackiquacki.speech]
    [quackiquacki.util]))

(defn -main [& args]
  (let [[options args banner]
    (cli args
    ["-h" "--help" "Show this help" :flag true :default false]
    ["-p" "--prompt" "Spawn a prompt for entering text" :flag true :default false])]
    (when (:help options)
      (println banner)
      (System/exit 0))
    (if (and (:prompt options)) (do 
      (println "quackiquacki - Speech recognition/text-to-speech")
      (println "Copyright (c) 2013 Alexander Kluth <contact@alexanderkluth.com>")
      (flush)
      (prompt))
    (println banner))))


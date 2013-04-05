;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; This file is part of quackiquacki.                                   ;
;                                                                      ;
; quackiquacki is free software: you can redistribute it and/or modify ;
; it under the terms of the GNU General Public License as published by ;
; the Free Software Foundation, either version 3 of the License, or    ;
; (at your option) any later version.                                  ;
;                                                                      ;
; quackiquacki is distributed in the hope that it will be useful,      ;
; but WITHOUT ANY WARRANTY; without even the implied warranty of       ;
; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the        ;
;  GNU General Public License for more details.                        ;
;                                                                      ;
; You should have received a copy of the GNU General Public License    ;
; along with quackiquacki. If not, see <http://www.gnu.org/licenses/>. ;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
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
      (println "Copyright (c) 2013 Alexander Kluth <contact@alexanderkluth.com>\n")
      (println "Starting the command prompt. Use :? for help, :quit to exit quackiquacki.\n")
      (flush)
      (prompt))
    (println banner))))


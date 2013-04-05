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
(ns quackiquacki.util
  (:use quackiquacki.speech))

(defn call [^String nm & args]
    (when-let [fun (ns-resolve *ns* (symbol nm))]
        (apply fun args)))

(def cmd_keys [:? :quit :open])
(def cmd_vals ["quackiquacki.util/help" "quackiquacki.util/quit" "browser/get"])
(def cmds (zipmap cmd_keys cmd_vals))


(defn prompt []
  (print "> ")
  (flush)
  (loop [input (read-line)]
  (print "> ")
  (if (re-find #"^:" input)
    (call (get cmds (load-string input)))
    (say input))
  (flush)
  (recur (read-line))))


(defn help []
  (flush)
  (println "\n:?        - show help")
  (println ":open URL - open URL")
  (println ":quit     - exit program"))


(defn quit []
  (println "Exiting.\n")
  (System/exit 0))
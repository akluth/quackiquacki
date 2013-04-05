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
  (:use [clojure.string :only (join split)])
  (:use 
    [quackiquacki.speech]
    [quackiquacki.browser]))

(defn call [^String nm & args]
    (when-let [fun (ns-resolve *ns* (symbol nm))]
        (apply fun args)))

(def cmd_keys [
  :?
  :quit 
  :get-url
  :get-title])
(def cmd_vals [
  "quackiquacki.util/help" 
  "quackiquacki.util/quit" 
  "quackiquacki.browser/get-url" 
  "quackiquacki.browser/get-title"])
(def cmds (zipmap cmd_keys cmd_vals))


(defn parse-and-call [str]
  (let [cmd (first (split str #"\s")) args (rest (split str #"\s"))]
    (call (get cmds (load-string cmd)) (join " " args))))


(defn prompt []
  (print "> ")
  (flush)
  (loop [input (read-line)]
  (print "> ")
  (if (re-find #"^:" input)
    (parse-and-call input)
    (say input))
  (flush)
  (recur (read-line))))


(defn help [tmp]
  (flush)
  (println "\n:?            - show help")
  (println ":get-url URL    - open URL")
  (println ":get-title URL  - get heading/title from last called URL")
  (println ":quit           - exit program"))


(defn quit [tmp]
  (println "Exiting.\n")
  (System/exit 0))
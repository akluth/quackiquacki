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
(ns quackiquacki.browser
  (:require [clj-http.client :as client])
  (:require [net.cgrand.enlive-html :as html])
  (:use clojure.pprint)
  (:use quackiquacki.speech))

(def dom (atom {}))

;; Get the contents from a URL
(defn get-url [url]
  ;(swap! dom map (html/html-resource (java.net.URL. (str "http://" url)))))
  (swap! dom hash-map (html/html-resource (java.net.URL. (str "http://" url)))))


(defn get-title [tmp]
  (let [content (vals @dom)]
    (pprint content)))
;  (let [body (get dom :body)]
;    (say (first (html/select body [:head :title])))))

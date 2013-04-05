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
  (:use quackiquacki.speech))

(defn website [content]
  (into-array [content]))

(defn get-url [url]
  (let [response (client/get url)]
    (get response :body)))

(defn get-title [url]
  (say (first (map html/text (html/select (html/html-resource (java.net.URL. url)) [:head :title])))))
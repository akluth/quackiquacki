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
(defproject quackiquacki "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [
    [org.clojure/clojure "1.3.0"]
    [clojure-opennlp "0.2.0"]
    [org.mobicents.external.freetts/cmulex "1.0"]
    [org.mobicents.external.freetts/freetts "1.0"]
    [org.mobicents.external.freetts/cmudict04 "1.0"]
    [org.mobicents.external.freetts/cmutimelex "1.0"]
    [org.mobicents.external.freetts/cmu_time_awb "1.0"]
    [org.mobicents.external.freetts/en_us "1.0"]
    [org.mobicents.external.freetts/cmu_us_kal "1.0"]
    [clj-http "0.7.0"]
    [org.clojure/tools.cli "0.2.2"]
    [edu.stanford.nlp/stanford-corenlp "1.3.4"]
    [org.clojure/java.jdbc "0.0.6"]
    [org.xerial/sqlite-jdbc "3.7.2"]
    [enlive "1.1.1"]]
  :ato [quackiquacki.core]
  :main quackiquacki.core)

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
(ns quackiquacki.speech
  (:import
    (com.sun.speech.freetts Voice)
    (com.sun.speech.freetts VoiceManager)
    (com.sun.speech.freetts.audio JavaClipAudioPlayer)
    (com.sun.speech.freetts.audio JavaStreamingAudioPlayer)
    (javax.sound.sampled AudioFileFormat$Type)))


(System/setProperty "freetts.voices" "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory")

(def voice-manager (. VoiceManager getInstance))


(defn say [text]
  (let [audioplayer (doto (new JavaStreamingAudioPlayer))]
    (doto (. voice-manager getVoice "kevin16")
      (.allocate)
      (.setAudioPlayer audioplayer)
      (.speak text)
      (.deallocate))
    (.close audioplayer)))

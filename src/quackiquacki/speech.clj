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

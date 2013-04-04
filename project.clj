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
    [edu.stanford.nlp/stanford-corenlp "1.3.4"]]
  :ato [quackiquacki.core]
  :main quackiquacki.core)

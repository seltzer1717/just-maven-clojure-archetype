(ns com.example.sample.core-test
  (:require [clojure.test :as test]
            [com.example.sample.core :as core]))

(test/deftest bartest
  (test/is (= "blah" (core/reverso "halb"))))

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
(ns ${package}.core-test
  (:require [clojure.test :as test]
            [${package}.core :as core]))

(test/deftest bartest
  (test/is (= "bar" (core/foo))))

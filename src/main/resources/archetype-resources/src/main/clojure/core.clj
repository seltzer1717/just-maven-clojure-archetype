#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
(ns ${package}.core)

(defn reverso [input]
  (->> input reverse (apply str)))
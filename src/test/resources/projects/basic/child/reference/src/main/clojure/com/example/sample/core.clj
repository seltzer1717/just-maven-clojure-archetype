(ns com.example.sample.core)

(defn reverso [input]
  (->> input reverse (apply str)))
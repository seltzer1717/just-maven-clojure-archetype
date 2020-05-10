;; Import Java classes
(import (java.nio.file SimpleFileVisitor FileVisitResult Files)
        (java.io File))

;; Target folder
(def output-dir-file
  "File representing target (or output) folder."
  (-> (System/getProperties)
      (get "clojure.compile.path")
      (File.)))

;; Source directory
(def source-path
  "Path representing source directory"
  (-> (System/getProperties)
      (get "maven.source.dir")
      (File.)
      (.toPath)))

;; FileVisitor compile proxy.
(def visitor
  "Java SimpleFileVisitor - overrides visitFile:
   takes path and attributes, compiles .clj files,
   and returns FileVisitResult/CONTINUE"
  (proxy [SimpleFileVisitor]
         []
         (visitFile [path attributes]
           (let [file-path   (.toFile path)
                 string-path (.toString path)]
             (if (.isFile file-path)
                 (if (.endsWith string-path ".clj")
                     (let [relative-path         (.relativize source-path path)
                           relative-string       (.toString relative-path)
                           dot-clj-index         (.indexOf relative-string ".clj")
                           without-suffix        (.substring relative-string 0 dot-clj-index)
                           ;; standardizing windows systems
                           forward-slash         (.replaceAll without-suffix "\\\\" "/")
                           underscores-to-dashes (.replaceAll forward-slash "_" "-")
                           source-namespace      (.replaceAll underscores-to-dashes "/" ".")]
                       (load forward-slash)
                       (compile (symbol source-namespace))))))
           FileVisitResult/CONTINUE)))

;; Create target/classes folders if missing.
(if (not (.exists output-dir-file))
    (.mkdirs output-dir-file))

;; Walk source folder tree and compile Clojure source files.
(Files/walkFileTree source-path visitor)

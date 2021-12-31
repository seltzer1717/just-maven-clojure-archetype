@echo off
mvn -q exec:java@clj -Dclojure.args=%*
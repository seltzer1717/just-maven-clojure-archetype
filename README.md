# just-maven-clojure-archetype
An archetype, for Clojure projects, that requires only Maven.

## Current 0.2-RELEASE
```
  <groupId>cloud.seltzer1717.clojure</groupId>
  <artifactId>just-maven-clojure-archetype</artifactId>
  <version>0.2-RELEASE</version>
```

# Why another Clojure build tool?
- This isn't another build tool. It's a Maven archetype designed to put you in control.
  - Maven archetypes are just project stereotypes that make it easy for developers to create a new projects, patterned for a specific purpose.
  - So no plugins or proprietary command line tools required.
- Java shops are notoriously rigid when asked to introduce new build mechanisms into their existing DevOps pipeline systems.
  - This archetype introduces no new tools. It's just a maven pom that fits neatly within a current Maven DevOps pipeline system.
- Maven is an extremely mature, maintained, and tested dependency management ecosystem.
  - Maven already has dozens of dependency, build, packaging, and deployment management features. Why would you reinvent the wheel?
# Goals for this Project
- Just use Maven...ONLY Maven.
- No plugins.
  - Plugins are sometimes not maintained or they don't do exacly what you want.
- Avoid custom or proprietary command line tools if possible.
  - The Cognitect `clj` command line tool is great, but the Windows version has a lower priority than the versions for Mac and Linux.
  - There are a large number of consulting Java shops where Windows is the primary OS.
- Avoid 'magic' jars, e.g. jars that are built and shared for download outside a standard maven build process.
  - You might be wondering why we don't use the Windows 'magic' jar on the Clojure site.
  - This jar was designed to allow developers to try out Clojure. It's not suitable for enterpise level development where dependencies need to be tracked and validated for security and licensing.
# Open Source Software
- God bless all open source contributors and projects.
- I will **NEVER** criticize or complain about any open-source project...**EVER**!
  - Do you have any idea how expensive it is to create software?
- The Clojure maintainers (@puredanger, @richhickey and the others) are nothing short of **AWESOME!**
- I'm pretty sure most people don't know how good Clojure is.
# Maven Uses XML for Configuration 😒
- Okay - can we stop kicking XML around? Please? 
- XML gives you autocomplete in most development editors! 😲
- Using XML is consistent with all the Maven documentation and will help you avoid configuration problems.
- Creating a pom.edn feature is a **non-goal** for now but I might consider adding it in the future.
  - You can create a solution for yourself. It's certainly possible using the `exec-maven-plugin`.
# Getting Started - Prerequisites
- Install Java - https://jdk.java.net/17/
- Install Maven - https://maven.apache.org/download.cgi
- Add the above command directory locations to your user `path` (OS specific) to include the above.
  - Assume you know how to do this.
- Verify your installs:
  - `java --version`
  - `mvn --version`
# Getting Started - Using the Archetype
- Navigate to your Maven based Java projects directory.
  - You should really designate a single directory on your computer that holds maven projects. I recommend `C:/Users/<you>/Documents/Development/Java/projects` (Windows 11). If on Mac or Linux, determine the equivalent for your OS.
- Just run the following multi-line command at your OS command prompt (Wondows 11, adjust for your OS).
```
mvn archetype:generate ^
-DarchetypeGroupId=cloud.seltzer1717.clojure ^
-DarchetypeArtifactId=just-maven-clojure-archetype ^
-DarchetypeVersion=0.2-RELEASE
```
The output looks something like this (it's interactive). If you say `N` at the `<--- FINAL PROMPT --->`, you can specify all the property values, including values for dependency versions as seen below:

```
C:\Users\blah\projects>mvn archetype:generate ^
More?       -DarchetypeCatalog=local ^
More?       -DarchetypeGroupId=cloud.seltzer1717.clojure ^
More?       -DarchetypeArtifactId=just-maven-clojure-archetype ^
More?       -DarchetypeVersion=0.2-RELEASE
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1[INFO] --------------------------------[ pom ]---------------------------------
[INFO] [INFO] >>> maven-archetype-plugin:3.0.1:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO] 
[INFO] <<< maven-archetype-plugin:3.0.1:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO] 
[INFO] 
[INFO] --- maven-archetype-plugin:3.0.1:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] Archetype repository not defined. Using the one from [cloud.seltzer1717.clojure:just-maven-clojure-archetype:0.2-RELEASE] found in catalog local
Define value for property 'groupId': com.example 
Define value for property 'artifactId': jelly-donuts 
Define value for property 'version' 1.0-SNAPSHOT: : 
Define value for property 'package' com.example: : 
[INFO] Using property: clojure-version = 1.10.2
[INFO] Using property: commons-codec-version = 1.15
[INFO] Using property: core-async-version = 1.5.640
[INFO] Using property: exec-maven-version = 3.0.0
[INFO] Using property: maven-compiler-source = 17
[INFO] Using property: maven-compiler-target = 17
Confirm properties configuration:
groupId: com.example
artifactId: jelly-donuts
version: 1.0-SNAPSHOT
package: com.example
clojure-version: 1.10.2
commons-codec-version: 1.15
core-async-version: 1.5.640
exec-maven-version: 3.0.0
maven-compiler-source: 17
maven-compiler-target: 17
 Y: : Y
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: just-maven-clojure-archetype:0.2-RELEASE
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: com.example
[INFO] Parameter: artifactId, Value: jelly-donuts
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: com.example
[INFO] Parameter: packageInPathFormat, Value: com/example
[INFO] Parameter: clojure-version, Value: 1.10.2
[INFO] Parameter: package, Value: com.example
[INFO] Parameter: core-async-version, Value: 1.5.640
[INFO] Parameter: groupId, Value: com.example
[INFO] Parameter: maven-compiler-target, Value: 17
[INFO] Parameter: exec-maven-version, Value: 3.0.0
[INFO] Parameter: artifactId, Value: jelly-donuts
[INFO] Parameter: commons-codec-version, Value: 1.15
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: maven-compiler-source, Value: 17
[WARNING] The directory C:\Users\jonseltzer\Documents\development\java\projects\jelly-donuts already exists.
[INFO] Project created from Archetype in dir: C:\Users\jonseltzer\Documents\development\java\projects\jelly-donuts
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  29.943 s
[INFO] Finished at: 2021-12-31T06:49:26-08:00
[INFO] ------------------------------------------------------------------------
```
The following directory structure is created for you `jelly-donuts` (the `artifactId` you specified) project:
```
jelly-donuts
|   clj.bat
|   pom.xml
|
+---.clojure
|   |
|   \---scripts
|           compile.clj
|           test.clj
|
\---src
    +---main
    |   +---clojure
    |   |   \---com
    |   |       \---example
    |   |               core.cljs
    |   |
    |   \---resources
    |           required_for_test.txt
    |
    \---test
        +---Clojure
        |   \---com
        |       \---example
        |               core_test.cljs
        |               test_suite.cljs
        |
        \---resources
                required_for_test.txt
```
# Compiling, Testing, and Running Clojure
Maven is initiated with the `mvn` CLI command.
Navigate to your artifactId folder (e.g. cranberry-fizzy-juice)
## Starting a Clojure REPL
- `mvn exec:java@clj`
## Compiling Clojure source main
- `mvn exec:java@clj-compile`
## Running Clojure tests
- `mvn exec:java@clj-test`
## Maven Can Be Verbose - Running Maven in 'quiet' Mode
- `mvn -q exec:java@clj`
- `mvn -q exec:java@clj-compile`
- `mvn -q exec:java@clj-test`
## Execution as Part of Maven Lifecycle
- `mvn clean install`
  - Cleans (removes `target` folder)
  - Compiles source main code
  - Compiles source test code
  - Runs tests
  - installs (does nothing - see AWS Lambda archetype (coming soon) for creating output artifacts)
  - Can also run 'quietly' `mvn -q clean install`
## Too Many Key Strokes
- Create shell scripts
- `clj.bat` starts a Clojure REPL
- Create your own.
# How it Works - Project Directory Structure, Config, Scripts, and `pom.xml`
## Exec Maven Plugin
- The `exec-maven-plugin` let's you run java code in the same thread as the regular Maven JVM process (`mvn ...`).
## The `.clojure` Directory
- `scripts` directory
  - There are 2 scripts initially. The first (`compile.clj`) is compiles Clojure source files. The second (`test.clj`) runs the test suite.
  - You can create your own as needed although you'll find it's better just to use these and create `exec:java` `executions` in the `pom.xml`.
    - There are occaisions when you'll want to create your own script.
## Let's Look at the `compile.clj` Script
```
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
                 (if (or (.endsWith string-path ".clj")
                         (.endsWith string-path ".cljc"))
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
```
- This Clojure script file compiles all the Clojure source files. It does a recursive visit of each source file, then `compile`s the namespace.
- The test.clj script file also recursively visits each test file and executes the tests for each test namespace.
## Let's Look at the `pom.xml` File
```
<?xml version="1.0" encoding="UTF-8" ?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.example</groupId>
  <artifactId>jelly-donuts</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>pom</packaging>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <clojure.version>1.10.2</clojure.version>
    <exec.maven.version>3.0.0</exec.maven.version>
    <commons-codec.version>1.15</commons-codec.version>
    <core.async.version>1.5.640</core.async.version>
    <clojure.scripts.dir>.clojure/scripts</clojure.scripts.dir>
    <clojure.opts.dir>.clojure/opts</clojure.opts.dir>
    <clojure.source.dir>src/main/clojure</clojure.source.dir>
    <clojure.test.dir>src/test/clojure</clojure.test.dir>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>clojure</artifactId>
      <version>${clojure.version}</version>
    </dependency>
  </dependencies>

  <repositories>
    <repository>
      <id>clojars.org</id>
      <url>https://repo.clojars.org</url>
    </repository>
  </repositories>

  <build>
    <sourceDirectory>${basedir}/${clojure.source.dir}</sourceDirectory>
    <testSourceDirectory>${basedir}/${clojure.test.dir}</testSourceDirectory>
    <pluginManagement>
      <plugins>
        <plugin>
          <groupId>org.codehaus.mojo</groupId>
          <artifactId>exec-maven-plugin</artifactId>
          <version>${exec.maven.version}</version>
          <configuration>
            <mainClass>clojure.main</mainClass>
          </configuration>
        </plugin>
      </plugins>
    </pluginManagement>
    <plugins>
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <executions>
          <execution>
            <id>clj</id>
            <configuration>
              <systemProperties>
                <systemProperty>
                  <key>clojure.compile.path</key>
                  <value>${project.build.outputDirectory}</value>
                </systemProperty>
                <systemProperty>
                  <key>maven.source.dir</key>
                  <value>${project.build.sourceDirectory}</value>
                </systemProperty>
              </systemProperties>
              <additionalClasspathElements>
                <additionalClasspathElement>${project.build.sourceDirectory}</additionalClasspathElement>
                <additionalClasspathElement>${project.basedir}</additionalClasspathElement>
              </additionalClasspathElements>
              <commandlineArgs>${clojure.args}</commandlineArgs>
            </configuration>
            <goals>
              <goal>java</goal>
            </goals>
          </execution>
          <execution>
            <?m2e ignore?>
            <id>clj-compile</id>
            <phase>compile</phase>
            <configuration>
              <systemProperties>
                <systemProperty>
                  <key>clojure.compile.path</key>
                  <value>${project.build.outputDirectory}</value>
                </systemProperty>
                <systemProperty>
                  <key>maven.source.dir</key>
                  <value>${project.build.sourceDirectory}</value>
                </systemProperty>
              </systemProperties>
              <additionalClasspathElements>
                <additionalClasspathElement>${project.build.sourceDirectory}</additionalClasspathElement>
                <additionalClasspathElement>${project.build.testSourceDirectory}</additionalClasspathElement>
                <additionalClasspathElement>${project.basedir}</additionalClasspathElement>
              </additionalClasspathElements>
              <arguments>
                <param>.clojure/scripts/compile.clj</param>
              </arguments>
            </configuration>
            <goals>
              <goal>java</goal>
            </goals>
          </execution>
          <execution>
            <?m2e ignore?>
            <id>clj-test</id>
            <phase>test</phase>
            <configuration>
              <mainClass>clojure.main</mainClass>
              <systemProperties>
                <systemProperty>
                  <key>clojure.compile.path</key>
                  <value>${project.build.testOutputDirectory}</value>
                </systemProperty>
                <systemProperty>
                  <key>maven.test.dir</key>
                  <value>${project.build.testSourceDirectory}</value>
                </systemProperty>
              </systemProperties>
              <additionalClasspathElements>
                <additionalClasspathElement>${project.build.sourceDirectory}</additionalClasspathElement>
                <additionalClasspathElement>${project.build.testSourceDirectory}</additionalClasspathElement>
                <additionalClasspathElement>${project.basedir}</additionalClasspathElement>
              </additionalClasspathElements>
              <arguments>
                <param>.clojure/scripts/test.clj</param>
              </arguments>
            </configuration>
            <goals>
              <goal>java</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>

</project>
```
- This is just a standard Maven project.
- We have the standard Maven coordinates.
  - `groupId`
  - `artifactId`
  - `version`
- Packaging is `jar` just like a normal Java project. `pom` packaging allows us to create Clojure packaging during the Maven project lifecycle.
- Almost everything is defined as a property in the `properties` section. This makes it easier to change `version`s, paths, main namespaces in one place, rather than having to search the entire `pom.xml` file to make an update.
- The `dependencies` start with Clojure.
- Then `core.async` to support asynchronous JavaScript.
## The Maven `build` Section
- `pluginManagement` is generally only needed if you'll use the `pom.xml` file as a parent pom for another project or `plugins` section of current pom.
  - It defines the coordinates for the  build plugins that will be used, including the `version`s, but does not have the specific build `configurations` that we'll discuss below.
  - Note we have the `exec-maven-plugin` that makes the `archetype` possible. More below.
- The `plugins` section appears, initially, to be a copy of what is in the `pluginManagement` section but it's not. In the `plugins` section we'll provide more detail for builds, tests, and packaging.
## The `exec-maven-plugin` Plugin
- It allows projects to leverage their own `compile`, `test`, `packaging`, and `deployment` actions (or phases). Phases are how Maven defines project activities. See https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html for more about the Maven Build Lifecycle.
- The plugin defines a set of `executions` which can be called directly or associated to a Maven build phase.
- An `execution` can have an `id` which names the `execution` for the Maven's command line or a `phase` can be added which is triggered by the Maven lifecycle.
- The `<?m2e ignore?>` empty tag tells the m2 eclipse plugin to ignore the phases.
- The `configuration` sections configure the execution including classpath, system properties, command line arguments and more.
- The `exec-maven-plugin` has two possible `goals`, `java` or `exec`. We use the `jova` goal only in this project. It allows us to execute our own Java code as part of the Maven build process. The `exec` plugin let's you execute any arbitrary program in a separate process.
- You can review the details of the `exec-maven-plugin` here https://www.mojohaus.org/exec-maven-plugin/.
## The `clj` Execution
- This execution is purely for initiating Clojure. In fact, if executed directly, will start a Clojure, REPL as that's the default for `clojure.main`.
  - `clojure.main` is the code that runs for all the executions.
- In this case we're just adding the Clojure source directory to the classpath.
  - The `exec-maven-plugin` will automatically add the source main, source test, source main output, and source test output folders to the classpath.
- The `commandlineArgs` element allows this execution to use clojure.main with arguments from the maven command line, perhaps passed in a batch (shell) scrip.
## The `clj-compile` Execution
- Ths execution just compiles the Clojure source code.
## The `clj-test` Execution
- This execution executes all the test namespaces.
# General Archetype for `node` Projects
- This archetype is create a vanilla Clojure library project.
- There are other cloud.seltzer1717 archetypes you might find useful:
  - `just-maven-clojurescript-archetype` for ClojureScript projects
- The idea is for **YOU** to customize your own `pom.xml` file in a way that best suites your needs.

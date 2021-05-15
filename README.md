# A Color API written in Java

This is a very basic sample project with Java/ant to use with
[go-crzy/crzy](https://github.com/go-crzy/crzy). To test the project, run:

```bash
export JUNIT5_REPO=https://repo1.maven.org/maven2/org/junit
cd lib
curl -LO ${JUNIT5_REPO}/platform/junit-platform-console-standalone/1.7.2/junit-platform-console-standalone-1.7.2-all.jar

```

To build the project, run:

```bash
javac color.java
jar cvmf color.mf color.jar *.class
```

To run the project, run:

```bash
export ADDR=localhost:8080
java -jar color.jar
```


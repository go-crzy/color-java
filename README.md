# A Color API written in Java

This is a sample project that implement the Color API with Java/ant. It
is useful to demonstrate [go-crzy/crzy](https://github.com/go-crzy/crzy). To
test the project,we assume you have the Java SDK 11+ and Ant 1.10.06+. 

Start by downloading the JUnit 5 console:

```bash
ant download
```

To test the project, run:

```bash
ant test
```

To build the project, run 

```bash
ant jar
```

The artifact is named color.jar and is located in the `build/jar` directory.
To use it, simply run:

```
export PORT=8080
java -jar color.jar
```

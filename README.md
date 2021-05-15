# A Color API written in Java

This is a very basic sample project with Java/ant to use with
[go-crzy/crzy](https://github.com/go-crzy/crzy). To test the project, run:

```bash
export JUNIT5_REPO=https://repo1.maven.org/maven2/org/junit
cd lib
curl -LO ${JUNIT5_REPO}/platform/junit-platform-console-standalone/1.7.2/junit-platform-console-standalone-1.7.2-all.jar

java -jar junit-platform-console-standalone-1.7.2-all.jar -cp . --scan-classpath

Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Jupiter ✔
│  └─ Color API tests ✔
│     └─ Check the webserver succeed ✔
└─ JUnit Vintage ✔

Test run finished after 105 ms
[         3 containers found      ]
[         0 containers skipped    ]
[         3 containers started    ]
[         0 containers aborted    ]
[         3 containers successful ]
[         0 containers failed     ]
[         1 tests found           ]
[         0 tests skipped         ]
[         1 tests started         ]
[         0 tests aborted         ]
[         1 tests successful      ]
[         0 tests failed          ]
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


# ci-jenkins-multi-build-demo

Small Java app used for the Jenkins CI lab (Maven / Ant / Gradle builds).

## Build & run

**Maven**
```
mvn -B clean verify
java -cp target\ci-jenkins-demo-1.0.0.jar com.vit.demo.App
```

**Ant**
```
ant build
java -jar ant-build\dist\ci-jenkins-demo-1.0.0.jar
```

**Gradle**
```
gradle clean build
java -cp build\libs\ci-jenkins-demo-1.0.0.jar com.vit.demo.App
```

Expected output:
```
Continuous Integration demo is running.
2 + 3 = 5
```

## Test

`AppTest` (in `src/test/java`) checks that `App.add(2, 3)` returns `5`.
Change `expected` in `AppTest.java` to `6` to see a failing build, then
change it back to `5` to see it pass again.

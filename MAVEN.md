# Continuous Integration

## Learning Objectives
- [ ] Understanding Maven and its usage
- [ ] Familiarity with pom.xml and its significance
- [ ] Creating a minimal pom.xml for Java 21
- [ ] Important Maven goals and their significance
- [ ] Understanding what Continuous Integration (CI) is and why it is important
- [ ] Getting acquainted with GitHub Actions pipeline and YAML file format
- [ ] Introduction to the concept of automated build and test processes with CI
- [ ] Basics of Maven build tool and integration of JUnit 5 tests

## What is Maven?
Maven is a powerful build management tool for Java projects. It simplifies the build process, dependency management, and project structure.

## The pom.xml
The `pom.xml` is the heart of a Maven project. It contains all the configuration information and project description. It is also where dependencies to other libraries are defined.

```xml
<!-- Beispiel einer minimalen pom.xml für Java 21 -->
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>mein-projekt</artifactId>
    <version>1.0-SNAPSHOT</version>
    <properties>
        <maven.compiler.source>23</maven.compiler.source>
        <maven.compiler.target>23</maven.compiler.target>
    </properties>
</project>
```

## Key Maven Goals
- `clean`: Deletes compiled files and directories.
- `compile`: Compiles the project's source code.
- `test`: Executes tests in the project.
- `package`: Creates the package (e.g., JAR file) of the project.
- `install`: Installs the package in the local Maven repository.
- `deploy`: Publishes the package to a remote repository.

> 💡 Tip: Maven can do much more, such as generating reports or creating documentation. Explore these possibilities to improve your development processes.

## What is Continuous Integration (CI)?
Continuous Integration (CI) is a development approach where developers continuously integrate their code changes into a shared repository. Automated build and test processes are executed to ensure that the code remains functional and stable. The benefits of CI include faster error detection, better code quality, and more efficient collaboration within the development team.

## Why is Continuous Integration important?
- Fast error detection: Automated builds and tests help in early detection of errors, leading to quicker fixes.
- Stable codebase: CI ensures that the codebase is always functional, speeding up the development time.
- Efficient collaboration: CI promotes collaboration within the team, as each developer regularly integrates their changes and receives feedback from other team members.

## GitHub Actions Pipeline with YAML File Format
GitHub Actions is a CI/CD tool provided by GitHub that allows us to create automated workflows for our repository. The workflow definition is done in a YAML file. An example of a simple build pipeline:

```yaml
on: push
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with:
          java-version: "23"
          distribution: "temurin"
          cache: 'maven'
      - run: mvn package --batch-mode
```

In this example, the code is built every time there is a push to the repository. It uses an Ubuntu runtime environment, sets up JDK 21, and uses the Maven build tool to build the project.

> 💡 Note: Workflow definitions can be more complex and include other actions such as testing, code analysis, or deployment.

## Maven Build Tool and JUnit 5 Tests
Maven is a widely used build tool in the Java world. It automates the build process and manages dependencies. To execute JUnit 5 tests in our project, we need to configure the `maven-surefire-plugin` in our `pom.xml`. Otherwise GitHub will fall back to an older version of the plugin, which is not compatible with the current Java version.

```xml
<build>
    <plugins>
        <plugin>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.2.5</version>
        </plugin>
    </plugins>
</build>
```

With this configuration, Maven executes the JUnit 5 tests present in the project.

## Resources
- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Maven Documentation](https://maven.apache.org/guides/index.html)
- [Maven vs Gradle](https://www.geeksforgeeks.org/difference-between-gradle-and-maven/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
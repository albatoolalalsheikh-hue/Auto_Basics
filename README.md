# Basics Track Demo

A small beginner-friendly Java project (Maven + TestNG) that demonstrates the Basics track.

| Topic | Where to look |
|---|---|
| Java syntax and methods | `Calculator.java` (variables, if/else, methods, return values) |
| OOP | `Person.java`, `Student.java` (constructor, encapsulation, inheritance, polymorphism) |
| Collections | `GradeBook.java` (List, Set, Map) |
| Exception handling | `Calculator.divide` / `safeDivide` (throw, try/catch) |
| Maven | `pom.xml` (TestNG dependency, Surefire plugin) |
| TestNG + DataProvider | `src/test/java/...` and `testng.xml` |
| Git | Small commits, `.gitignore`, pushed to a remote repository |

## Run

```bash
mvn test                                  # run all tests
mvn compile exec:java -Dexec.mainClass=com.demo.basics.App   # optional: run the demo
```

Requires Java 17+ and Maven 3.8+.

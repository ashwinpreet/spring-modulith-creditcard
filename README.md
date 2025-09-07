# Spring Modulith Credit Card Application

This project demonstrates the [Spring Modulith](https://moduliths.org/) concept in a modular monolith Java application.

## Modules

- **Application Submission**: Users submit a credit card application.
- **Decision Making**: Processes the application and decides approval.
- **Notification**: Notifies the user of the result.

Modules communicate via Spring domain events.

## How to Run

1. Build the project:
   ```sh
   mvn clean install
   ```
2. Run the application:
   ```sh
   mvn spring-boot:run
   ```
3. Submit a credit card application via the REST endpoint:
   ```sh
   curl -X POST http://localhost:8080/application/submit -H 'Content-Type: application/json' -d '{"name":"John Doe","income":50000}'
   ```

## Requirements
- Java 17+
- Maven 3.8+

## Structure
- `com.example.application` — Application Submission module
- `com.example.decision` — Decision Making module
- `com.example.notification` — Notification module

---

## Module Dependency Verification

Unit tests are provided to verify the dependencies between modules using Spring Modulith's API. To run the tests:

```sh
mvn test -Dtest=ModuleDependencyTest
```

This will check that:
- All expected modules are present
- Application module depends on Decision
- Decision module depends on Notification
- Notification module has no dependencies

## Module Structure UML Diagram

A UML diagram describing the module dependencies is available in [docs/module-structure.puml](docs/module-structure.puml). You can render this PlantUML file using any PlantUML tool or plugin, for example:

- [PlantUML Online Server](https://www.plantuml.com/plantuml/)
- IntelliJ IDEA PlantUML integration

![Module Structure UML](docs/module-structure.puml)

This project is for demonstration purposes only.

# Spring Modulith Starter Guide

This guide will help you get started with the Spring Modulith Credit Card Application project. It covers the basics of the modular monolith approach, project structure, running the application, and verifying module boundaries.

---

## What is Spring Modulith?
Spring Modulith is an extension for Spring Boot that helps you build modular monolith applications. It encourages clear boundaries between modules and provides tooling to verify and visualize dependencies.

---

## Project Structure

- **com.example.application** — Application Submission module
- **com.example.decision** — Decision Making module
- **com.example.notification** — Notification module

Modules communicate via Spring domain events.

---

## Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+

### Build the Project
```sh
mvn clean install
```

### Run the Application
```sh
mvn spring-boot:run
```

### Submit a Credit Card Application
```sh
curl -X POST http://localhost:8080/application/submit -H 'Content-Type: application/json' -d '{"name":"John Doe","income":50000}'
```

---

## Verifying Module Boundaries

Spring Modulith provides APIs to verify that modules are well-structured and only depend on allowed modules. This project includes unit tests for module dependencies:

```sh
mvn test -Dtest=ModuleDependencyTest
```

---

## Visualizing Module Structure

A UML diagram describing module dependencies is provided in [docs/module-structure.puml](module-structure.puml). You can render it using PlantUML tools or plugins.

---

## Useful Links
- [Spring Modulith Documentation](https://docs.spring.io/spring-modulith/docs/current/reference/html/)
- [Spring Modulith GitHub](https://github.com/spring-projects/spring-modulith)
- [PlantUML Online Server](https://www.plantuml.com/plantuml/)

---

## Next Steps
- Explore the code in each module
- Add new modules or features
- Use Spring Modulith’s tooling to enforce boundaries as your application grows

---

Happy coding!

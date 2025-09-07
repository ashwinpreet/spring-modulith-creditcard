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

This project is for demonstration purposes only.

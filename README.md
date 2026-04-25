<div align="center">

## Arquitectura Centrada En Negocio (ARCN)
Labs repository for this subject
By Andres Felipe Chavarro Plazas

</div>

<br>

## About

This repository contains the practical laboratories for the **Arquitectura Centrada En Negocio (ARCN)** course at Escuela Colombiana de Ingenieria. The course focuses on code quality standards and how they are reflected in software architecture — covering methodologies such as TDD, BDD, SOLID principles, and microservice design, with the goal of building maintainable, well-structured systems aligned with business needs.

<br>

## Labs

### [solid-principles-lab](./solid-principles-lab)
Hands-on refactoring exercises that demonstrate each of the five SOLID principles in Java. Starting from problematic, tightly coupled code, each exercise walks through the solution step by step — separating responsibilities, opening classes for extension without modification, substituting implementations safely, and keeping interfaces and dependencies lean.

<br>

### [tdd-lab](./tdd-lab)
Introduction to Test-Driven Development through the classic FizzBuzz problem. The lab follows the Red-Green-Refactor cycle strictly: write a failing test first, implement just enough code to make it pass, then clean up. The goal is to internalize TDD as a design discipline, not just a testing strategy.

<br>

### [bdd-lab](./bdd-lab)
First part of the Behavior-Driven Development series using Cucumber and Selenium WebDriver. Covers project setup, Gherkin syntax for writing human-readable scenarios, and the wiring between feature files and step definitions to automate UI behavior tests from the ground up.

<br>

### [bdd-feature-lab](./bdd-feature-lab)
Second part of the BDD series, focused on structuring test code for real-world UI automation. Applies the Page Object Model with the Page Factory pattern to separate test logic from page interaction details, making the test suite easier to read, maintain, and extend as the application evolves.

<br>

### [microservice-lab](./microservice-lab)
End-to-end walkthrough of creating, containerizing, and deploying a minimal REST microservice using Spring Boot and Docker. The lab goes from scaffolding a project with Spring Initializr, adding a REST endpoint, packaging the application into a Docker image, and running it in a cloud environment via Play with Docker.

<br>
<br>

## Final project - MediSync
Final project for the ARCN course. A full-stack medical appointment management system built with event-driven microservices, applying Hexagonal Architecture (Ports and Adapters) with Domain-Driven Design principles across all services.

The system is composed of four NestJS backend services behind an API Gateway, a React frontend, PostgreSQL for persistence, and RabbitMQ for asynchronous event-based communication between services. Key highlights include:

- **Hexagonal Architecture** — each microservice follows the domain/application/infrastructure/presentation layer structure with clear dependency inversion (ports and adapters pattern)
- **Event-driven design** — services publish domain events to a RabbitMQ topic exchange and consume events from other services to maintain eventual consistency
- **Clean separation of concerns** — domain layer has zero external dependencies; infrastructure adapters implement port interfaces without coupling to domain internals
- **Comprehensive testing** — unit, integration, and e2e tests with 80%+ coverage enforced via SonarCloud quality gates
- **CI/CD pipeline** — GitHub Actions builds, tests, and deploys each service independently to Railway (backend) and Vercel (frontend)

**Architecture:**

```
React App  ──►  API Gateway (3000)
                    │
          ┌─────────┼──────────────┐
          ▼         ▼              ▼
  patient-service  doctor-service  appointments-service
      (3002)          (3003)            (3004)
          │              │                  │
          └──────────────┴──────────────────┘
                         │
                    RabbitMQ
               (topic exchange)
                         │
                    PostgreSQL
               (shared instance,
               one schema per service)
```

**Authors:** Andres Chavarro, Jesus Pinzon, Laura Rodriguez, Sergio Bejarano

**Documentation:**

- Full backend specs: [project/README.md](./project/README.md)
- Appointments service: [project/services/appointments-service/README.md](./project/services/appointments-service/README.md)
- Doctor service: [project/services/doctor-service/README.md](./project/services/doctor-service/README.md)
- Frontend: [project/services/medi-sync-frontend/README.md](./project/services/medi-sync-frontend/README.md)

<br>

## Course Reference

[https://eci-arcn.github.io/Labs/](https://eci-arcn.github.io/Labs/)

<br>

## License

This project is licensed under the [GNU General Public License v3.0](./LICENSE) — you are free to use, modify, and distribute this code, provided that any derivative work is also distributed under the same license.

<div align="center">

## Arquitectura Centrada En Negocio (ARCN)
Labs repository for this subject
By Andres Felipe Chavarro Plazas

</div>

<br>

## About

This repository contains the practical laboratories and the final project for the **Arquitectura Centrada En Negocio (ARCN)** course at Escuela Colombiana de Ingeniería. The course focuses on code quality standards and how they are reflected in software architecture — covering methodologies such as TDD, BDD, SOLID principles, and microservice design, with the goal of building maintainable, well-structured systems aligned with business needs.

<br>

---

## 🏥 Final Project — MediSync

> **MediSync** is an event-driven microservices backend for managing medical appointments.
> Patients can schedule consultations with specialist doctors, choose available time slots,
> and receive automated email confirmations — all powered by a clean, domain-centric architecture.

**Authors:** Andrés Chavarro · Jesús Pinzón · Laura Rodríguez · Sergio Bejarano

[![Node.js](https://img.shields.io/badge/Node.js-20_LTS-339933?logo=node.js)](https://nodejs.org/)
[![NestJS](https://img.shields.io/badge/NestJS-11-E0234E?logo=nestjs)](https://nestjs.com/)
[![TypeScript](https://img.shields.io/badge/TypeScript-5-3178C6?logo=typescript)](https://www.typescriptlang.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-336791?logo=postgresql)](https://www.postgresql.org/)
[![RabbitMQ](https://img.shields.io/badge/RabbitMQ-3.13-FF6600?logo=rabbitmq)](https://www.rabbitmq.com/)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](LICENSE)

### Architecture Overview

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

### Tech Stack

| Layer | Technology |
|---|---|
| **Backend** | NestJS 11, TypeScript 5, TypeORM |
| **Frontend** | React 18, Vite 5, Tailwind CSS, Redux Toolkit |
| **Database** | PostgreSQL 16 |
| **Messaging** | RabbitMQ 3.13 (topic exchange) |
| **Containerisation** | Docker, Docker Compose |
| **CI/CD** | GitHub Actions → Railway (backend) + Vercel (frontend) |
| **Static Analysis** | SonarCloud |
| **Testing** | Jest + Supertest (backend), Vitest (frontend) |

### Key Features

- **Hexagonal Architecture (Ports & Adapters)** with Domain-Driven Design in each microservice
- **Event-driven microservices** — services communicate asynchronously via RabbitMQ domain events
- **Clean separation** — domain logic has zero external dependencies; infrastructure adapts to ports
- **80%+ test coverage** enforced via SonarCloud quality gates
- **Multi-service deployment** on Railway with isolated PostgreSQL schemas per service

### Services

| Service | Port | Responsibility |
|---|---|---|
| `api-gateway` | 3000 | Single HTTP entry point — proxies to downstream services |
| `patient-service` | 3002 | Patient CRUD; publishes `event.patient.registered` |
| `doctor-service` | 3003 | Doctor/specialty/schedule CRUD; publishes `event.doctor.profile-created` |
| `appointments-service` | 3004 | Appointment lifecycle + email confirmations |
| `medi-sync-frontend` | 5173 | React SPA for patients to book appointments |

### Documentation

- **Backend specs:** [`project/services/appointments-service/README.md`](project/services/appointments-service/README.md) and [`project/services/doctor-service/README.md`](project/services/doctor-service/README.md)
- **Frontend docs:** [`project/services/medi-sync-frontend/README.md`](project/services/medi-sync-frontend/README.md)
- **Full backend README:** [`project/README.md`](project/README.md)

### Quick Start

```bash
# 1. Navigate to project directory
cd project

# 2. Start all infrastructure and services
docker compose up --build

# Services will be available at:
# - API Gateway:     http://localhost:3000
# - Patient Service: http://localhost:3002
# - Doctor Service:  http://localhost:3003
# - Appointments:    http://localhost:3004
# - Frontend:        http://localhost:5173
```

---

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

## Course Reference

[https://eci-arcn.github.io/Labs/](https://eci-arcn.github.io/Labs/)

<br>

## License

This project is licensed under the [GNU General Public License v3.0](./LICENSE) — you are free to use, modify, and distribute this code, provided that any derivative work is also distributed under the same license.

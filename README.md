<div align="center">

## Arquitectura Centrada En Negocio (ARCN)
Labs repository — Escuela Colombiana de Ingeniería
By Andres Felipe Chavarro Plazas

</div>

<br>

## About

This repository contains the practical laboratories for the **Arquitectura Centrada En Negocio (ARCN)** course at Escuela Colombiana de Ingeniería. The course focuses on code quality standards and how they are reflected in software architecture — covering methodologies such as TDD, BDD, SOLID principles, and microservice design, with the goal of building maintainable, well-structured systems aligned with business needs.

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

## Course Reference

[https://eci-arcn.github.io/Labs/](https://eci-arcn.github.io/Labs/)

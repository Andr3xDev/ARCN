<div align="center">

## SOLID Principles Lab
A practical implementation of the five SOLID principles in Java

</div>

<br>
<br>

## Description

This laboratory demonstrates the implementation of the five SOLID principles through simple, practical examples. Each principle has been refactored from problematic code to clean, maintainable solutions following best practices.

<br>

## Exercises

### 1. Single Responsibility Principle (SRP)

**Problem**: The `Invoice` class had multiple responsibilities (calculation, printing, and persistence).

**Solution**: Separated into three classes:
- `Invoice` - manages invoice data and calculations
- `InvoicePrinter` - handles printing logic
- `InvoiceRepository` - manages database persistence

**Design Patterns**: Repository Pattern, Separation of Concerns

<br>

### 2. Open/Closed Principle (OCP)

**Problem**: The `DiscountCalculator` class required modification to add new discount types.

**Solution**: Created the `DiscountStrategy` interface with implementations:
- `RegularDiscount` - 10% discount
- `VIPDiscount` - 20% discount

**Design Patterns**: Strategy Pattern, Polymorphism

<br>

### 3. Liskov Substitution Principle (LSP)

**Problem**: `ElectricCar` threw exceptions when calling `refuel()`.

**Solution**: Segregated interfaces:
- `Vehicle` - common driving behavior
- `Refuelable` - for gas vehicles
- `Rechargeable` - for electric vehicles

**Design Patterns**: Interface Segregation, Composition over Inheritance

<br>

### 4. Interface Segregation Principle (ISP)

**Problem**: The `Worker` interface forced implementations to define unnecessary methods.

**Solution**: Split into specific interfaces:
- `Workable` - for entities that can work
- `Eatable` - for entities that can eat

**Design Patterns**: Interface Segregation, Role Interfaces

<br>

### 5. Dependency Inversion Principle (DIP)

**Problem**: `OrderProcessor` was tightly coupled to `MySQLDatabase`.

**Solution**: Created the `Database` interface with implementations:
- `MySQLDatabase`
- `PostgreSQLDatabase`

The `OrderProcessor` now depends on the abstraction via constructor injection.

**Design Patterns**: Dependency Injection, Inversion of Control

<br>
<br>

## Testing

All SOLID principles have been validated with unit tests. The test suite includes 11 tests that verify real behavior and state changes.

Run tests with:
```bash
mvn test
```

<br>
<br>

## Requirements & Setup

> **Note**: This project uses DevContainer configuration, ensuring it works consistently across different development environments without manual setup.

### Prerequisites
- Java 21
- Maven 3.x

### Running the Project

**Compile:**
```bash
mvn compile
```

**Run individual demos:**
```bash
java -cp target/classes escuelaing.arcn.solid.srp.SRPDemo
java -cp target/classes escuelaing.arcn.solid.ocp.OCPDemo
java -cp target/classes escuelaing.arcn.solid.lsp.LSPDemo
java -cp target/classes escuelaing.arcn.solid.isp.ISPDemo
java -cp target/classes escuelaing.arcn.solid.dip.DIPDemo
```

**Run tests:**
```bash
mvn test
```

<br>
<br>

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](../LICENSE) for details.
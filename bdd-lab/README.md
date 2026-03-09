# Laboratorio BDD con Cucumber y Selenium


## Descripción

Este laboratorio implementa pruebas automatizadas usando **Behavior Driven Development (BDD)** con Cucumber y Selenium WebDriver. El proyecto está dividido en dos partes principales que demuestran el flujo completo de desarrollo orientado a comportamiento.

---

## Parte 1: Configuración Inicial y Primer Escenario

En esta primera parte se establece la estructura base del proyecto BDD y se implementa un escenario de prueba básico para validar la configuración.

### Objetivos de la Parte 1

- Configurar el proyecto Maven con las dependencias de Selenium y Cucumber
- Crear la estructura de carpetas para BDD (features, steps, runners)
- Implementar un escenario de prueba simple
- Generar reportes en múltiples formatos (HTML, JSON, JUnit)

### Estructura del Proyecto

```
bdd-lab/
├── src/
│   ├── main/java/
│   └── test/java/
│       ├── features/          # Archivos .feature con escenarios Gherkin
│       ├── steps/             # Step Definitions (implementación de pasos)
│       └── runners/           # Test Runners de Cucumber
├── pom.xml
└── README.md
```

### Tecnologías Utilizadas

- **Java 21**
- **Maven** - Gestión de dependencias y construcción
- **Selenium WebDriver 4.0.0** - Automatización de navegador
- **Cucumber 7.0.0** - Framework BDD
- **JUnit 4** - Framework de pruebas
- **ChromeDriver** - Driver para automatización de Chrome

### Escenario de Prueba

Se implementó un escenario básico de búsqueda en Google para validar la configuración:

**Feature:** Google Search  
**Escenario:** Búsqueda de un término  

*[Insertar captura del archivo .feature]*

### Ejecución de Pruebas

Las pruebas se ejecutan mediante Maven:

```bash
mvn test
```

### Resultados

*[Insertar captura de la consola mostrando BUILD SUCCESS]*

### Reportes Generados

El proyecto genera tres tipos de reportes después de cada ejecución:

#### Reporte HTML
Ubicación: `target/HtmlReports/report.html`

*[Insertar captura del reporte HTML de Cucumber]*

#### Reporte JSON
Ubicación: `target/JSonReports/report.json`

*[Insertar descripción o captura del reporte JSON]*

#### Reporte JUnit XML
Ubicación: `target/JUnitReports/report.xml`

*[Insertar descripción o captura del reporte XML]*

---

## Parte 2: [Pendiente]

*Esta sección se completará en la segunda parte del laboratorio*

### Objetivos de la Parte 2

*[Por completar]*

### Nuevos Escenarios

*[Por completar]*

### Resultados y Análisis

*[Por completar]*

---

## Conclusiones

*[Por completar al finalizar ambas partes]*

---

## Referencias

- [Cucumber Documentation](https://cucumber.io/docs/cucumber/)
- [Selenium WebDriver Documentation](https://www.selenium.dev/documentation/)
- [Gherkin Syntax](https://cucumber.io/docs/gherkin/)

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
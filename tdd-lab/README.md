<div align="center">

## TDD Laboratory - FizzBuzz
Test-Driven Development practice
By Andres Felipe Chavarro Plazas

</div>

<br>

## Description

This laboratory demonstrates the Test-Driven Development (TDD) methodology through the classic FizzBuzz problem. The project follows the Red-Green-Refactor cycle to build robust, well-tested code.

<br>

## What is TDD?

Test-Driven Development is a software development approach where tests are written before the actual implementation code. The process follows three steps:

### 1. RED - Write a Failing Test
- Write a test that describes the desired behavior
- Run the test and watch it fail (because the functionality doesn't exist yet)
- This failure confirms the test is actually testing something

### 2. GREEN - Make the Test Pass
- Write the minimum amount of code necessary to make the test pass
- Focus only on making the test work, not on writing perfect code
- Run the test again to verify it passes

### 3. REFACTOR - Improve the Code
- Clean up the code while keeping all tests passing
- Remove duplication, improve naming, and enhance readability
- Run tests frequently to ensure nothing breaks during refactoring

### Why TDD?

- **Tests First**: Forces you to think about requirements before coding
- **Living Documentation**: Tests document how the code should behave
- **Confidence**: Refactor safely knowing tests will catch regressions
- **Better Design**: Writing testable code leads to better architecture
- **Debugging**: When a test fails, you know exactly what broke

<br>

## The FizzBuzz Problem

Write a function that takes an integer and returns:
- "Fizz" for multiples of 3
- "Buzz" for multiples of 5
- "FizzBuzz" for multiples of both 3 and 5 (i.e., multiples of 15)
- The number as a string for all other cases

<br>

## How This Lab Was Built Using TDD

### Iteration 1: Return the number
**Test**: Input 1 should return "1"
```java
assertEquals("1", FizzBuzz.fizzbuzz(1));
```
**Implementation**: Return the number as a string
```java
return String.valueOf(n);
```

### Iteration 2: Handle multiples of 3
**Test**: Input 3 should return "Fizz"
```java
assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
```
**Implementation**: Add conditional for multiples of 3
```java
if (n % 3 == 0) return "Fizz";
else return String.valueOf(n);
```

### Iteration 3: Handle multiples of 5
**Test**: Input 5 should return "Buzz"
```java
assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
```
**Implementation**: Add conditional for multiples of 5
```java
if (n % 3 == 0) return "Fizz";
else if (n % 5 == 0) return "Buzz";
else return String.valueOf(n);
```

### Iteration 4: Handle multiples of both
**Test**: Input 15 should return "FizzBuzz"
```java
assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
```
**Implementation**: Check for multiples of 15 first
```java
if (n % 15 == 0) return "FizzBuzz";
else if (n % 3 == 0) return "Fizz";
else if (n % 5 == 0) return "Buzz";
else return String.valueOf(n);
```

### Iteration 5: Refactor and add edge cases
Add tests for edge cases (0, large numbers) and multiple examples to ensure robustness.

<br>

## Test Suite

The project includes 10 comprehensive tests following the AAA pattern (Arrange-Act-Assert):

**Test Structure:**
```java
@Test
void testName() {
    // Arrange: Set up test data
    int input = 3;
    
    // Act: Execute the functionality
    String result = FizzBuzz.fizzbuzz(input);
    
    // Assert: Verify the result
    assertEquals("Fizz", result);
}
```

**Test Coverage:**
1. Regular numbers (1, 2)
2. Multiples of 3 (3, 9)
3. Multiples of 5 (5, 10)
4. Multiples of both 3 and 5 (15, 30)
5. Edge case: zero (0)
6. Sequence validation (1-15)

<br>

## Project Structure

```
tdd-lab/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── escuelaing/arcn/tdd/
│   │           └── FizzBuzz.java          # Implementation
│   └── test/
│       └── java/
│           └── escuelaing/arcn/tdd/
│               └── FizzBuzzTest.java      # Test suite (10 tests)
├── ci-pipeline/
│   └── maven-tests.yml                     # GitHub Actions workflow
├── pom.xml                                 # Maven configuration
└── README.md                               # This file
```

<br>

## Running the Tests

**Execute all tests:**
```bash
mvn test
```

**Run only FizzBuzz tests:**
```bash
mvn test -Dtest=FizzBuzzTest
```

**Clean and test:**
```bash
mvn clean test
```

**Expected output:**
```
Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

<br>

## Requirements

- Java 21
- Maven 3.9+
- JUnit 5

Note: This project uses DevContainer configuration for consistent development environments.

<br>

## CI/CD Integration

A GitHub Actions workflow file is provided in `ci-pipeline/maven-tests.yml`. To enable continuous integration:

1. Copy `ci-pipeline/maven-tests.yml` to `.github/workflows/` in your repository root
2. Commit and push to GitHub
3. Tests will run automatically on every push and pull request

<br>

## License

This project is licensed under the GNU General Public License v3.0.

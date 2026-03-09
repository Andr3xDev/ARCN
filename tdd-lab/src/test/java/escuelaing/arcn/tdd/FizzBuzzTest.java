package escuelaing.arcn.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("FizzBuzz Test Suite")
class FizzBuzzTest {

    @Test
    @DisplayName("Should return '1' when input is 1")
    void testFizzBuzzReturnsOne() {
        // Arrange
        int input = 1;
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals("1", result);
    }

    @Test
    @DisplayName("Should return '2' when input is 2")
    void testFizzBuzzReturnsTwo() {
        // Arrange
        int input = 2;
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals("2", result);
    }

    @Test
    @DisplayName("Should return 'Fizz' when input is 3")
    void testFizzBuzzMultiplo3() {
        // Arrange
        int input = 3;
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("Should return 'Fizz' when input is 9")
    void testFizzBuzzMultiplo9() {
        // Arrange
        int input = 9;
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("Should return 'Buzz' when input is 5")
    void testFizzBuzzMultiplo5() {
        // Arrange
        int input = 5;
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("Should return 'Buzz' when input is 10")
    void testFizzBuzzMultiplo10() {
        // Arrange
        int input = 10;
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("Should return 'FizzBuzz' when input is 15")
    void testFizzBuzzMultiplo15() {
        // Arrange
        int input = 15;
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    @DisplayName("Should return 'FizzBuzz' when input is 30")
    void testFizzBuzzMultiplo30() {
        // Arrange
        int input = 30;
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    @DisplayName("Should return 'FizzBuzz' when input is 0")
    void testFizzBuzzZero() {
        // Arrange
        int input = 0;
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    @DisplayName("Should handle sequence from 1 to 15 correctly")
    void testFizzBuzzSequence() {
        // Arrange
        String[] expected = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", 
                            "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        
        // Act & Assert
        for (int i = 1; i <= 15; i++) {
            String result = FizzBuzz.fizzbuzz(i);
            assertEquals(expected[i - 1], result, 
                        "Failed at number " + i + ": expected " + expected[i - 1] + " but got " + result);
        }
    }

}

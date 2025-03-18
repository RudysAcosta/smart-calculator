package calculator.model;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddWithValidNumbers() {
        Calculator calculator = new Calculator(List.of(1, 2, 3, 4, 5));
        int result = calculator.add();

        assertEquals(15, result, "The sum of 1, 2, 3, 4, 5 should be 15");
    }

    @Test
    void testAddWithEmptyList() {
        Calculator calculator = new Calculator(List.of());
        int result = calculator.add();

        assertEquals(0, result, "An empty list should return 0");
    }

    @Test
    void testAddWithNegativeNumbers() {
        Calculator calculator = new Calculator(List.of(-2, -3, -4, 5));
        int result = calculator.add();

        assertEquals(-4, result, "The sum of -2, -3, -4, 5 should be -4");
    }

    @Test
    void testAddWithSingleNumber() {
        Calculator calculator = new Calculator(List.of(7));
        int result = calculator.add();

        assertEquals(7, result, "A single-element list should return the number itself");
    }

    @Test
    void testAddWithNullList() {
        Calculator calculator = new Calculator(null);
        int result = calculator.add();

        assertEquals(0, result, "A null list should return 0");
    }

}

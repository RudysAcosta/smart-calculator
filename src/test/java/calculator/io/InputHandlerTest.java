package calculator.io;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputHandlerTest {

    @Test
    @DisplayName("Test para entrada válida")
    void testGetValidNumbers() {
        String input = "5 10\n";
        try (Scanner testScanner = new Scanner(new ByteArrayInputStream(input.getBytes()))) {
            InputHandler inputHandler = new InputHandler(testScanner);
            int[] result = inputHandler.get();

            assertNotNull(result, "The result can't be null");
            assertEquals(2, result.length, "The array must contain 2 elements.");
            assertArrayEquals(new int[]{5, 10}, result);
        }
    }
}
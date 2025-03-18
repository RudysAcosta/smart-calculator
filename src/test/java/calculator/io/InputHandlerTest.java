package calculator.io;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputHandlerTest {

    @Test
    void testGetValidInput() {
        String input = "Hello World\n";
        Scanner testScanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        InputHandler inputHandler = new InputHandler(testScanner);

        String result = inputHandler.get();

        assertNotNull(result, "The result must not be null");
        assertEquals("Hello World", result, "Must return the exact line entered");
    }

    @Test
    void testGetSkipsEmptyLines() {
        String input = "\n\n  \nTest Line\n";
        Scanner testScanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        InputHandler inputHandler = new InputHandler(testScanner);

        String result = inputHandler.get();

        assertNotNull(result, "The result must not be null");
        assertEquals("Test Line", result, "Should skip empty lines and return the first valid line");
    }

    @Test
    void testGetReturnsNullForEmptyInput() {
        String input = "";
        Scanner testScanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        InputHandler inputHandler = new InputHandler(testScanner);

        String result = inputHandler.get();

        assertNull(result, "If there is no input, it should return null");
    }
}
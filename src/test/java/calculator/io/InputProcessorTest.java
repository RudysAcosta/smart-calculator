package calculator.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class InputProcessorTest {

    @Test
    void testGetNumbersValidInput() {
        String input = "10 20 30";
        List<Integer> result = InputProcessor.getNumbers(input);

        assertNotNull(result, "The result should not be null");
        assertEquals(3, result.size(), "The list should contain exactly 3 elements");
        assertEquals(List.of(10, 20, 30), result, "The numbers should be correctly parsed");
    }

    @Test
    void testGetNumbersEmptyInput() {
        String input = "";
        List<Integer> result = InputProcessor.getNumbers(input);

        assertNull(result, "An empty input should return null");
    }

    @Test
    void testGetNumbersInvalidInput() {
        String input = "10 abc 30";

        Exception exception = assertThrows(NumberFormatException.class, () -> {
            InputProcessor.getNumbers(input);
        });

        assertTrue(exception.getMessage().contains("For input string"),
                "Should throw NumberFormatException for invalid input");
    }
}

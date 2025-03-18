package calculator.io;

import java.util.ArrayList;
import java.util.List;

public class InputProcessor {

    public static List<Integer> getNumbers(String input) {

        List<Integer> numbers = new ArrayList<>();

        if (input.isEmpty()) {
            System.out.println("The input can't be empty");
            return null;
        }

        String[] inputElements = input.split(" ");

        for (String element : inputElements) {
            numbers.add(Integer.parseInt(element));
        }

        return numbers;
    }

}

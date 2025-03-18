package calculator;

import calculator.io.InputHandler;
import calculator.io.InputProcessor;
import calculator.model.Calculator;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();

        while (true) {
            String input = inputHandler.get();

            if (input.equals("/exit")) {
                break;
            } else if (input.equals("/help")) {
                System.out.println("The program calculates the sum of numbers");
                continue;
            }

            List<Integer> numbers = InputProcessor.getNumbers(input);

            Calculator calculator = new Calculator(numbers);
            System.out.println(calculator.add());
        }

        System.out.println("Bye!");

    }
}
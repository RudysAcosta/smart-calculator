package calculator;

import calculator.io.InputHandler;

public class Main {
    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();

        int[] numbers = inputHandler.get();
        System.out.println(numbers[0] + numbers[1]);
    }
}
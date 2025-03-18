package calculator.io;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public InputHandler() {
        this(new Scanner(System.in));
    }

    public int[] get() {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

            if (line.isEmpty()) {
                System.out.println("Empty input, please try again. Example: > 10 20");
                continue;
            }

            String[] numbersInput = line.split(" ");

            if (numbersInput.length != 2) {
                System.out.println("You must enter exactly two numbers.");
                continue;
            }

            try {
                int num1 = Integer.parseInt(numbersInput[0]);
                int num2 = Integer.parseInt(numbersInput[1]);
                return new int[]{num1, num2};
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter whole numbers only.");
            }
        }

        return null;
    }

}

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

    public String get() {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

            if (line.isEmpty()) {
                continue;
            }
            return line;
        }
        return null;
    }

}

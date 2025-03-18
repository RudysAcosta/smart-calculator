package calculator.model;

import java.util.List;

public class Calculator {

    List<Integer> numbers;

    public Calculator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int add() {
        if (numbers == null) {
            return 0;
        }

        int total = 0;
        for(Integer number: numbers) {
            total += number;
        }

        return total;
    }

}

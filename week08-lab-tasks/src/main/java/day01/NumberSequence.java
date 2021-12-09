package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> numbers = new ArrayList<>();

    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public NumberSequence(int howManyNumbersGenerated, int min, int max) {

        Random rnd = new Random();

        for (int i = 0; i < howManyNumbersGenerated; i++) {
            numbers.add(rnd.nextInt(min, max + 1));
        }
    }

    public List<Integer> closeToAverage(int value) {

        List<Integer> result = new ArrayList<>();
        double avg = calculateAvg();

        for (Integer actual : numbers) {
            if (Math.abs(actual - avg) <= value+0.000001d) { /// ha precízek akarunk lenni az avg double-sége miatt...
                result.add(actual);
            }
        }
        return result;
    }

    private double calculateAvg() {
        double sum = 0;

        for (Integer actual : numbers) {
            sum += actual;
        }
        return sum / numbers.size();
    }
}


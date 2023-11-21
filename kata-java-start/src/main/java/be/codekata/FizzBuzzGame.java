package be.codekata;

public class FizzBuzzGame {
    public static String play(int number) {
        if (isFizzBuzzable(number)) {
            return "FizzBuzz";
        }
        if (isFizzable(number)) {
            return "Fizz";
        }
        if (isBuzzable(number)) {
            return "Buzz";
        }

        return getValueOf(number);
    }

    private static String getValueOf(int i) {
        return String.valueOf(i);
    }

    private static boolean isFizzBuzzable(int i) {
        return isFizzable(i) && isBuzzable(i);
    }

    private static boolean isFizzable(int i) {
        return isDivisibleByThree(i);
    }

    private static boolean isBuzzable(int i) {
        return isDivisibleByFive(i);
    }

    private static boolean isDivisibleByFive(int i) {
        return i % 5 == 0;
    }

    private static boolean isDivisibleByThree(int i) {
        return i % 3 == 0;
    }
}

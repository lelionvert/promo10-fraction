package fr.lacombe.fraction;

import static java.lang.Integer.min;

public class Gcd {

    public static final int MINIMUM_GCD = 1;

    public static int compute(int a, int b) {
        for (int candidateGcd = min(a, b); candidateGcd > MINIMUM_GCD; candidateGcd--) {
            if (isMultipleOf(a, candidateGcd) && isMultipleOf(b, candidateGcd)) {
                return candidateGcd;
            }
        }
        return MINIMUM_GCD;
    }

    private static boolean isMultipleOf(int number, int multiplier) {
        return number % multiplier == 0;
    }
}

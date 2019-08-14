package fr.lacombe.fraction;

import static java.lang.Integer.min;

public class Gcd {
    public static int compute(int a, int b) {
        for (int i = min(a, b); i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

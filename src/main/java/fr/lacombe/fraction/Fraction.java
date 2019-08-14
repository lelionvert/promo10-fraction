package fr.lacombe.fraction;

import java.util.Objects;

public class Fraction {
    private static final int ZERO = 0;
    public static final int DENOMINATOR_OF_INTEGER = 1;
    private final int numerator;

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
    }

    public static Fraction zero() {
        return integer(ZERO);
    }

    public static Fraction integer(int value) {
        return new Fraction(value, DENOMINATOR_OF_INTEGER);
    }

    public Fraction add(Fraction other) {
        return new Fraction(this.numerator + other.numerator, 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator);
    }
}

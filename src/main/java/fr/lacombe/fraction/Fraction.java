package fr.lacombe.fraction;

import java.util.Objects;

public class Fraction {
    private static final int ZERO = 0;
    private final int numerator;

    private Fraction(int numerator) {
        this.numerator = numerator;
    }

    public static Fraction zero() {
        return new Fraction(ZERO);
    }

    public static Fraction of(int numerator) {
        return new Fraction(numerator);
    }

    public Fraction add(Fraction other) {
        return new Fraction(this.numerator + other.numerator);
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

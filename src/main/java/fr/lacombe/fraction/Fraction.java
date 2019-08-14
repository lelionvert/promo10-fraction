package fr.lacombe.fraction;

import java.util.Objects;

public class Fraction {
    private static final int ZERO = 0;
    public static final int DENOMINATOR_OF_INTEGER = 1;
    private final int numerator;
    private final int denominator;

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction zero() {
        return integer(ZERO);
    }

    public static Fraction integer(int value) {
        return new Fraction(value, DENOMINATOR_OF_INTEGER);
    }

    public static Fraction of(int numerator, int denominator) {
        return new Fraction(numerator, denominator);
    }

    public Fraction add(Fraction other) {
        if (this.hasSameDenominatorAs(other)) {
            return new Fraction(this.numerator + other.numerator, this.denominator);
        }
        int numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int denominator = this.denominator * other.denominator;
        return new Fraction(numerator, denominator);
    }

    private boolean hasSameDenominatorAs(Fraction other) {
        return this.denominator == other.denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator);
    }
}

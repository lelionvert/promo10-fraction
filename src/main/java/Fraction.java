import java.security.InvalidParameterException;
import java.util.Objects;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new InvalidParameterException("opération non supporté: division par zero impossible");
        }

        int gcd = gcd(numerator, denominator);

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

    }

    public Fraction multiply(Fraction fration2) {
        if (this.numerator == 0 || fration2.numerator == 0) {
            return new Fraction(0, 1);
        }

        return new Fraction(this.numerator * fration2.numerator,
                this.denominator * fration2.denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }

    int gcd(int numerator, int denominator) {

        int rest, quotien = 0;
        while (true) {
            rest = numerator % denominator;
            quotien = (numerator - rest) / denominator;
            if (rest == 0) break;
            numerator = denominator;
            denominator = rest;
        }
        return denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
}

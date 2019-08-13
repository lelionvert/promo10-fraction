import java.util.Objects;

public class Fraction {
    public static final int NEUTRAL_ELEMENT = 0;
    private final int numerator;

    public Fraction(int numerator) {
        this.numerator = numerator;
    }

    public Fraction add(Fraction other) {
        if (NEUTRAL_ELEMENT == other.numerator) {
            return this;
        }
        return other;
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

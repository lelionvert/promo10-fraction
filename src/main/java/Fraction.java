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
}

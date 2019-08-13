import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    @Test
    public void add_neutral_element_to_any_fraction_should_return_this_fraction() {
        Fraction anyFraction = Fraction.of(1);
        Fraction neutralElement = Fraction.zero();

        Fraction additionResult = anyFraction.add(neutralElement);

        assertEquals(anyFraction, additionResult);
    }

    @Test
    public void add_neutral_element_to_itself_should_return_itself() {
        Fraction neutralElement = Fraction.zero();

        Fraction additionResult = neutralElement.add(neutralElement);

        assertEquals(neutralElement, additionResult);
    }

    @Test
    public void add_anyFraction_to_neutral_element_should_return_anyFraction() {
        Fraction neutralElement = Fraction.zero();
        Fraction anyFraction = Fraction.of(1);

        Fraction additionResult = neutralElement.add(anyFraction);

        assertEquals(anyFraction, additionResult);
    }

    @Test
    public void add_fractionA_to_fractionB_should_sum_their_numerators() {
        int numeratorA = 2;
        int numeratorB = 3;
        int sumOfNumerator = numeratorA + numeratorB;

        assertEquals(Fraction.of(sumOfNumerator),
                Fraction.of(numeratorA).add(Fraction.of(numeratorB)));
    }
}

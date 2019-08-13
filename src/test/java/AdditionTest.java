import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    @Test
    public void add_neutral_element_to_any_fraction_should_return_this_fraction() {
        Fraction anyFraction = new Fraction(1);
        Fraction neutralElement = new Fraction(Fraction.NEUTRAL_ELEMENT);

        Fraction additionResult = anyFraction.add(neutralElement);

        assertEquals(anyFraction, additionResult);
    }

    @Test
    public void add_neutral_element_to_itself_should_return_itself() {
        Fraction neutralElement = new Fraction(Fraction.NEUTRAL_ELEMENT);

        Fraction additionResult = neutralElement.add(neutralElement);

        assertEquals(neutralElement, additionResult);
    }

    @Test
    public void add_anyFraction_to_neutral_element_should_return_anyFraction() {
        Fraction neutralElement = new Fraction(Fraction.NEUTRAL_ELEMENT);
        Fraction anyFraction = new Fraction(1);

        Fraction additionResult = neutralElement.add(anyFraction);

        assertEquals(anyFraction, additionResult);
    }

    @Test
    public void add_neutral_element_to_new_neutral_element_should_return_new_neutral_element() {
        Fraction neutralElement2 = new Fraction(Fraction.NEUTRAL_ELEMENT);
        Fraction neutralElement1 = new Fraction(Fraction.NEUTRAL_ELEMENT);
        Fraction expectedResult = new Fraction(Fraction.NEUTRAL_ELEMENT);

        Fraction additionResult = neutralElement1.add(neutralElement2);

        assertEquals(expectedResult, additionResult);
    }

    @Test
    public void add_fractionA_to_fractionB_should_sum_their_numerators() {
        int numeratorA = 2;
        int numeratorB = 3;
        int sumOfNumerator = numeratorA + numeratorB;

        assertEquals(new Fraction(sumOfNumerator),
                new Fraction(numeratorA).add(new Fraction(numeratorB)));
    }
}

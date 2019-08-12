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
    public void neutral_element_added_to_itself_should_return_itself() {
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
}

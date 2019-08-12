import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.LinkedBlockingDeque;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void neutral_element_added_to_any_fraction_should_return_this_fraction() {
        Fraction anyFraction = new Fraction(1);
        Fraction neutralElement = new Fraction(0);

        Fraction additionResult = anyFraction.add(neutralElement);

        assertEquals(anyFraction, additionResult);
    }

    @Test
    public void neutral_element_added_to_itself_should_return_itself() {
        Fraction neutralElement = new Fraction(0);

        Fraction additionResult = neutralElement.add(neutralElement);

        assertEquals(neutralElement, additionResult);
    }

    @Test
    public void anyFraction_added_to_neutral_element_should_return_anyFraction() {
        Fraction neutralElement = new Fraction(0);
        Fraction anyFraction = new Fraction(1);

        Fraction additionResult = neutralElement.add(anyFraction);

        assertEquals(anyFraction, additionResult);
    }
}

import org.junit.Assert;
import org.junit.Test;

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
}

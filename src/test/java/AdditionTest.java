import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void neutral_element() {
        Fraction anyFraction = new Fraction(1);
        Fraction neutralElement = new Fraction(0);

        assertEquals(anyFraction, anyFraction.add(neutralElement));
    }


}

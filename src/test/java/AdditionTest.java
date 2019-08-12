import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void neutral_element() {
        Fraction base = new Fraction(1);
        Fraction neutralElement = new Fraction(0);

        assertEquals(base, base.add(neutralElement));
    }
}

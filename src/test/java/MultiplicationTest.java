import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void divide_by_zero () {
        try {
            Fraction invalid = new Fraction(5, 0);
            fail();
        } catch (InvalidParameterException ex) {
            assertEquals("opération non supporté: division par zero impossible",
                    ex.getMessage());
        }
    }

    @Test
    public void multiply_by_zero()
    {
        Fraction fration1 = new Fraction(0, 5);
        Fraction fration2 = new Fraction(1, 2);

        Fraction result = fration1.multiply(fration2);

        assertEquals(new Fraction(0, 1), result);
    }

    @Test
    public void multiply_by_other_fraction() {
        Fraction fration1 = new Fraction(2, 3);
        Fraction fration2 = new Fraction(5, 7);

        Fraction result = fration1.multiply(fration2);

        assertEquals(new Fraction(10, 21), result);
    }

    @Test
    public void simplification() {
        Fraction fraction = new Fraction(2, 6);

        assertEquals(new Fraction(1, 3), fraction);
    }

    @Test
    public void multiply_with_simplification() {

        Fraction fration1 = new Fraction(1, 2);
        Fraction fration2 = new Fraction(2, 3);

        Fraction result = fration1.multiply(fration2);

        assertEquals(new Fraction(1,3),result);

    }

    @Test
    public void multiply_with_negative() {

        Fraction fration1 = new Fraction(-1, 2);
        Fraction fration2 = new Fraction(2, -3);

        Fraction result = fration1.multiply(fration2);

        assertEquals(new Fraction(1,3),result);

    }


}

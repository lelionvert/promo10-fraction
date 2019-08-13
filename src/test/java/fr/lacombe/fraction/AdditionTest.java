package fr.lacombe.fraction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdditionTest {

    @Test
    public void add_neutral_element_to_any_fraction_should_return_this_fraction() {
        Fraction anyFraction = Fraction.of(1);

        Fraction additionResult = anyFraction.add(Fraction.zero());

        assertEquals(anyFraction, additionResult);
    }

    @Test
    public void add_neutral_element_to_itself_should_return_itself() {
        Fraction additionResult = Fraction.zero().add(Fraction.zero());

        assertEquals(Fraction.zero(), additionResult);
    }

    @Test
    public void add_anyFraction_to_neutral_element_should_return_anyFraction() {
        Fraction anyFraction = Fraction.of(1);

        Fraction additionResult = Fraction.zero().add(anyFraction);

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

    @Test
    public void add_should_be_commutative() {
        Fraction BAddedToA = Fraction.of(1).add(Fraction.of(2));
        Fraction AAddedToB = Fraction.of(2).add(Fraction.of(1));

        assertTrue(BAddedToA.equals(AAddedToB));
    }
}

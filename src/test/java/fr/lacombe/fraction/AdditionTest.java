package fr.lacombe.fraction;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void add_neutral_element_to_any_fraction_should_return_this_fraction() {
        Fraction anyFraction = Fraction.integer(1);

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
        Fraction anyFraction = Fraction.integer(1);

        Fraction additionResult = Fraction.zero().add(anyFraction);

        assertEquals(anyFraction, additionResult);
    }

    @Test
    public void add_fractionA_to_fractionB_should_sum_their_numerators() {
        int numeratorA = 2;
        int numeratorB = 3;
        int sumOfNumerator = numeratorA + numeratorB;

        assertEquals(Fraction.integer(sumOfNumerator),
                Fraction.integer(numeratorA).add(Fraction.integer(numeratorB)));
    }

    @Test
    public void add_should_be_commutative() {
        Fraction BAddedToA = Fraction.integer(1).add(Fraction.integer(2));
        Fraction AAddedToB = Fraction.integer(2).add(Fraction.integer(1));

        assertTrue(BAddedToA.equals(AAddedToB));
    }

    @Test
    public void add_fraction_to_neutral_element_should_not_return_another_fraction() {
        assertNotEquals(Fraction.of(1, 4),
                Fraction.of(1, 2).add(Fraction.zero()));
    }

    @Test
    public void add_fractions_with_same_denominator_should_sum_only_their_numerators() {
        assertEquals(Fraction.of(5, 2),
                Fraction.of(1, 2).add(Fraction.of(4, 2)));
    }

    @Test
    public void add_fractions_with_different_denominator_and_irreducible_result() {
        assertEquals(Fraction.of(5, 6),
                Fraction.of(1, 3).add(Fraction.of(1, 2)));
    }
}

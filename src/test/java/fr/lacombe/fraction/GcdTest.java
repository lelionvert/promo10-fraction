package fr.lacombe.fraction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GcdTest {
    @Test
    public void compute_gcd() {
        assertEquals(25, Gcd.compute(100, 75));
    }

    @Test
    public void compute_gcd_triangulation() {
        assertEquals(4, Gcd.compute(12, 4));
    }

    @Test
    public void compute_gcd_with_same_numbers() {
        assertEquals(2, Gcd.compute(2, 2));
    }
}

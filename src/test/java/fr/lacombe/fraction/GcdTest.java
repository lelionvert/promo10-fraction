package fr.lacombe.fraction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GcdTest {
    @Test
    public void compute_gcd() {
        assertEquals(25, Gcd.compute(100, 75));
    }
}

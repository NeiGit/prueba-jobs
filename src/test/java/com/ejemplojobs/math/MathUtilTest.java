package com.ejemplojobs.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
    @Test
    void sum() {
        assertEquals(4, MathUtil.sum(2, 2));
    }

    @Test
    void subtract() {
        assertEquals(2, MathUtil.subtract(4, 2));
    }


    @Test
    void multiply() {
        assertEquals(4, MathUtil.multiply(2, 2));
    }


    @Test
    void divide() {
        assertEquals(2, MathUtil.divide(4, 2));
    }


    @Test
    void rest() {
        assertEquals(0, MathUtil.rest(4, 2));
    }
}
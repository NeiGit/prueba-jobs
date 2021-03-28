package com.ejemplojobs.util;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoundUtilTest {
    @Test
    void roundDouble() {
        assertEquals(Integer.valueOf(2), RoundUtil.roundDouble(2.3d));
    }

    @Test
    void roundFloat() {
        assertEquals(Integer.valueOf(2), RoundUtil.roundFloat(2.3f));
    }

    @Test
    void roundBigDecimal() {
        assertEquals(Integer.valueOf(2), RoundUtil.roundBigDecimal(BigDecimal.valueOf(2.3)));
    }
}
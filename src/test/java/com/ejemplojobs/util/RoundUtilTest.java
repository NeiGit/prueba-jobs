package com.ejemplojobs.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoundUtilTest {
    @Test
    void roundDouble() {
        assertEquals(Integer.valueOf(2), RoundUtil.roundDouble(2.3d));
    }
}
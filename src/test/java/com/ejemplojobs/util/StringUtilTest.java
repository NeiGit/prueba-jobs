package com.ejemplojobs.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void testIsNullOrEmpty() {
        StringUtil stringUtil = new StringUtil();
        assertTrue(stringUtil.isNullOrEmpty(null));
        assertTrue(stringUtil.isNullOrEmpty(""));
        assertFalse(stringUtil.isNullOrEmpty("not-empty"));
    }

    @Test
    void testCountCharacters() {
        StringUtil stringUtil = new StringUtil();
        assertEquals(5, stringUtil.countCharacters("cinco"));
        assertEquals(0, stringUtil.countCharacters(null));
    }
}
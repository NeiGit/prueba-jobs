package com.ejemplojobs.util;

public class StringUtil {
    public boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public int countCharacters(String s) {
        if (isNullOrEmpty(s)) return 0;
        return s.length();
    }
}

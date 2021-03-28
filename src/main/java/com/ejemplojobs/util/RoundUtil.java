package com.ejemplojobs.util;

import java.math.BigDecimal;

public class RoundUtil {
    public static int roundDouble(double d) {
        return (int) d;
    }

    public static int roundFloat(float f) {
        return (int) f;
    }

    public static int roundBigDecimal(BigDecimal bd) {
        return bd.intValue();
    }
}

package com.mycompany.mathutil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathutilTest {

    // Test các trường hợp hợp lệ (Normal & Boundary)
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(1, Mathutil.getFactorial(0));
        assertEquals(1, Mathutil.getFactorial(1));
        assertEquals(2, Mathutil.getFactorial(2));
        assertEquals(6, Mathutil.getFactorial(3));
        assertEquals(24, Mathutil.getFactorial(4));
        assertEquals(120, Mathutil.getFactorial(5));
        assertEquals(720, Mathutil.getFactorial(6));
    }

    // Test các trường hợp ngoại lệ n < 0 hoặc n > 20 (Abnormal)
    @Test
    public void testFactorialGivenWrongArgumentThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Mathutil.getFactorial(-1));
        assertThrows(IllegalArgumentException.class, () -> Mathutil.getFactorial(21));
    }
}
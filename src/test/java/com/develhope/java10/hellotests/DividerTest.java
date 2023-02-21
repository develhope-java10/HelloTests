package com.develhope.java10.hellotests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividerTest {
    int getDividerResult(int dividend, int divisor) {
        Divider divider = new Divider(dividend, divisor);
        return divider.result();
    }

    @Test
    void testTwoIntegersDivision() {
        // Setup/Arrange
        Divider divider = new Divider(10, 5);

        // Execute/Act
        int result = divider.result();

        // Verify/Assert
        assertEquals(2, result);
    }

    @Test
    void testNegativeDividendDivision() {
        int result = getDividerResult(-10, 5);
        assertEquals(-2, result);
    }

    @Test
    void testBothNegativeDivision() {
        int result = getDividerResult(-10, -5);
        assertEquals(2, result);
    }



}
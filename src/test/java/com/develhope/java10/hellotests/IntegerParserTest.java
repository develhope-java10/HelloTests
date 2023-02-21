package com.develhope.java10.hellotests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test_case = new IntegerParserTest()
 * test_case.setup()
 * test_case.testWithPositiveValue()
 * ----
 * test_case2 = new IntegerParserTest()
 * test_case2.setup()
 * test_case2.testWithZero()
 * ----
 * test_case3 = new IntegerParserTest()
 * test_case3.setup()
 * test_case3.testWithZero()
 */
class IntegerParserTest {
    IntegerParser parser;

    @BeforeEach
    void setup() {
        parser = new IntegerParser();
    }

    @Test
    void testWithPositiveValue() {
        int result = parser.parse("10");
        assertEquals(10, result);
    }

    @Test
    void testWithZero() {
        int result = parser.parse("0");
        assertEquals(0, result);
    }

    @Test
    void testWithNegativeValue() {
        int result = parser.parse("-10");
        assertEquals(-10, result);
    }


}
package com.develhope.java10.hellotests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class BatchDivisionTest {
    BatchDivision batchDivision;
    List<Double> resultValues;
    List<Double> expectedValues;

    @Test
    void testResult() {
        List<String> divisionElements = Arrays.asList("6,2", "12,4", "10,0", "8,2");
        batchDivision = new BatchDivision(divisionElements);

        resultValues = batchDivision.result();

        expectedValues = Arrays.asList(3.0, 3.0, 4.0);
        Assertions.assertEquals(expectedValues, resultValues);
    }

    @Test
    void testResultNegativeValues() {
        List<String> divisionElements = Arrays.asList("-6,2", "12,-4", "10,2");
        batchDivision = new BatchDivision(divisionElements);
        resultValues = batchDivision.result();
        expectedValues = Arrays.asList(-3.0, -3.0, 5.0);
        Assertions.assertEquals(expectedValues, resultValues);
    }

    @Test
    void testResultFormatException() {
        List<String> divisionElements = Arrays.asList("6,2", "12,4,5", "asc,ybtyh", "10,0", "8,2");
        batchDivision = new BatchDivision(divisionElements);
        assertThrows(NumberFormatException.class, () -> batchDivision.result());
    }
    @Test
    void testResultZeroDivisor() {
        List<String> divisionElements = Arrays.asList("6,2", "12,4", "10,0", "8,2");
        batchDivision = new BatchDivision(divisionElements);

        resultValues = batchDivision.result();
        expectedValues = Arrays.asList(3.0, 3.0, 4.0);
        Assertions.assertEquals(expectedValues, resultValues);
    }

    @Test
    void testResultWithEmptyList() {
        List<String> divisionElements = new ArrayList<>();
        batchDivision = new BatchDivision(divisionElements);

        resultValues = batchDivision.result();

        Assertions.assertTrue(resultValues.isEmpty());
    }
}

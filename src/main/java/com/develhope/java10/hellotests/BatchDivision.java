package com.develhope.java10.hellotests;

import java.util.ArrayList;
import java.util.List;

public class BatchDivision {
    private final List<String> divisionElements;

    public BatchDivision(List<String> divisionElements) {
        this.divisionElements = divisionElements;
    }

    public List<Double> result() {
        IntegerParser divisionParser = new IntegerParser();
        List<Double> resultValues = new ArrayList<>();

        for (String division : divisionElements) {
            String[] parts = division.split(",");
            try {
                int dividend = divisionParser.parse(parts[0]);
                int divisor = divisionParser.parse(parts[1]);
                if (divisor != 0) {
                    double result = new Divider(dividend, divisor).result();
                    resultValues.add(result);
                }
            } catch (ZeroDivisorException | ArithmeticException e) {
                System.out.println("Continue");
            }catch (NumberFormatException a){
                throw new NumberFormatException();
            }
        }

        return resultValues;
    }
}

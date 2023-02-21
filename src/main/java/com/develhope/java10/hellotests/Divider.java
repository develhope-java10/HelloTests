package com.develhope.java10.hellotests;

public class Divider {
    private int dividend;
    private int divisor;

    public Divider(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int result() {
        return dividend / divisor;
    }
}

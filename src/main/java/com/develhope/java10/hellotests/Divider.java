package com.develhope.java10.hellotests;

public class Divider {
    private int dividend;
    private int divisor;

    public Divider(int dividend, int divisor) {
        if(divisor == 0){
            throw new ZeroDivisorException();
        }
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int result() {
        return dividend / divisor;
    }
}

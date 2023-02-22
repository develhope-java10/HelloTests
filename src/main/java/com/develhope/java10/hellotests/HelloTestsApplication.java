package com.develhope.java10.hellotests;

public class HelloTestsApplication {
	public static void main(String[] args) {
		runDivision("-10", "0");
	}

	public static void runDivision(String rawDividend, String rawDivisor)	 {
		// Lettura dei dati
		IntegerParser dividendParser = new IntegerParser();
		int dividend = dividendParser.parse(rawDividend);
		int divisor = dividendParser.parse(rawDivisor);

		// Operazione di divisione
		Divider divider = new Divider(dividend, divisor);
		System.out.println(divider.result());
	}
}

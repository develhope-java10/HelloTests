package com.develhope.java10.hellotests;

public class HelloTestsApplication {
	public static void main(String[] args) {
		try{
			runDivision("abbbbbb", "0");
		} catch(ZeroDivisorException e){
			System.out.println("Cannot divide by 0");
		}

		runDivision("12", "6");

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

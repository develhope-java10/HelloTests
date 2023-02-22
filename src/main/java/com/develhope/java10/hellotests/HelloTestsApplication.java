package com.develhope.java10.hellotests;

import java.util.Scanner;

public class HelloTestsApplication {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		while (true){
			String inputDividend = keyboard.nextLine();
			String inputDivisor = keyboard.nextLine();
			try{
				runDivision(inputDividend, inputDivisor);
			} catch(ZeroDivisorException e){
				System.out.println("Cannot divide by 0");
			}catch(NumberFormatException a){
				System.out.println("Number format exe, write numbers "+a);
			}
		}



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

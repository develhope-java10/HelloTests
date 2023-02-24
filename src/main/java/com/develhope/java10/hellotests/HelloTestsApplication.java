package com.develhope.java10.hellotests;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloTestsApplication {
	public static void main(String[] args) {
		// federico ha problemi con il pathname! Funziona solo con absoultepath
		File file = new File("C:\\Users\\Federico\\Desktop\\HelloTests\\src\\main\\java\\com\\develhope\\java10\\hellotests\\test.txt");
		List<String> stringList = new ArrayList<>();
		try{
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String strCurrentLine;
			while ((strCurrentLine = bufferedReader.readLine()) != null) {
				stringList.add(strCurrentLine);
			}
			bufferedReader.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		BatchDivision batchDivision = new BatchDivision(stringList);
		List<Double> doubles = batchDivision.result();
		System.out.println(doubles);







		/*
		Scanner keyboard = new Scanner(System.in);

		while (true){
			String inputDividend = keyboard.nextLine();
			String inputDivisor = keyboard.nextLine();
			try{
				runDivision(inputDividend, inputDivisor);
			} catch(ZeroDivisorException  e){
				throw new ArithmeticException();
			}catch(NumberFormatException a){
				System.out.println("Number format exe, write number "+a);
			}finally{
				System.out.println("finally code");
			}
		}*/



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

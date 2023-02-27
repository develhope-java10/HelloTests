package com.develhope.java10.hellotests;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HelloTestsApplication {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/com/develhope/java10/hellotests/DividendDivisor.txt"))) {
			List<String> divisionElements = new ArrayList<>();
			String line;
			while ((line = reader.readLine()) != null) {
				divisionElements.add(line);
			}
			BatchDivision batchDivision = new BatchDivision(divisionElements);
			List<Double> resultValues = batchDivision.result();
			System.out.println(resultValues);
			//write results in new file
			for (Double result : resultValues) {
				String[] quotients = String.valueOf(result).split(",", 2);
				try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/com/develhope/java10/hellotests/Quotients.txt", true))) {
					for (String singleQuot : quotients) {
						writer.write(singleQuot);
						writer.newLine();
					}
				}
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
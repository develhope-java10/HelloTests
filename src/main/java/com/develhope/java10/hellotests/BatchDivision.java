package com.develhope.java10.hellotests;

import java.util.ArrayList;
import java.util.List;

import com.develhope.java10.hellotests.IntegerParser;

public class BatchDivision {
	private List<String> stringList;

	public BatchDivision(List<String> stringList) {
		this.stringList = stringList;
	}

	public List<Double> result() {
		List<Double> result = new ArrayList<>();
		IntegerParser parser = new IntegerParser();

		for (String str : stringList) {
			double dividend = 0.0, divisor = 0.0;
			try {
				String[] supportArray = str.split(",", 2);
				dividend = parser.parse(supportArray[0]);
				divisor = parser.parse(supportArray[1]);

			} catch (Exception e) {
				System.out.println("Errore di caricamento");
				continue;
			}
			result.add( (dividend / divisor));


		}
		return result;
	}
}

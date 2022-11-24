package org.howard.edu.lsp.assignment7;

import java.util.List;

//Calculate the average grade for a list of integer numbers

public class AverageGradeStrategy implements AverageStrategy {
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() == 0) {
			throw new EmptyListException("The set is empty.");
		}
		
		int sum = 0;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		int average = sum / grades.size();
		return average;
	}
}

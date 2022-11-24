package org.howard.edu.lsp.assignment7;

import java.util.Collections;
import java.util.List;

//Calculate the average grade for a list of integer numbers, dropping the two lowest scores

public class AverageGradeDroppedStrategy implements AverageStrategy {
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() == 0) {
			throw new EmptyListException("The set is empty.");
		}
		
		Collections.sort(grades);
		for (int i = 0; i < 2; i++) {
			grades.remove(0);
		}
		
		int sum = 0;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		int average = sum / grades.size();
		return average;
	}
}

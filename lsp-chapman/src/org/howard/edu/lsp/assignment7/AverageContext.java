package org.howard.edu.lsp.assignment7;

import java.util.List;

public class AverageContext {
	private AverageStrategy strategy;
	
	public void setAverageStrategy(AverageStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void createAverage(List<Integer> grades) throws EmptyListException {
		strategy.compute(grades);
	}
}

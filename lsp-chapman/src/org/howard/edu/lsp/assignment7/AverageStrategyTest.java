package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AverageStrategyTest {
	List<Integer> grades = new ArrayList<>();
	AverageContext ctx = new AverageContext();

	@BeforeEach
	public void setUp() {
		grades.add(90);
		grades.add(80);
		grades.add(50);
		grades.add(85);
		grades.add(70);
	}
	
	@Test
	@DisplayName("Test case for average grade strategy")
	public void testAverage() throws EmptyListException {
		AverageContext ctx = new AverageContext();
		ctx.setAverageStrategy(new AverageGradeStrategy());
		assertEquals(75, ctx.createAverage(grades));
	}
	
	@Test
	@DisplayName("Test case for average grade strategy, dropping the 2 lowest")
	public void testDrop() throws EmptyListException {
		AverageContext ctx = new AverageContext();
		ctx.setAverageStrategy(new AverageGradeDroppedStrategy());
		assertEquals(85, ctx.createAverage(grades));
	}
	
}

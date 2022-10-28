package org.howard.edu.lsp.midterm.problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class VotingMachineTest {
	VotingMachine map1;
	
	@BeforeEach
	public void setUp() {
		map1 = new VotingMachine();
	}
	
	@Test
	@DisplayName("Test case for getVotes (THROWS EXCEPTION)")
	void testgetVotes() {
		Throwable exception = assertThrows(UnknownCandidateException.class, () -> {
			map1.getVotes("John Smith");
		});
		
		String expectedMessage = "The name is not present.";
		String actualMessage = exception.getMessage();
		
	    assertEquals(expectedMessage, actualMessage);
	}
	
	@Test
	@DisplayName("Test case for sum")
	public void testSum() {
		map1.addCandidate("Adam Smith");
		map1.addCandidate("John Jacob");
		map1.addCandidate("Ashley Williams");
		
		map1.castVotes("Ashley Williams", 0);
		map1.castVotes("Ashley Williams", 0);
		map1.castVotes("Adam Smith", 0);

		assertEquals(3, map1.sum());
	}
}

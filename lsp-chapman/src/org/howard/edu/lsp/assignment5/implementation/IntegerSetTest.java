package org.howard.edu.lsp.assignment5.implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest {
	IntegerSet set1;
	IntegerSet set2;
	
	@BeforeEach
	public void setUp() {
		set1 = new IntegerSet();
		set2 = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		set1.clear();
		assertEquals(0, set1.length());
	}
	
	@Test
	@DisplayName("Test case for length")
	void testLength() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		assertEquals(3, set1.length());
	}
	
	@Test
	@DisplayName("Test case for length (INCORRECT)")
	void testLengthFalse() {
		set1.add(4);
		assertNotEquals(4, set1.length(), "The length of set1 should be 1.");
	}
	
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(2);
		set2.add(1);
		
		assertTrue(set1.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for equals (FALSE)")
	void testEqualsFalse() {
		set1.add(1);
		set1.add(2);
		set1.add(3);

		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		assertFalse(set1.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		set1.add(0);
		set1.add(10);
		set1.add(20);
		assertTrue(set1.contains(0));
	}
	
	@Test
	@DisplayName("Test case for contains (FALSE)")
	void testContainsFalse() {
		set1.add(0);
		set1.add(10);
		set1.add(20);
		assertFalse(set1.contains(30));
	}
	
	@Test
	@DisplayName("Test case for largest")
	public void testLargest() {
		set1.add(-10);
		set1.add(-20);
		set1.add(0);
		
		int largest = Integer.MIN_VALUE;
		
		try {
			largest = set1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println("The set is empty.");
		}
		
		assertEquals(0, largest);
	}
	
	@Test
	@DisplayName("Test case for largest (THROWS EXCEPTION)")
	public void testLargestEmpty() {
		Throwable exception = assertThrows(IntegerSetException.class, () -> {
			set1.largest();
		});
		
		String expectedMessage = "The set is empty.";
		String actualMessage = exception.getMessage();
		
	    assertEquals(expectedMessage, actualMessage);
	}
	
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() {
		set1.add(-100);
		set1.add(-200);
		set1.add(-300);
		
		int smallest = Integer.MAX_VALUE;
		
		try {
			smallest = set1.smallest();
		}
		catch (IntegerSetException e) {
			System.out.println("The set is empty.");
		}
		
		assertEquals(-300, smallest);
	}
	
	@Test
	@DisplayName("Test case for smallest (THROWS EXCEPTION)")
	void testSmallestEmpty1() {
		Throwable exception = assertThrows(IntegerSetException.class, () -> {
			set1.smallest();
		});
		
		String expectedMessage = "The set is empty.";
		String actualMessage = exception.getMessage();
		
	    assertEquals(expectedMessage, actualMessage);
	}
	
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		set1.add(-5);
		set1.add(0);
		set1.add(5);
		set1.add(10);
		set1.add(15);
		String addSet = "[-5, 0, 5, 10, 15]";
		assertEquals(addSet, addSet.toString());
	}
	
	@Test
	@DisplayName("Test case for add (ITEM REPEATED IN SET)")
	void testAddRepeat() {
		set1.add(-5);
		set1.add(0);
		set1.add(5);
		set1.add(10);
		set1.add(15);
		set1.add(10);
		String addSet = "[-5, 0, 5, 10, 15]";
		assertEquals(addSet, addSet.toString());
	}
	
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		set1.add(-10);
		set1.add(0);
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.remove(-10);
		String removeSet = "[0, 10, 20, 30]";
		assertEquals(removeSet, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for remove (ITEM NOT IN SET)")
	void testRemoveRepeat() {
		set1.add(0);
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.remove(-10);
		String removeSet = "[0, 10, 20, 30]";
		assertEquals(removeSet, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		
		set2.add(10);
		set2.add(20);
		set2.add(50);
		set2.add(60);
		
		set1.union(set2);
		String setUnion = "[10, 20, 30, 40, 50, 60]";
		assertEquals(setUnion, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for union (SECOND TEST)")
	void testUnionRepeat() {
		set1.add(5);
		set1.add(10);
		set1.add(15);
		
		set2.add(5);
		set2.add(10);
		set2.add(15);
		set2.add(20);
		
		set1.union(set2);
		String setUnion = "[5, 10, 15, 20]";
		assertEquals(setUnion, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		set1.add(1);
		set1.add(3);
		set1.add(5);
		set1.add(7);
		
		set2.add(3);
		set2.add(6);
		set2.add(7);
		set2.add(9);
		
		set1.intersect(set2);
		String setIntersect = "[3, 7]";
		assertEquals(setIntersect, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for intersect (SECOND TEST)")
	void testIntersectRepeat() {
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		
		set2.add(4);
		set2.add(8);
		set2.add(12);
		set2.add(16);
		set2.add(20);
		
		set1.intersect(set2);
		String setIntersect = "[4, 8]";
		assertEquals(setIntersect, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for diff")
	public void testDiff() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		set1.diff(set2);
		String setDiff = "[1, 2]";
		assertEquals(setDiff, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for diff (SECOND TEST)")
	void testDiffRepeat() {
		set1.add(0);
		set1.add(3);
		set1.add(7);
		set1.add(9);
		set1.add(11);
		
		set2.add(3);
		set2.add(8);
		set2.add(11);
		
		set1.diff(set2);
		String setDiff = "[0, 7, 9]";
		assertEquals(setDiff, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		assertTrue(set1.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for isEmpty (FALSE)")
	void testIsEmptyFalse() {
		set1.add(100);
		set1.add(101);
		set1.add(102);
		assertFalse(set1.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		set1.add(1);
		set1.add(3);
		set1.add(5);
		set1.add(7);
		set1.add(9);
		set1.add(11);
		String testString = "[1, 3, 5, 7, 9, 11]";
		assertEquals(testString, set1.toString());
	}
}

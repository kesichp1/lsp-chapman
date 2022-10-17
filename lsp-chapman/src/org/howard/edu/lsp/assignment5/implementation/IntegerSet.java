package org.howard.edu.lsp.assignment5.implementation;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * 
 * @author Kesi Chapman
 * 
 * This class contains methods and a default constructor
 * for IntegerSet.
 * 
 */

public class IntegerSet {
	private ArrayList<Integer> set = new ArrayList<Integer>();

	/**
	 * This is the default constructor for IntegerSet.
	 */

	public IntegerSet() {
		set = new ArrayList<Integer>();
	}
	
	/**
	 * This is a method that clears the internal representation
	 * of the set.
	 */

	public void clear() {
		set.clear();
	}
	
	/**
	 * This is a method that returns the length of the set.
	 * 
	 * @return the set size.
	 */
	
	public int length() {
		return set.size();
	}

	/**
	 * This is a method that evaluates if two sets are equal.
	 * The two sets are equal if they contain all of the same
	 * values in ANY order.
	 * 
	 * @param b is an object that contains a set to compare the
	 * calling object's set with.
	 *  
	 * @return true if the two sets are equal, false otherwise.
	 */
	
	public boolean equals(IntegerSet b) {
			Collections.sort(set);
			Collections.sort(b.set);
			return set.equals(b.set);
	}
	
	/**
	 * This is a method that evaluates whether the set contains
	 * a specific value or not.
	 * 
	 * @param value contains the specific value that is being
	 * evaluated by the set. 
	 * 
	 * @return true if the set contains the value, false otherwise.
	 */
	
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	/**
	 * This is a method that finds the largest value in the set.
	 * 
	 * @return the largest item in the set.
	 * 
	 * @throws IntegerSetException if the set is empty.
	 */

	public int largest() throws IntegerSetException {
		if (set.size() == 0) {
			throw new IntegerSetException("The set is empty.");
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) >= max) {
				max = set.get(i);
			}
		}
		return max;
	} 

	/**
	 * This is a method that finds the smallest value in the set.
	 * 
	 * @return the smallest item in the set.
	 * 
	 * @throws IntegerSetException if the set is empty.
	 */
	
	public int smallest() throws IntegerSetException {
		if (set.size() == 0) {
			throw new IntegerSetException("The set is empty.");
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) <= min) {
				min = set.get(i);
			}
		}
		return min;
	}
	
	/**
	 * This is a method that adds an item to the set or does
	 * nothing if the item is already there.
	 * 
	 * @param item contains the item to add to the set.
	 */
	
	public void add(int item) {
		if(!this.contains(item)) {
			set.add(item);
		}
	}
	
	/**
	 * This is a method that removes an item from the set or
	 * does nothing if the item is not there.
	 * 
	 * @param item contains the item to remove from the set.
	 */

	public void remove(int item) {
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) == item)
				set.remove(i);
		}
	}
	
	/**
	 * This is a method that creates the union of two sets.
	 * 
	 * @param intSetb is an object that contains the elements
	 * that are to be added to the union set.
	 */
	
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> unionSet = new ArrayList<>(set);
		
		for (int i = 0; i < intSetb.set.size(); i++) {
			if (!unionSet.contains(intSetb.set.get(i))) {
				unionSet.add(intSetb.set.get(i));
			}
		}
		this.set = unionSet;
	}

	/**
	 * This is a method that creates the intersection of
	 * two sets.
	 * 
	 * @param intSetb is an object that contains the elements
	 * that are to be added to the intersection set.
	 */

	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> interSet = new ArrayList<>(set);
		interSet.retainAll(intSetb.set);
		this.set = interSet;
	} 

	/**
	 * This is a method that creates the difference between
	 * two sets.
	 * 
	 * @param intSetb is an object that contains the elements
	 * that are to be removed from the calling object's set.
	 */
	
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> setDiff = new ArrayList<>(set);
		setDiff.removeAll(intSetb.set);
		this.set = setDiff;
	}
	
	/**
	 * This is a method that checks if a set is empty or not.
	 * 
	 * @return true if the set is empty, false otherwise.
	 */

	public boolean isEmpty() {
		return set.size() == 0;
	}

	/**
	 * This is a method that creates a String representation
	 * of the set.
	 */
	
	public String toString() {
		if (set.isEmpty())
			return "[]";
		
		String result = "[" + set.get(0);
		for(int i= 1; i < set.size(); i++) {
			result += ", " + set.get(i);
		}
		result += "]";
		return result;
	}
}

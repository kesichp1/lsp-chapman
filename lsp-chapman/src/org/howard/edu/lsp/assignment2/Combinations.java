package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class contains methods to find and print 
 * the combinations that add up to a given sum.
 * 
 * @author Kesi Chapman
 *
 */

public class Combinations {
	
	/**
	 * This is a helper method for method compute. This method
	 * uses recursion and backtracking to find the distinct
	 * elements in the given array that add up to sum. The
	 * distinct elements found are put in a list.
	 * 
	 * @param input is an integer array that obtains the
	 * given elements to search.
	 * 
	 * @param index is an integer that defines the position in
	 * the input array.
	 * 
	 * @param sum is an integer that holds the number the
	 * elements should add up to.
	 * 
	 * @param combos is a list that temporarily holds the
	 * different combinations of elements that add up to the sum.
	 * 
	 * @param result is a list of lists that holds the result of
	 * the combinations that add up to the sum
	 */

	public void findCombo(int[] input, int index, int sum,
			List<Integer> combos, List<List<Integer>> result) {
		if(sum == 0) {
			result.add(new ArrayList<>(combos));
		}
		
		if(input == null || sum < 0) {
			return;
		}
		
		int inputLength = input.length;
		for (int i = index; i < inputLength; i++) {
			if(i == index || input[i] != input[i - 1]) {
				combos.add(i);
				findCombo(input, i + 1, sum - input[i], combos, result);
				combos.remove(combos.size() - 1);
			}
		}
	}
	
	/**
	 * This is a method that computes the combinations
	 * of numbers from the given array that add up to sum.
	 * This method prints out those indices in an array 
	 * that add up to sum.
	 * 
	 * @param input is an integer array that obtains the
	 * given elements to search.
	 * 
	 * @param sum is an integer that holds the number the
	 * elements should add up to.
	 */
	
	public void compute(int[] input, int sum) {
		Arrays.sort(input);
		System.out.println("Input: " + Arrays.toString(input));
		System.out.println("Sum: " + sum);

		if(input == null || sum < 0) {
			System.out.println("[]");
		}
		
		List<List<Integer>> result = new ArrayList<>();
		findCombo(input, 0, sum, new ArrayList<Integer>(), result);
		System.out.println(result);
		System.out.println();
	}
}

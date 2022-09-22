package org.howard.edu.lsp.assignment2;

public class Driver {

	public static void main(String[] args) 
	{
		Combinations comb = new Combinations();
		comb.compute(new int[] {5,5,15,10}, 15); // test case 1
		comb.compute(new int[] {1,2,3,4,5,6}, 6); // test case 2
		comb.compute(new int[] {1, 3, 5, 3, 4, 2}, 6); // test case 3
		comb.compute(new int[] {}, 1); // test case 4
		comb.compute(new int[] {7, 8, 9}, 10); // test case 5
		comb.compute(new int[] {10, 20, 30}, 2); // test case 5
		comb.compute(new int[] {1, 7, 9, 8, 9, 3}, 9); // test case 6
		comb.compute(new int[] {10, 30, 50, 70, 70, 90}, 70); // test case 7
	}

}

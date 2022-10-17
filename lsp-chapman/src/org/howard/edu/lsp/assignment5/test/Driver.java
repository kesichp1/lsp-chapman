package org.howard.edu.lsp.assignment5.test;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

/**
 * 
 * @author Kesi Chapman
 *
 * This class contains test cases for the IntegerSet class.
 *
 */

public class Driver {

	public static void main(String[] args) throws IntegerSetException 
	{
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("----- Set 1 -----" + "\n");
		System.out.println("The value of Set 1 is: " + set1.toString());
		
		set1.clear();
		System.out.println("The value of Set 1 cleared is: " + set1.toString() + "\n");
		
		System.out.println("* Adding 2, 4, 6 to Set 1 *" + "\n");
		set1.add(2);
		set1.add(4);
		set1.add(6);
		System.out.println("The value of Set 1 is: " + set1.toString());
		System.out.println("The length of Set 1 is: " + set1.length() + "\n");
		
		IntegerSet set2 = new IntegerSet();
		set2.add(6);
		set2.add(4);
		set2.add(2);
		System.out.println("----- Are Set 1 and Set 2 equal? -----" + "\n");
		System.out.println("The value of Set 1 is: " + set1.toString());
		System.out.println("The value of Set 2 is: " + set2.toString());
		System.out.println("Set 1 and Set 2 are equal: " + set1.equals(set2) + "\n");
		
		IntegerSet set3 = new IntegerSet();
		set3.add(0);
		set3.add(10);
		set3.add(20);
		
		IntegerSet set4 = new IntegerSet();
		set4.add(5);
		set4.add(10);
		set4.add(15);
		
		System.out.println("----- Are Set 3 and Set 4 equal? -----" + "\n");
		System.out.println("The value of Set 3 is: " + set3.toString());
		System.out.println("The value of Set 4 is: " + set4.toString());
		System.out.println("Set 3 and Set 4 are equal: " + set3.equals(set4) + "\n");
		
		System.out.println("----- Does Set 3 contain a 20? -----" + "\n");
		System.out.println("The value of Set 3 is: " + set3.toString());
		System.out.println("Set 3 contains a 20: " + set3.contains(20) + "\n");
		
		System.out.println("----- Does Set 4 contain a 25? -----" + "\n");
		System.out.println("The value of Set 4 is: " + set4.toString());
		System.out.println("Set 4 contains a 25: " + set4.contains(25) + "\n");
		
		IntegerSet set5 = new IntegerSet();
		set5.add(13);
		set5.add(3);
		set5.add(5);
		set5.add(72);
		set5.add(9);
		set5.add(11);
		
		System.out.println("----- Set 5's largest and smallest values -----" + "\n");
		System.out.println("The value of Set 5 is: " + set5.toString());
		System.out.println("The largest value in Set 5 is: " + set5.largest());
		System.out.println("The smallest value in Set 5 is: " + set5.smallest() + "\n");		
		
		IntegerSet set6 = new IntegerSet();
		set6.add(-100);
		set6.add(-1000);
		set6.add(0);
		System.out.println("----- Set 6's largest and smallest values -----" + "\n");
		System.out.println("The value of Set 6 is: " + set6.toString());
		System.out.println("The largest value in Set 6 is: " + set6.largest());
		System.out.println("The smallest value in Set 6 is: " + set6.smallest() + "\n");
		
		IntegerSet set7 = new IntegerSet();
		set7.add(3);
		set7.add(1);
		set7.add(4);
		set7.add(5);
		set7.add(9);
		set7.add(7);
		
		System.out.println("----- Set 7 -----" + "\n");
		System.out.println("The value of Set 7 is: " + set7.toString() + "\n");
		
		System.out.println("* Adding 1 to Set 7 *" + "\n");
		set7.add(1);
		System.out.println("The value of Set 7 is: " + set7.toString() + "\n");
		
		System.out.println("* Removing 5 from Set 7 *" + "\n");
		set7.remove(5);
		System.out.println("The value of Set 7 is: " + set7.toString() + "\n");
		
		System.out.println("* Removing 11 from Set 7 *" + "\n");
		set7.remove(11);
		System.out.println("The value of Set 7 is: " + set7.toString() + "\n");

		IntegerSet set8 = new IntegerSet();
		set8.add(10);
		set8.add(20);
		set8.add(30);
		set8.add(40);
		
		IntegerSet set9 = new IntegerSet();
		set9.add(10);
		set9.add(20);
		set9.add(50);
		set9.add(60);
		
		System.out.println("----- The union of Set 8 and Set 9 -----" + "\n");
		System.out.println("The value of Set8 is: " + set8.toString());
		System.out.println("The value of Set9 is: " + set9.toString());
		set8.union(set9);
		System.out.println("The union of Set8 and Set9 is: " + set8.toString() + "\n");
		
		IntegerSet set10 = new IntegerSet();
		set10.add(1);
		set10.add(3);
		set10.add(5);
		set10.add(7);
		
		IntegerSet set11 = new IntegerSet();
		set11.add(3);
		set11.add(6);
		set11.add(7);
		set11.add(9);
		
		System.out.println("----- The intersection of Set 10 and Set 11 -----" + "\n");
		System.out.println("The value of Set 10 is: " + set10.toString());
		System.out.println("The value of Set 11 is: " + set11.toString());
		set10.intersect(set11);
		System.out.println("The intersection of Set 10 and Set 11 is: " + set10.toString() + "\n");
		
		IntegerSet set12 = new IntegerSet();
		set12.add(2);
		set12.add(4);
		set12.add(6);
		set12.add(8);
		
		IntegerSet set13 = new IntegerSet();
		set13.add(4);
		set13.add(8);
		set13.add(12);
		set13.add(16);
		set13.add(20);
		
		System.out.println("----- The intersection of Set 12 and Set 13 -----" + "\n");
		System.out.println("The value of Set 12 is: " + set12.toString());
		System.out.println("The value of Set 13 is: " + set13.toString());
		set12.intersect(set13);
		System.out.println("The intersection of Set 12 and Set 13 is: " + set12.toString() + "\n");

		IntegerSet set14 = new IntegerSet();
		set14.add(1);
		set14.add(2);
		set14.add(3);
		set14.add(4);
		set14.add(5);
		set14.add(6);
		
		IntegerSet set15 = new IntegerSet();
		set15.add(3);
		set15.add(4);
		set15.add(5);
		set15.add(6);
		set15.add(7);
		set15.add(8);
		
		System.out.println("----- The difference of Set 14 and Set 15 -----" + "\n");
		System.out.println("The value of Set 14 is: " + set14.toString());
		System.out.println("The value of Set 15 is: " + set15.toString());
		set14.diff(set15);
		System.out.println("The difference of Set 14 and Set 15 is: " + set14.toString() + "\n");
		
		IntegerSet set16 = new IntegerSet();
		set16.add(0);
		set16.add(3);
		set16.add(7);
		set16.add(9);
		set16.add(11);
		
		IntegerSet set17 = new IntegerSet();
		set17.add(3);
		set17.add(8);
		set17.add(11);
		
		System.out.println("----- The difference of Set 16 and Set 17 -----" + "\n");
		System.out.println("The value of Set 16 is: " + set16.toString());
		System.out.println("The value of Set 17 is: " + set17.toString());
		set16.diff(set17);
		System.out.println("The difference of Set 16 and Set 17 is: " + set16.toString() + "\n");
		
		System.out.println("----- Is Set 17 empty? -----" + "\n");
		System.out.println("The value of Set 17 is: " + set17.toString());
		System.out.println("Set 17 is empty: " + set17.isEmpty() + "\n");
		
		System.out.println("----- Set 17's largest and smallest values -----" + "\n");
		System.out.println("The largest value in Set 17 is: " + set17.largest());
		System.out.println("The smallest value in Set 17 is: " + set17.smallest() + "\n");
		
		IntegerSet set18 = new IntegerSet();
		System.out.println("----- Is Set 18 empty? -----" + "\n");
		System.out.println("The value of Set 18 is: " + set18.toString());
		System.out.println("Set 18 is empty: " + set18.isEmpty() + "\n");
		
		System.out.println("----- Set 18's largest and smallest values -----" + "\n");
		System.out.println("The largest value in Set 18 is: " + set18.largest());
		System.out.println("The smallest value in Set 18 is: " + set18.smallest() + "\n");
	}
}
package org.howard.edu.lsp.midterm.problem2;

public class Driver {

	public static void main(String[] args) 
	{
		Person p1 = new Person("John", "12345678", 40);
		Person p2 = new Person("Brenda", "12345678", 35);
		
		System.out.println("Person 1: " + p1.toString());
		System.out.println("Person 2: " + p2.toString());
		System.out.println("Do Person 1 and Person 2 have the same SSN?: "
				+ p1.equals(p2));
		
		System.out.println("--------------------------------------------------");
		
		Person p3 = new Person("Mary", "98765432", 22);
		Person p4 = new Person("Kate", "12098375", 22);
		
		System.out.println("Person 3: " + p3.toString());
		System.out.println("Person 4: " + p4.toString());
		System.out.println("Do Person 3 and Person 4 have the same SSN?: "
				+ p3.equals(p4));
	}
}

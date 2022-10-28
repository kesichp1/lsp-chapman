package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;

		public Person(String name,  String socialSecurityNumber, int age) {
			this.name = name;
			this.socialSecurityNumber = socialSecurityNumber;
			this.age = age;
		}

		public String toString() {
			String result =  name + ", " + socialSecurityNumber + ", "
					+ age;
			return result;
		}
		
		public boolean equals(Person p) {
			return socialSecurityNumber.equals(p.socialSecurityNumber);
	}
}

package com.oops.bll;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(01, "Pranav", "Pandey", 50000);
	      System.out.println(e1);  // toString();

	      //  Setters and Getters
	      e1.setSalary(1000);
	      System.out.println(e1);  // toString();
	      System.out.println("id is: " + e1.getId());
	      System.out.println("firstname is: " + e1.getFirstName());
	      System.out.println("lastname is: " + e1.getLastName());
	      System.out.println("salary is: " + e1.getSalary());

	      System.out.println("name is: " + e1.getName());
	      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

	      //  raiseSalary()
	      System.out.println(e1.getraiseSalary(10));
	      System.out.println(e1);
	   }


}
	

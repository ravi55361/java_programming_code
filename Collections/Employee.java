package Collections;

import java.util.*;

public class Employee {
	String name, company;
	int salary;
	boolean services;
	static int count = 1;

	public Employee(String name, String company, int salary, boolean services) {
		this.name = name;
		this.company = company;
		this.salary = salary;
		this.services = services;
	}

	void displayDetails() {
		System.out.println("------------------------------");
		System.out.println("Name :- " + this.name);
		System.out.println("Company :- " + this.company);
		System.out.println("Salary :- " + this.salary);
		System.out.println("Exprience :- " + this.services);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Ravi", "TCS", 35000, true);
		Employee e2 = new Employee("Priti", "Wipro", 39000, false);
		Employee e3 = new Employee("Aditya", "Flipcart", 37000, true);
		Employee e4 = new Employee("Rohit", "Oracal", 36000, true);
		Employee e5 = new Employee("Saurabh", "TCS", 38000, true);
		Employee e6 = new Employee("BTSVG", "Cognigent", 34000, false);
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
//        for(int i=0;i<=al.size()-1;i++)
//        {
//           // Employee e =(Employee) al.get(i);
//        	Employee e=al.get(i);
//            e.displayDetails();	
//            System.out.println("Employee Number "+count++);
//        }
//        System.out.println("------------------------------");
//        System.out.println("Employee More Than 3 Years!!!!");
//        count =1;
//        for(int i=0;i<=al.size()-1;i++)
//        {
//           // Employee e =(Employee) al.get(i);
//        	Employee e=al.get(i);
//        	if(e.services>3)
//        	{
//        		e.displayDetails();
//        		System.out.println("Employee Number "+count++);
//        	}
//        }
//        System.out.println("------------------------------");
//        System.out.println("Employee Earning Salary Between 21000 And 35000!!!!");
		count = 1;
//        for(int i=0;i<=al.size()-1;i++)
//        {
//           // Employee e =(Employee) al.get(i);
//        	Employee e=al.get(i);
//            if(e.services==true)
//            {
//            	e.displayDetails();
//            	System.out.println("Employee Number "+count++);
//            } 	
//        } 
		for (int i = 0; i < al.size(); i++) {
			Employee e = al.get(i);
			System.out.println("------***********----------");
//    	   e.displayDetails();

			System.out.println("Name :- " + e.name);
			System.out.println("Company :- " + e.company);
			System.out.println("Salary :- " + e.salary);
			System.out.println("Exprience :- " + e.services);
			System.out.println("Employee Number " + count++);
			System.out.println("------------------------------");
		}
	}
}

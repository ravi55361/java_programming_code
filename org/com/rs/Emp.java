package org.com.rs;

public class Emp 
{
	String name;
	int sal;
	//constructor
	Emp(String n,int s)
	{
		this.name=n;
	    this.sal=s;
	}
    //main method
	public static void main(String [] args)
	{

		Emp e1 = new Emp("Ravi",50000);
		System.out.println(e1.name+" "+e1.sal);
		Emp e2 = new Emp("Sanjay",50000);
		System.out.println(e2.name+" "+e2.sal);
		
		
	}

}

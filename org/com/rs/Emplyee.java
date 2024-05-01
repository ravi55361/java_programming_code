
package org.com.rs;

public class Emplyee {
	String name;
	String company ="Wipro";
	double sal = 30000;

	public static void main(String[] args)
	{
		Emplyee e1=new Emplyee();
		Emplyee e2=new Emplyee();
		Emplyee e3=new Emplyee();
		e1.name="Ravi";
		e2.name="Saurav";
		e3.name="Prit";
		e2.sal=e2.sal+e2.sal*.20;
		e3.sal=e3.sal+e3.sal*.50;
		
		System.out.println(e1.name+" "+e1.company+" "+e1.sal);
		System.out.println(e2.name+" "+e2.company+" "+e2.sal);
		System.out.println(e3.name+" "+e3.company+" "+e3.sal);

	}

}

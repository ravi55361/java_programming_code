package org.com.rs;

public class Father 
{
	String car="BMW";
	int money=5000000;
	void java()
	{
		System.out.println("Learn JAVA!!!");
	}
	void display()
	{
		System.out.println("Money : "+money);
		System.out.println("Car  : "+car);
	}
}
class Son extends Father
{
	String bike="Ninja XR";
	void learnPython()
	{
		System.out.println("Learn PYTHON!!!");
	}
	void display1()
	{
		System.out.println("bike : "+bike);
	}
}

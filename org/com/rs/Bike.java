package org.com.rs;
public class Bike 
    {
	    String name;
	    String color;
	    int price;
	Bike(String n,String c,int p)
	{
		this.name=n;
		this.color=c;
		this.price=p;
	}
	void show()
	{
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
	}
	

	public static void main(String[] args)
	{
		Bike b1=new Bike("Ninja","Green",900000);
		b1.show();
		Bike b2=new Bike("KTM","white",500000);
		b2.show();
		
	}

}

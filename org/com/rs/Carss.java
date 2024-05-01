package org.com.rs;
public class Carss {
	String name;
	String color;
	double price;
	double cc;
	double tax,in,total;
	public Carss(String n,String c,double p,double c1)
	{
		this.name=n;
		this.color=c;
		this.price=p;
		this.cc=c1;
	}
	void total_price()
	{
		if(price<500000)
		{
			tax=price*13/100;
		}
		else if(price>500000 && price<=100000)
		{
			tax=price*14/100;
		}
		else if(price>1000000 && price<=2000000)
		{
			tax=price*17/100;
		}
		else
			tax=price*18/100;
	}
	void ins()
	{
		if(cc<=1000)
		{
			in=2120;
		}	
		else if(cc<=1500 && cc>1000)
		{
			in=3300;
		}
		else
		{
			in=7890;
		}
	}
	void show()
	{
		total=price+tax+in;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.tax);
		System.out.println(this.in);
		System.out.println(this.total);	
	}
	public static void main(String [] args)
	{
		Carss c2= new Carss("BMW","Black",5000000.0,1600.0);
		c2.total_price();
		c2.ins();
		c2.show();	
	}
}



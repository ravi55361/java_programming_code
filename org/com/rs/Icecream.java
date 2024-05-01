package org.com.rs;
public class Icecream 
{
	int flavourCode;
	int price;
	boolean dryFruits;
	String toping;
	int getPrice(int f1)
	{
		this.flavourCode=f1;
		if(this.flavourCode==1)
		{
			return this.price=100;
		}
		else if(this.flavourCode==2)
		{
			return this.price=150;
		}
		else if(this.flavourCode==3)
		{
			return this.price=200;
		}
		else
		{
			System.out.println("Invalid choice!!");
			return this.price=0;
		}
	}
	public Icecream(int i,boolean dryf)
	{
		this.flavourCode=i;
		this.dryFruits=dryf;
		this.getPrice(i);
		if(dryf==true)
			this.price=this.price+40;
	}
	public Icecream(int i,boolean dryf,String t)
	{
		this.flavourCode=i;
		this.dryFruits=dryf;
		this.toping=t;
		this.getPrice(i);
		this.price=this.price+50;
		if(dryf==true)
			this.price=this.price+40;
	}
	void show()
	{
		double GST=this.price*.18;
		double total=this.price+GST;
		System.out.println("IceCream :"+this.flavourCode);
		System.out.println("DryFruits :"+this.dryFruits);
		System.out.println("Topping :"+this.toping);
		System.out.println("Price :"+this.price);
		System.out.println("GST :"+GST);
		System.out.println("Total Price :"+total);
		System.out.println("------------");
	}
	public static void main(String[] args) 
	{
		Icecream i1=new Icecream(3,true);
		//Icecream i2=new Icecream(2,true,"chacho");
		i1.show();
		//i2.show();
	}
}

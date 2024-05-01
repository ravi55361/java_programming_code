package org.com.rs;

public class Mobile {
	String brand;
	String color;
	int price;
	Mobile(String b,String c,int p)
	{
		this.brand=b;
		this.color=c;
		this.price=p;
		System.out.println(this.brand+" "+this.color+" "+this.price);
	    
	}
	 

	public static void main(String[] args) {
		Mobile m1=new Mobile("oneplus","Black",46000);
		Mobile m2=new Mobile("Iphone","white",100000);
		Mobile m3=new Mobile("Redmi","Blue",20900);
		

	}

}

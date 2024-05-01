package org.com.rs;

public class Bikes {
	String name;
	String color;
	int price;
	int tax;
	int total;
	public Bikes(String n,String c,int p,int t) {
		this.name=n;
		this.color=c;
		this.price=p;
		this.tax=t;	
	}	
	void total_price() {
		System.out.println(this.name);
		System.out.println(this.color);
		total=this.price+this.tax;
		System.out.println(this.total);
	}
	public static void main(String[] args) {
		Bikes b1=new Bikes("Ktm","yellow",500000,5000);
		b1.total_price();
		Bikes b2=new Bikes("ninja","blue",450000,5000);
		b2.total_price();	
	}
}

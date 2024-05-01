package org.com.rs;

public class Display {
	void display() {
        System.out.println("DISPLAY1!!!!");
	}
	void display2() {
		System.out.println("DISPLAY2!!!");
		this.display();
	}

	public static void main(String[] args) {
		Display d=new Display();
		d.display2();
		

	}

}

package Interface;

public class Celing_Fan extends Fan
{
	Celing_Fan(String brand,String color,int price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public static void main(String[] args) {
		System.out.println("Sub-Class Celing Fan");
		Celing_Fan t=new Celing_Fan("Bajaj","White",3500);
		t.details();
		t.switchOn();
		t.incSpeed();
		t.decSpeed();
		t.switchOff();
	}

}

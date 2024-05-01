package Interface;

public class TableFan extends Fan
{
	TableFan(String brand,String color,int price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public static void main(String[] args) {
		System.out.println("Sub-Class Table Fan");
		TableFan t=new TableFan("Bajaj","White",3500);
		t.details();
		t.switchOn();
		t.incSpeed();
		t.decSpeed();
		t.switchOff();
	}

}

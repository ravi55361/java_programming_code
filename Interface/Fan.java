package Interface;

public class Fan implements Swich,Regulater
{
	String brand ,color;
	int price;
	
	void details()
	{
		System.out.println("Brand = "+brand);
		System.out.println("Color = "+color);
		System.out.println("Price = "+price);
	}
	
	@Override
	public void incSpeed()
	{
		System.out.println("Fan Speed Incresed!!!");
	}
	@Override
	public void decSpeed()
	{
		System.out.println("Fan Speed Decresed!!!");
	}
	@Override
	public void switchOn()
	{
		System.out.println("Switched On!!!");
	}
	@Override
	public void switchOff()
	{
		System.out.println("Switched Off!!!");
	}

}

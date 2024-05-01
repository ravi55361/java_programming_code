package generalisation;

class Shoe extends Product
{
	String brand,color;
	int price;
	@Override
	void details()
	{
		System.out.println("brand: "+brand);
    	System.out.println("Color: "+color);
    	System.out.println("Price: "+price);
    	System.out.println("*****************");
	}
	public Shoe(String brand,String color,int price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;	
	}
}
class Tv extends Product
{
	String brand,type;
	int size;
	@Override
	void details()
	{
		System.out.println("brand: "+brand);
    	System.out.println("Size: "+size);
    	System.out.println("Type: "+type);
    	System.out.println("*****************");
	}
	public Tv(String brand,String type,int size)
	{
		this.brand=brand;
		this.type=type;
		this.size=size;	
	}
}

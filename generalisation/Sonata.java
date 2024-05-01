package generalisation;

public class Sonata extends Watch
{
	public Sonata(String name,String color,String shape,int price) 
	{
		this.name=name;
		this.color=color;
		this.shape=shape;
		this.price=price;
	}
	 void show()
	    {
	    	System.out.println("Name: "+name);
	    	System.out.println("Color: "+color);
	    	System.out.println("Shape: "+shape);
	    	System.out.println("Price: "+price);
	    	System.out.println("*****************");
	    }
}


package generalisation;

public class Watch 
{
    String name,color,shape;
    int price;
     void show()
    {
    	System.out.println("Name: "+name);
    	System.out.println("Color: "+color);
    	System.out.println("Shape: "+shape);
    	System.out.println("Price: "+price);
    	System.out.println("*****************");
    }
    public static void main(String[] args) {
    	Titan t1=new Titan("Titan-10","Gray","Round",7800);
		Titan t2=new Titan("Titan-1r","Black","Circle",14000);
		Sonata t3=new Sonata("Sonata plus","Golden","Round",2300);
		Sonata t4=new Sonata("Sonata tq","Silver","Rectangle",1800);
		Noise t5=new Noise("Noise-1er","Black","Round",2500);
		Noise t6=new Noise("Noise-2p","Dark Gray","Rectangle",2000);
		Object arr[] ={t1,t2,t3,t4,t5,t6};//Watch arr[] ={t1,t2,t3,t4,t5,t6};
		for(int i=0;i<arr.length;i++)
		{
			((Watch) arr[i]).show();//arr[i].show();
		}			
	}
}

package generalisation;
public class Test 
{
	public static void main(String[] args) {
		Shoe s1=new Shoe("Nike","White",3400);
		Shoe s2=new Shoe("US-Polo","Black",2500);
		Tv t1=new Tv("Samsung","LED",50);
		Tv t2=new Tv("Oneplus","LED",42);
		Product arr[]={s1,s2,t1,t2};
		Tv y=(Tv)arr[3];
		Shoe x=(Shoe)arr[1];
		x.details();
		System.out.println("----------------");
		y.details();
		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i].details();
//		}	
	}
}


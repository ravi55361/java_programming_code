package Programing;

public class PatternChar {

	public static void main(String[] args) {
		int num=5,n=65;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)n+" ");
				n++;
			}
			
			System.out.println();
		}
		System.out.println("------------------");
		for(int i=1;i<=num;i++)
		{
			int n1=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)n1+" ");
				n1++;
			}
			
			System.out.println();
		}
		System.out.println("------------------");
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		System.out.println("------------------");
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		System.out.println("------------------");
		for(int i=1;i<=5;i++)
		{
//			String str="Ravi";
			for(int j=1;j<=i;j++)
			{
				System.out.print("Ravi");  
			}
			
			System.out.println();
		}
		System.out.println("------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i>=j)
				{
					if(j%2!=0)
						System.out.print(1);
					else
						System.out.print(0);
				}
				System.out.print("");
			}
			
			System.out.println();
		}
		System.out.println("------------------");
		int star=1,space=n-1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k%2!=0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
			space--;
			star+=2;
		}
	}
}

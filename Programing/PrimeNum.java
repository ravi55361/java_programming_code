package Programing;

import java.util.Scanner;
//w a j p to read a number from user and check its number is prime or not
public class PrimeNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number :--");
		int n=s.nextInt();
		
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					System.out.println("------------------------");
					System.out.println(i+" Num is Composite Number!!");
					System.out.println("------------------------");
					//System.out.println("factor is "+i);
					//System.out.println(i+" is Prime Number!!");
				}	
			}
			if(count==0)
			{
				System.out.println("------------------------");
				System.out.println(i+" is Prime Number!!");
				System.out.println("------------------------");
			}
		}
		
		//else
		//System.out.println(n+" not a Prime Number!!");	
	// W A J P to count even number
	System.out.println("---------Second Qns----------");
	int n2=10,c=0;
	for(int i=1;i<=n2;i++)
	{
		if(n2%i==0)
		{
			c++;
		}
	}
	System.out.println("count is "+c);
  }
}

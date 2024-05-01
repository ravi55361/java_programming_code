package Programing;

import java.util.Scanner;
public class RangeOfPrimeNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number to want range of prime num :--");
		int n=s.nextInt();
		System.out.println("-------------");
		System.out.println("Enter Number to want prime num :--");
		int num=s.nextInt();
		int ncount=0;
		System.out.println("-------------");
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}	
			}
			if(count==2)
			{
				ncount++;
				System.out.println(i+" is Prime Number!!");
				if(ncount==num)
				{
					System.out.println("-------------");
					System.out.println(i+" is "+ num+"rd Prime Number!!");
					break;
				}
			}
			
		}

	}

}

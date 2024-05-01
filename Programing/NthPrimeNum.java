// write a java program nth prime number
package Programing;

import java.util.Scanner;

public class NthPrimeNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter nth Number  :--");
		int nth=s.nextInt();
		int ncount=0;
		for(int i=1;true;i++)
		{
			int n=i,count=0;
			for(int j=1;j<=n;j++)
			{
				if(n%i==0)
				{
					count++;
				}
			}	
			if(count==2)
			{
				ncount++;
				if(nth==ncount) 
				{
					System.out.println(n);
					break;
				}
			}
			
			
		}

	}

}

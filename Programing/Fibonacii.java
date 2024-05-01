// fibonacci number series
package Programing;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number---");
		int num=s.nextInt();
		int fnum=0,snum=1;
		int sum=0;
		sum=fnum+snum;
		System.out.println("-------------------");
		if(num==1)
			System.out.println(fnum);
		else if(num==2)
			System.out.println(snum);
		else if(num>2)
		{		
			System.out.println(fnum);
		    System.out.println(snum);
			for(int i=3;i<=num;i++)
			{
				System.out.println(sum);
				fnum=snum;
				snum=sum;
				sum=fnum+snum;
			}
			
		}

	}

}

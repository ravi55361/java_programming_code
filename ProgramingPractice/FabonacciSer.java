package ProgramingPractice;

import java.util.Scanner;

public class FabonacciSer {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int a=0,b=1;
		int sum=0;
		int sum1=a+b;
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++)
		{
			sum=a+b;
		    System.out.print(" "+sum);
		    a=b;
		    b=sum;
		    sum1=sum+sum1;
		    
		}
		System.out.println();
		System.out.println(sum1);
		sc.close();
	}

}

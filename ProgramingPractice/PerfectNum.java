package ProgramingPractice;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int fac=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				fac=fac+i;
		}
		if(fac==n)
			System.out.println("Perfet number "+n);
		else
		    System.out.println("Not perfect num "+n);
		sc.close();
	}
}

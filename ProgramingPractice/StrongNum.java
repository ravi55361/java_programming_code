package ProgramingPractice;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			int d=n%10;
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("strong num "+temp);
		else
			System.out.println("not strong num");
		sc.close();
	}

}

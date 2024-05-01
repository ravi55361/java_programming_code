package ProgramingPractice;

import java.util.Scanner;

public class RangeStrongNum {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			int t=j;
			int sum=0;
			int temp=t;
			while(t!=0)
			{
				int d=t%10;
				int fact=1;
				for(int i=1;i<=d;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				t=t/10;
			}
			if(temp==sum)
				System.out.println("strong num "+temp);
//			else
//				System.out.println("not strong num");
			sc.close();
		}

	}

}

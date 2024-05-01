package ProgramingPractice;

import java.util.Scanner;

public class RangeArmstrongNum {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			int temp=i;
			int sum=0;
			while(temp>0)
			{
				int d=temp%10;
			    sum=sum+(d*d*d);
			    temp=temp/10;
			}
			if(i==sum)
				System.out.println("armstrong num "+i);
		}
        sc.close();
	}

}

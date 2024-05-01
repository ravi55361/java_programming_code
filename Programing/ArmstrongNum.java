// arm strong number.
package Programing;

import java.util.Scanner;

public class ArmstrongNum {
	public static int count(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static int power(int m,int n)
	{
		int power=1;
		for(int i=1;i<=n;i++)
			power=power*m;
		return power;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number---");
		int num=s.nextInt();
		int temp=num;
		int sum=0;
		int digit=count(num);
		while(num!=0)
		{
			int last=num%10;
			sum=sum+power(last,digit);
			num=num/10;
		}
		if(sum==temp)
			System.out.println(temp+" is armstrong number!!!");
		else
			System.out.println(temp+" is not a armstrong number!!!");
		s.close();

	}

}

package ProgramingPractice;

import java.util.Scanner;

public class Add1AndLast 
{
    public static void main(String[] args) {
    	System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int f=0;
		int l=n%10;
		while(n!=0)
		{
			f=n%10;
			n=n/10;
		}
		int sum=l+f;
		System.out.println(sum);
		sc.close();
	}
}

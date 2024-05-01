package ProgramingPractice;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int rev=0;
		while(n!=0)
		{
			int lastDigit=n%10;
			rev=rev*10+lastDigit;
			n=n/10;
		}
		System.out.println("Reverse num "+rev);
		sc.close();
	}

}

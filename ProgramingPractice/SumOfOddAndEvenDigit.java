package ProgramingPractice;

import java.util.Scanner;

public class SumOfOddAndEvenDigit {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int Esum=0;
		int Osum=0;
		while(n!=0)
		{
			int l=n%10;
			if(l%2==0)
				Esum+=l;
			else
				Osum+=l;
			n=n/10;
		}
		System.out.println("Sum of even num "+Esum);
		System.out.println("Sum of Odd num "+Osum);
		sc.close();
		
	}

}

package Programing;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int f=s.nextInt();
		int fact=1;
		int sq=1;
		for(int i=1;i<=f;i++)
		{
			//factorial of the number
			fact=fact*i;
			//power of a digit =n to n
			sq=sq*f;
		}
        System.out.println("Factorial "+fact);
        System.out.println(f+" times multiplication of "+f+" is "+sq);
	}

}

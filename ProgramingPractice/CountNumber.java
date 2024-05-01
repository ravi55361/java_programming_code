package ProgramingPractice;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("total digits "+count);
		sc.close();
	}

}

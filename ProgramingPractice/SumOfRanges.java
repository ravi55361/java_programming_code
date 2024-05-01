package ProgramingPractice;

import java.util.Scanner;

public class SumOfRanges {

	public static void main(String[] args) {
		System.out.println("Enter num");
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
        System.out.println("Total Sum "+sum);
        sc.close();
	}

}

package Programing;

import java.util.Scanner;
//sum of odd and even number.
public class SumEven {

	public static void main(String[] args) {
		System.out.println("Enter Number!!");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int last=0,sumEven=0,sumOdd=0;
		while(num!=0)
		{
			last=num%10;
			if(last%2==0)
			{
				sumEven=sumEven+last;
			}
			else
				sumOdd=sumOdd+last;
			num=num/10;
		}
        System.out.println("sum of even number!! ="+sumEven);
        System.out.println("sum of odd number!! ="+sumOdd);
	}

}

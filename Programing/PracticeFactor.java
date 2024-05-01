package Programing;

import java.util.Scanner;

public class PracticeFactor {

	public static void main(String[] args) {
		System.out.println("Enter num!!");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<num+1/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("Factor are "+num+" is "+i);
				count++;
			}
		}
		System.out.println(count+" is total factor of num : "+num);
        sc.close();
	}

}

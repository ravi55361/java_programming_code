package ProgramingPractice;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+(d*d*d);
			n/=10;
		}
        if(temp==sum)
        	System.out.println("armstrong num "+temp);
        else
        	System.out.println("not armstrong num");
        sc.close();
	}

}

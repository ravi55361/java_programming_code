package Programing;
import java.util.Scanner;
public class PerfectNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number :--");
		int n=s.nextInt();
		int fact=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				fact=fact+i;	
		}
		if(n==fact)
			System.out.println(n+" is perfect number");
		else
			System.out.println(n+" is not perfect number");
	}
}

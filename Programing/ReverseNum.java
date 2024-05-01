package Programing;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		System.out.println("Enter Number!!");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0,last=0,sum=0,mul=1;
		while(num!=0)
		{
			last=num%10;
			rev=rev*10+last;
			sum=sum+last;
			mul=mul*last;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("Number "+temp+" Is Palindrom ");
		else
			System.out.println("Number "+temp+" Is Not Palindrom ");	
        System.out.println("Reverse Num!! "+rev);
        System.out.println("Sum Of Own Digits ="+sum);
        System.out.println("Multiplication of own digits ="+mul);
	}
}

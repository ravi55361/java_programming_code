//add first digit and last digit.
package Programing;
import java.util.Scanner;
public class AddFirstLastdig {
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter Number :--");
	   int num=s.nextInt();
       int sum=0;
       int lastDigit=num%10;
       int firstDigit=0;
       while(num!=0) {
    	   firstDigit=num%10;
    	   num=num/10;
       }
       sum=lastDigit+firstDigit;
       System.out.println("sum of 1st and last digit :"+sum);
       s.close();
	}
}

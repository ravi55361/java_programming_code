package Programing;

import java.util.Scanner;

public class Sylime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number---");
		int num=s.nextInt();
		int temp=num;
		int sfl=num%10;
		num=num/10;
		int sm=0,last=1;
		while(num!=0)
		{
		    last=num%10;
			if(num<=9)
				sfl=sfl+last;
			else
				sm=sm+last;
		num=num/10;
		}
       if(sfl==sm)
    	   System.out.println(temp+" Xylem number!!!");
       else
    	   System.out.println(temp+" Poleam number!!!");	
	}
	
}

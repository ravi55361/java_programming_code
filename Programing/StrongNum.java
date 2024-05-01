//number is strong number or not.
package Programing;

import java.util.Scanner;

public class StrongNum {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number---");
		int num=s.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int last=num%10;
			sum=sum+fact(last);
			num=num/10;			
		}
	    if(temp==sum)
	    	System.out.println(temp+" Is Strong Number!!");
	    else
	    	System.out.println(temp+" Is Not Strong Number!!");
	}
	    public static int fact(int n)
	    {
	    	 int fact=1;
	    	 for(int i=1;i<=n;i++)
	    	 {
	    		 fact=fact*i;
	    	 }
	    	 return fact;  
   }  
}

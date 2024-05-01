package ProgramingPractice;

import java.util.Scanner;

public class XylomAndPolemNum {

	public static void main(String[] args) {
		System.out.println("Enter num ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int temp=n;
		int f=0;
		int l=n%10;
		int sfl=0;
		int sm=0;
		n=n/10;
		while(n!=0)
		{
			f=n%10;
			if(n<=9)
				sfl=l+f;
			else
				sm+=f;
			n=n/10;
		}
        if(sfl==sm)
        	System.out.println("Xylem Num "+temp);
        else
        	System.out.println("Phloem Num "+temp);
        sc.close();
	}

}

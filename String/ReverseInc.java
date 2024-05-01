package String;

import java.util.Scanner;

public class ReverseInc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter String!!!");
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			rev=rev+(++ch);
		}
        System.out.println(rev);
	}

}

package String;

import java.util.Scanner;

public class LengthString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String!!!");
		String str=sc.nextLine();
		int length=0;
		for(int i=0;i<str.length();i++)
		{
			length++;
		}
		System.out.println("Length of the "+str+" is "+length);
        sc.close();
	}

}

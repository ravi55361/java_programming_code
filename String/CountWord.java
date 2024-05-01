package String;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter String!!!");
		String str=sc.nextLine();
		str=str.trim();//remove first and last extra space
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch==' ' && str.charAt(i+1)!=' ')||i==str.length()-1)
			{
				count++;
				
			}
		}
		System.out.println(count);

	}

}

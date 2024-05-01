package String;

import java.util.Scanner;

public class RemoveDuplicateChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter String!!!");
		String str=sc.nextLine();
		String temp="";
		System.out.println("Orignal String!!!!");
		System.out.println("String is "+str);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(temp.indexOf(ch)==-1)
			{
				temp=temp+ch;
			}
		}
		System.out.println("After Remove Dublicate Character!!");
		System.out.println("New String is "+temp);
	}
}
//java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\x{2c}][decimal separator=\x{2e}

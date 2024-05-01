package String;

import java.util.Scanner;

public class RemoveWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String!!!");
		String str=sc.nextLine();
		System.out.println("Enter word you want to remove!!!");
		String word=sc.nextLine();
		String temp="";
		String concat="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch==' ' && str.charAt(i+1)!=' ')||i==str.length()-1)
			{
				if(i==str.length()-1)
					concat=concat+ch;
				if(!concat.equalsIgnoreCase(word))
				{
					temp=temp+concat+" ";
				}
				concat="";	
			}
			else
			{
			   concat=concat+ch;  	
			}	
		}
        System.out.println(temp);
        sc.close();
	}

}

package String;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String!!!");
		String str=sc.nextLine();
		String rev="";
		String concat="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch==' ' && str.charAt(i+1)!=' ')||i==str.length()-1)
			{
				if(i==str.length()-1)
					rev=concat+ch+' '+rev;
				else
					rev=concat+ch+rev;
				concat="";
			}
			else
			{
			   concat=concat+ch;  	
			}	
		}
		rev=rev.trim();
        System.out.println(rev);
        sc.close();
	}

}

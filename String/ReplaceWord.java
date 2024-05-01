package test.org.jsp.demo;

import java.util.Scanner;

public class ReplaceWord {

	public static void main(String[] args) {
          System.out.println("Enter string!!!!");
          Scanner sc=new Scanner(System.in);
          String sent=sc.nextLine();
          System.out.println("Enter Word to be replaced!!!");
          String oldWord=sc.next();
          System.out.println("Enter new word!!!");
          String newWord=sc.next();
//        char [] arr=sent.toCharArray();
          int len=0;
          int space=1;
//          for(char ch:arr)
//          {
//        	  len++;
//          }
          try {
        	while(true)
        	{
        		sent.charAt(len);
        		len++;
        	}
          }
          catch(Exception e)
          {	  
          }
          for(int i=0;i<len;i++)
          {
        	  if(sent.charAt(i)==' ')
        	  {
        		  space++;
        	  }
          }
          String str []=new String[space];
          String word="";
          int j=0;
          for(int i=0;i<len;i++)
          {
        	  char ch=sent.charAt(i);
          	if((ch==' '&&sent.charAt(i+1)!=' ')||i==len-1)
          	{
          		if(i==len-1)
          			word=word+ch;
          		str[j++]=word;
          		word=""; 
          	}
          	else
          		word=word+ch;
          }
          for(int i=0;i<space;i++)
          {
        	  int code1=str[i].hashCode();
        	  int code2=oldWord.hashCode();
        	  if(code1==code2)
        	  {
        		  str[i]=newWord;
        	  }
          }
          for(String s:str) {
        	  System.out.print(s+" ");
          }
          
          sc.close();
	}
}

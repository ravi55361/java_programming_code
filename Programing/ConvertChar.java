package Programing;
import java.util.Scanner;
public class ConvertChar 
{ 
	public static void main(String[] args) 
	{
		Scanner var =new Scanner(System.in);
		System.out.println("Enter Charater!!!");
		char ch=var.next().charAt(0);
		if(ch >64 && ch<91)
		{
			System.out.println("Upper Case");
			System.out.println("-----After Converting------");
			System.out.println((char)(ch+32));		
		}
		else if(ch >96 && ch<123)
		{
			System.out.println("lower Case");
			System.out.println("-----After Converting------");
			System.out.println((char)(ch-32));
		}
		else
			System.out.println("invalid Character");
 	}
}

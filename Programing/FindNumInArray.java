package Programing;

import java.util.Scanner;

public class FindNumInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value!!!");
		int size =sc.nextInt();
		int arr []=new int[size];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number you want to search!!!");
		int num =sc.nextInt();
		System.out.println("Enter number you want to search!!!");
		Scanner s1=new Scanner(System.in);
		String d =s1.nextLine();
		String s ="ravi";
		System.out.println();
		System.out.println(d+" "+s);
		int count=0;
		for(int j=0;j<=arr.length-1;j++)
		{
			if(num==arr[j])
			{
				System.out.println(num+" Is Found!!!");
				count++;
				break;
			}
			count=arr.length;
		}
		if(count==size)
			System.out.println("not found!!");
	}

}

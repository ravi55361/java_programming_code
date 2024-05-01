package Programing;

import java.util.Scanner;

public class SecMInNYum {

	public static void main(String[] args) {
		// TODO Auto-generated method Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value!!!");
		int size =sc.nextInt();
		int arr []=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]<min1)
			{
				min2=min1;
				min1=arr[i];
			}
			else if(min2>arr[i])
				min2=arr[i];
		}
        System.out.println("2nd Smallest Number!!!"+min2);


	}

}

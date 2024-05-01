package Programing;

import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value!!!");
		int size =sc.nextInt();
		int arr []=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
        System.out.println("largest Number!!!"+max);
	}

}

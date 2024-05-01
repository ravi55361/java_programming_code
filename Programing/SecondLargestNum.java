package Programing;

import java.util.Scanner;

public class SecondLargestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value!!!");
		int size =sc.nextInt();
		int arr []=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(max2<arr[i])
				max2=arr[i];
		}
        System.out.println("2nd largest Number!!!"+max2);

	}

}

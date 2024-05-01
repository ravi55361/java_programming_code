package Programing_Array;

import java.util.Scanner;

public class FindGreatestNumInEveryRow {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row :");
		int row =sc.nextInt();
		System.out.println("Enter Colum :");
		int col= sc.nextInt();
		int [][] arr=new int[row][col];
		int largestNumber=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print("Enter "+i+" Row And "+j+" Column :");
				arr[i][j]=sc.nextInt();
			}
			System.out.println("----------------------------");
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			int num=Integer.MIN_VALUE;
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if(num<arr[i][j])
					num=arr[i][j];
				if(largestNumber<arr[i][j])
					largestNumber=arr[i][j];
			}
			System.out.println("-----------------------------------------------");
			System.out.println(num+" Is The Largest Number In Every Row!!!");
		}	
		for(int i=0;i<=arr[0].length-1;i++)
		{
			int num=Integer.MIN_VALUE;
			for(int j=0;j<=arr.length-1;j++)
			{
				if(num<arr[j][i])
					num=arr[j][i];
			}
			System.out.println("-----------------------------------------------");
			System.out.println(num+" Is The Largest Number In Every Column!!! ");
		}
		System.out.println("-----------------------------------------------");
		System.out.println(largestNumber+" Is The Largest Number In The Array!!!");
		int num=Integer.MIN_VALUE;
		for(int i=0;i<=arr[0].length-1;i++)
		{	
			for(int j=0;j<=arr.length-1;j++)
			{
				if(i==j)
				{
					if(num<arr[j][i])
						num=arr[j][i];
				}
			}
		}
		System.out.println("-----------------------------------------------");
		System.out.println(num+" Is The Largest Num In Digonal Element!!!");
	}
}

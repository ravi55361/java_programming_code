package Programing_Array;

import java.util.Scanner;

public class PrimeNumInDigonal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row :");
		int row =sc.nextInt();
		System.out.println("Enter Colum :");
		int col= sc.nextInt();
		int [][] arr=new int[row][col];
		int count=0;
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
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if(i==j)
				{
					for(int k=1;k<arr[i][j];k++)
					{
						if(arr[i][j]%2==0)
							count++;
					}
				}
				if(count==2)
					System.out.println("prime num"+arr[i][j]);
			}
			
		}

	}

}

package Programing;

import java.util.Scanner;

public class Read2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row :");
		int row =sc.nextInt();
		System.out.println("Enter Colum :");
		int col= sc.nextInt();
		int [][] arr=new int[row][col];
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("Enter "+i+" Row And "+j+"Column :");
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

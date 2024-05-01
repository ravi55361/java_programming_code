package Programing_Array;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size!!");
		int size=sc.nextInt();
		int [][]arr=new int[size][];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter SizeOf 2nd Array!!!!");
			int s=sc.nextInt();
			arr[i]=new int[s];
			for (int k=0;i<arr[i].length;k++)
			{
				arr[i][k]=sc.nextInt();
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
		sc.close();
	}
}

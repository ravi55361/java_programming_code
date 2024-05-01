package Programing_Array;

import java.util.Arrays;

public class SubArray 
{
	public static int subCount(int []arr)
	{
		Arrays.sort(arr);
		int count=1;
		int maxCount=1; 
		for(int i=1;i<arr.length-1;i++)
		{
			int num1=arr[i];
			num1=num1+1;
			int num2=arr[i+1];
			if(num1==num2)
			{
				count++;
			}
			else if(num1!=num2)
			{
				count=1;
			}
			maxCount=Math.max(maxCount, count);
		}
		return maxCount;	
	}
	public static void main(String[] args) 
	{
		int brr[]={2,3,6,7,8,9,10,11,15,12,13,17};
		int ans=subCount(brr);
		System.out.println(ans);
	}
}

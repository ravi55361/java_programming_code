package Programing_Array;

public class MinOfarray {
    public static void main(String[] args) {
		int arr[]= {10,5,15,7,3,21};
		int brr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			brr[0]=-1;
			for(int j=1;j<i+1;j++)
			{
				if(arr[i]>arr[j])
				{
					brr[j]=-1;
				}
				else
					brr[j]=arr[j];
				
			}
		}
//		for(int i=arr.length-1;i>0;i--)
//		{
//			for(int j=i-1;j>0;j--)
//			{
//				if(arr[i]>arr[j])
//					brr[i]=arr[j];
//			}
//			brr[0]=-1;
//		}
		for(int i:brr)
		{
			System.out.println(i);
		}
	}
}

package Programing_Array;

public class IgnoringIndex {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int result=1;
			
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					result=result*arr[j];
				}
			}
			arr1[i]=result;
		}
		
		for(int n:arr1)
		{
			System.out.print(n+" ");
		}

	}

}

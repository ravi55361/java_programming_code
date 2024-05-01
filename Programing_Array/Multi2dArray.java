package Programing_Array;

public class Multi2dArray {

	public static void main(String[] args) {
		int [] [] arr1= {{1,2,3,5},{4,5,6,2}};
		int [] [] arr2= {{4,1,20},{3,3,6},{2,7,1},{1,10,5}};
		int [][] arr3=new int[arr1.length][arr2[0].length];
		if(arr1[0].length==arr2.length)
		{
			for(int i=0;i<arr3.length;i++)
			{
				for(int j=0;j<arr3[i].length;j++)
				{
					int sum=0;
					for(int k=0;k<arr1[0].length;k++)
					{
						sum=sum+arr1[i][k]*arr2[k][j];
						//arr3[i][j]=arr1[i][k]*arr2[k][j];					
					}
					arr3[i][j]=sum;
				}
			}
			for (int[] a:arr3)
			{
				for (int b:a)
					System.out.print(b+" ");
				System.out.println();
			}
		}

	}

}

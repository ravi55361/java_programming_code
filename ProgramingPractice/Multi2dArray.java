package ProgramingPractice;

public class Multi2dArray {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6}};
		int [][]brr= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]crr= new int[arr.length][brr[0].length];
		if(arr[0].length==brr.length)
		{
			for(int i=0;i<crr.length;i++)
			{
				for(int j=0;j<crr[i].length;j++)
				{
					int sum=0;
					for(int k=0;k<arr[0].length;k++)
					{
						sum=sum+arr[i][k]*brr[k][j];
					}
					crr[i][j]=sum;
				}
			}
			for (int[] a:crr)
			{
				for (int b:a)
					System.out.print(b+" ");
				System.out.println();
			}
		}

	}

}

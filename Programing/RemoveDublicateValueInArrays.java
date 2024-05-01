package Programing;

public class RemoveDublicateValueInArrays {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,10,20,50,60,40,70};
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=-1)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
	
	}
}
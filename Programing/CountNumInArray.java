package Programing;

public class CountNumInArray {

	public static void main(String[] args)
	{
		int [] arr = {2,4,3,6,2,4,8,9,3,6,10,98};
		boolean []brr= new boolean[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{ 
			int n=arr[i];
			int count=0;
			if(brr[i]==false)
			{
				for(int j =0;j<=arr.length-1;j++)
				{
					if(n==arr[j])
					{ 
						count++;
						brr[j]=true;
					}
				
				}
				System.out.println(arr[i]+" is repeated for "+count+" times!!");
			}
			    
		}
	}
}

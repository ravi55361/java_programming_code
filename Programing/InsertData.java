package Programing;

public class InsertData {

	public static void main(String[] args)
	{
		int [] arr= {10,20,30,40,50};
		int [] temp= new int [arr.length+1];
		int index=1;
		int value=60;
		int indexArr=0;
		for(int i=0;i<=temp.length-1;i++)
		{
			if(i==index)
			{
				temp[i]=value;
			}
			else 
			{
				temp[i]=arr[indexArr];
						indexArr++;
			}
			System.out.println(temp[i]);
		}
		
	}
}

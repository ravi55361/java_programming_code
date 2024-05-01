package Programing;

public class MargingTwoArray {

	public static void main(String[] args) {
		int [] arr1= {10,20,30,40,50};
		int [] arr2= {60,70,80,90,100};
		int [] arr3= new int[arr1.length+arr2.length];
		for(int i=0;i<=arr3.length-1;i++)
		{
			if(i<=arr1.length-1)
				arr3[i]=arr1[i];
			else
				arr3[i]=arr2[i-arr1.length];
		}
		for(int i=0;i<=arr3.length-1;i++)
		{
			System.out.println(arr3[i]);
		}

	}

}

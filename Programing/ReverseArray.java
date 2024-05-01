package Programing;

public class ReverseArray {
	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50,60,70,80,90,100};
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		for(int i:arr)
			System.out.println(i);
	}
}

package Programing;

public class Reverse {

	public static void main(String[] args) {
		int arr[]= {71,55,29,36,98};
		int start=0;
		int end=arr.length-1;
		while(start<end);
		{
			int temp=arr[start];
			arr [end]=arr[end];
			arr[end]=temp;
			start++;
			end--;
					
		}
		for(int a:arr)
		{
			System.out.println(a);
		}
			
	}
	
}

package Programing;
// in bubble sort alogritm if their are n  number of data then n-1 itresain is required. 
//for every itersion one data is placed in it its acutal place..
//for every itresion 1 element is campared with 2 and hence repeted.... nth num is compared with no or unshorted elements.
//if nth element is greated n+1 element then shawping is performed...
public class ShortingArray {

	public static void main(String[] args) {
	 int [] arr= {50,10,20,9,6,7,2,-1};
	 for(int i=0;i<=arr.length-2;i++)
	 { 
		 for(int j=0;j<arr.length-1;j++)
		 { 
			 if(arr[j]>arr[j+1])
			 {
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		 }
	 }
	 for(int a:arr)
		 System.out.println(a);
	}

}

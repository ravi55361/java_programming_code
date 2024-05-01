package org.com.rs;

public class Array 
{
   public static void main(String[] args)
   {
	   int i=0;
	   int arr[]= {100,200,300,400,500,600,700,800,900,1000};
	   for( i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   System.out.println("-----------");
	   for(i=arr.length-1; i>=0;i--)
	   {
		   System.out.println(arr[i]);
	   }
	   System.out.println("-----------");
	   for( i=2;i<arr.length-2;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   System.out.println("-----------");
	   for( i=0;i<arr.length/2;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   System.out.println("-----------");
	   for( i=5;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   System.out.println("-----------");
	   for( i=arr.length-3;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   System.out.println("-----------");
	   
	   
	
}
   
}

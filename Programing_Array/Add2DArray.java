package Programing_Array;

public class Add2DArray {

	public static void main(String[] args) {
		int [] [] arr1= {{2,4},{5,9},{8,9}};
		int [] [] arr2= {{2,8},{5,6},{8,4}};
		int [] [] arr3= new int [arr1.length] [arr1[0].length];
		if(arr1.length==arr2.length && arr1[0].length==arr2[0].length)
        {
	         for (int i=0;i<arr1.length;i++)
	         {
	        	 for(int j=0;j<arr1[i].length;j++)
	        		 arr3[i][j]=arr1[i][j]+arr2[i][j];
	         }
//           normal loop
//	         for (int i=0;i<arr1.length;i++)
//	         {
//	     	   for(int j=0;j<arr1[i].length;j++)
//	 	     		 System.out.print(arr3[i][j]+" ");
//	     	  System.out.println();
//	         for each loop
             for(int [] a: arr3)
             {
            	 for(int b: a)
            		 System.out.print(b+" ");
    	     	 System.out.println();
             }  
        }
		else
			System.out.println("invalid array!!!");
	}
}

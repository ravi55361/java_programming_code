// for each loop only for array or collections ,
// no of itrataion is equals to number of array or number of collections,
// the type of variable is similier to type of data in array or collections
package Programing;

public class ForEach {
    
	public static void main(String[] args) {
		int [] arr= {20,20,50,40,80,63};
		int count=0;
		for(int x:arr)
		{
			System.out.print(x+" ");
			count++;
		}
		System.out.println("\nNumber Of Count "+count);
	}

}

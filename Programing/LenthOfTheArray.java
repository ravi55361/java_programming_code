// find length of the array without using length mathod
package Programing;

public class LenthOfTheArray {

	public static void main(String[] args) {
		int count=0;
		int [] arr= {3,22,62,56,85};
		for(int i=0;true;i++)
		{
			try {
				int n=arr[i];
				System.out.println(n);
				count++;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				break;
			}
		}
		System.out.println(count);

	}

}

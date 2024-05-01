package Programing;

public class CountNum {

	public static void main(String[] args) {
		//count digits in number.
		int num=152365;
		int temp=0;
		while(num!=0)
		{
			num=num/10;
		    temp++;
		}
		System.out.println(temp);
	}
}

package ProgramingPractice;

public class WithoutUsingLoop {
	static int n=33;
	static void show(int num)
	{
		if(num<=n*10)
		{
			System.out.println(num);
			show(num+n);
		}
	}
	public static void main(String[] args) {
		System.out.println("Multipilcation of "+n);
		show(n);
	}

}

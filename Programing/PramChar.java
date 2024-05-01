package Programing;

public class PramChar {

	public static void main(String[] args) {
         System.out.println("------------------");
		int n=5,star=1,space=n-1;
		for(int i=1;i<=5;i++)
		{
			int no=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k<i) {
					System.out.print(no);
					no++;
				}
				else 
				{
					System.out.print(no);
					no--;
				}
			}
			System.out.println();
			space--;
			star+=2;
		}
	

	}

}
//              1
//              1 2 1
//            1 2 3 2 1
//           1 2 3 4 3 2 1
//            12321
//            121

package Programing;

public class PatternNo {

	public static void main(String[] args) {
		 System.out.println("------------------");
			int n=4,star=1,space=n-1;
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
					if(k>i)
					{
						System.out.print(no);
						no--;
					}
				}
				System.out.println();
				space--;
				star++;
			}

	}

}

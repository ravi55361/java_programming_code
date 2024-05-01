package Programing;

public class Test1 
{
   public static void main(String[] args) 
   {
	   int a=1,b;
	   int n=5;
	   for(int i =1;i<=n;i++)
	   {
			   b=a+(n-i);
		   for (int j=1;j<=n;j++)
		   {
			   if(i<=j) {
				   if(i%2!=0)
				   {
					   System.out.print(a+" ");
					   a++;
				   }
				   else
				   {
					   System.out.print(b+" ");
					   b--;
					   a++;
				   }
			   }
			   else
				   System.out.print("  ");
		   }
		   System.out.println();
	   }
	
   }		
}

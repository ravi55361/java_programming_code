package Programing;

public class NthArmsDtrongNum {

	public static void main(String[] args) {
		int nth=4,ncount=0;
		for(int j=1;true;j++)
		{
			int n=j,temp=n,sum=0;
			while(n!=0)
			{
				int last =n%10;
				sum=sum+fact(last);
				n/=10;
			}
			if(sum==temp)
			{
				ncount++;
				if(ncount==nth)
				{
					System.out.println(temp);
					break;
				}
			}
		}

	}
	public static int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}

}

package String;

public class AddAsciiValue {

	public static void main(String[] args) {
		String str="Ravi145sha87nkar0-1";
		int sum=0;
		int count=0;
		System.out.println(str);
		System.out.println("-------------------------------");
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='0' && c<='9') 
			{
				sum=sum+(c-'0');
				count++;
			}
		}
		System.out.println("sum of numerice value of "+str+" is "+sum);
		System.out.println("Total number in "+str+" is "+count);
	}
}

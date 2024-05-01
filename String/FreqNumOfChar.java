package String;
// every char count it mean repeted char also.
public class FreqNumOfChar {

	public static void main(String[] args) {
		String str="Ravishankar";	
		System.out.println(str);
		System.out.println("-------------------------------");
		for(int i=0;i<str.length();i++)
		{
				int count=0;
				char c=str.charAt(i);
				for(int j=0;j<str.length();j++)
				{
					char ch=str.charAt(j);
					if(ch==c)
					{
						count++;
					}
				}
				System.out.println(c+" is "+count+" times in "+str);
		}

	}

}

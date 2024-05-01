package String;
//write a java program to check length of the string
// to remove duplicate char in string
public class FrequencyOfChar {

	public static void main(String[] args) {
		String str="entertainment";	
		boolean [] arr =new boolean[str.length()];
		System.out.println(str);
		System.out.println("-------------------------------");
		for(int i=0;i<str.length();i++)
		{
			if(arr[i]==false)
			{
				int count=0;
				char c=str.charAt(i);
				for(int j=0;j<str.length();j++)
				{
					char ch=str.charAt(j);
					if(ch==c)
					{
						count++;
						arr[j]=true;
					}
				}
				System.out.println(c+" is "+count+" times in "+str);
			}
		}
	}
}

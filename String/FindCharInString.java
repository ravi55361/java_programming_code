package String;

public class FindCharInString {

	public static void main(String[] args) {
		String str="Ravishankar";
		char ch='a';
		int count=0;
		System.out.println(str);
		System.out.println("-------------------------------");
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(ch==c)
				count++;
		}
		if(count>0)
			System.out.println(ch+" is found "+count+" times.");
		else
			System.out.println(ch+" is not found");
	}

}

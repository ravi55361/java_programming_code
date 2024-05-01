package String;

public class ReplaceWith$ {

	public static void main(String[] args) {
		String str="Apple";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(ch==str.charAt(j))
					count++;
			}
			if(count>1)
				str=str.replace(ch,'$');
		}
		System.out.println(str);
	}

}

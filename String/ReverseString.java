package String;

public class ReverseString {

	public static void main(String[] args) {
		String str="Mom";
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			temp=temp+ch;
		}
        System.out.println(str+" reverse : "+temp);
        if(temp.equalsIgnoreCase(str))
        	System.out.println(str+" is Palindrome");
        else
        	System.out.println(str+" is Not Palindrome");
	}

}

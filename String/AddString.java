package String;

public class AddString {

	public static void main(String[] args) {
        String str="Ravi Shankar";
        String temp=" love";
        String newStr="";
        int index=4;
        for(int i=0;i<str.length();i++)
        {
        	char ch=str.charAt(i);
        	if(i==index)
        	{
        		newStr=newStr+temp;
        	}
        		newStr=newStr+ch;
        }
        System.out.println(newStr);
	}

}

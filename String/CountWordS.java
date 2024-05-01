package String;

public class CountWordS {

	public static void main(String[] args) {
        String str="india is my india is my india country";
        int len=0;
        try {
        	while(true)
        	{
        		str.charAt(len);
        		len++;
        	}
        }
        catch(Exception e)
        { 	
        }
        System.out.println(len);
        int space=0;
        for(int i=0;i<len;i++) {
        	char c=str.charAt(i);
        	if(c==' ')
        	{
        		space++;
        	}
        }
        String arr []=new String[space+1];
        String word="";
        int j=0;
        
        for(int i=0;i<len;i++)
        {
        	char ch=str.charAt(i);
        	if((ch==' '&&str.charAt(i+1)!=' ')||i==str.length()-1)
        	{
        		if(i==str.length()-1)
        			word=word+ch;
        		arr[j++]=word;
        		word="";
        	}
        	else
        		word=word+ch;
        }
        boolean bl[]=new boolean[space+1];
        for(int i=0;i<arr.length;i++)
        {
            int	count=0;
        	if(bl[i]==false)
        	{
        		for(int k=0;k<space+1;k++)
            	{
            		if(arr[i].equals(arr[k]))
            		{
            			count++;
            			bl[k]=true;
            		}
            	}
            	System.out.println(arr[i] +" "+count);
            	System.out.println("-------");
        	}
        }       
	}
}

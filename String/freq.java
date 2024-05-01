package String;

public class freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "my name is hrithik rajput";
        char[] ch = str.toCharArray();
        int[] freq=new int[str.length()];
        
        for(int i=0;i<str.length();i++) {
        	freq[i]=1;
        	for(int j=i+1;j<str.length();j++) {
        		if(ch[i]==ch[j]) {
        			freq[i]++;
        			ch[j]='0';
        		}
        	}
        }
        
        for(int i=0;i<freq.length;i++) {
        	if(freq[i]!=' ' && freq[i]!='0') {
        		System.out.println(freq[i]+"====="+ch[i]);
        	}
        }
	}

}

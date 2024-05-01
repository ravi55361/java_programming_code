package generalisation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	 public static void main(String[] args) throws IOException {
//	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//	        int n = Integer.parseInt(bufferedReader.readLine().trim());
//	        for(int i=1;i<=10;i++)
//	        {
//	            System.out.println(n+" * "+i+" = "+n*i);
//	        }
//	        bufferedReader.close();
		 int n=-21;
		 if(n%2!=0)
	            System.out.println("Weird");
	        else if(n%2==0)
	        {
	            if(n>=2 && n<=5)
	                System.out.println("Not Weird");
	            else if(n>=6 && n<=20)
	                System.out.println("Weird"); 
	            else if(n>20)
	                System.out.println("Not Weird");
	        }
	    }
}

package org.com.rs;

public class Hypotenuse
{ 
	public static void main(String[] args) 
	{
		/*for(i=.001;i*i<sq;i=i+0.001)
		{
			h=i;
		*/
		int len=3;
		int base=4;
		int sq =len*len+base*base;
		double s=0.0;
		double h=sq/2;
	    do
	      {
	        s=h;
		    h=((sq/s)+s)/2;
	       }while((s-h)!=0);
        System.out.println(h);	
	}  
}
//double hig=0.0;
//hig=(Math.sqrt((Math.pow(3,2))+(Math.pow(4,2))));


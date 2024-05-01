package org.com.rs;

public class Empe 
{
	String name;
	int sal,exp;
	public Empe( String n,int s,int e)
	{
		this.name=n;
		this.sal=s;
		this.exp=e;	
	}
	void bonus() 
	{
		System.out.println("Name :"+this.name);
		System.out.println("Salary :"+this.sal);
		System.out.println("Expreance :"+this.exp);
	    double total=0.0;
	    double d=0;
		if(this.exp<=2)
		{ 
			d=this.sal*10/100;
			total=this.sal+d;
			//System.out.println("Total salary :"+total); 
		}
		else if(exp<=4 && exp>2)
		{
			 d=sal*.17;
			 total=this.sal+d;
			// System.out.println("Total salary :"+total);
		 }
		else if(exp>4)
	    {
			d=sal*.35;
		    total=this.sal+d;
			//System.out.println("Total salary :"+total);
		}
		else
			System.out.println("Invalid Try Again!!!");
		System.out.println("Total salary :"+total); 
	}

	public static void main(String[] args) {
		Empe e1=new Empe("RAVI",50000,5);
		e1.bonus();	
	}

}

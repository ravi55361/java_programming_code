package org.com.rs;
public class Customer 
{ 
	String name;
	int bankCode,balance,pin;
	{
		balance=1000;
	}
	public Customer(String n,int b) 
	{
		this.name=n;
		this.bankCode=b;
	}
	void deposite(int p,int a)
	{
		if(this.pin==p)
		{
			this.balance=this.balance+a;
		}
		else
			System.out.println("In correct PIN !!!");
	}
	void withdraw(int p,int w)
	{ 
		if(this.pin==p)
		{
			if(this.bankCode==2 || this.bankCode==3)
			{
				if(this.balance>=w && this.balance>10000)
				{
					this.balance=this.balance-w;
					System.out.println(this.balance);
				}
				else	
					System.out.println("Withdraw Amount Is More Than A Minimum Blance !!!");
			}
			else if(this.balance>=w)
			{
				this.balance=this.balance-w;
				System.out.println(this.balance);
			}
			else	
				System.out.println("Withdraw Amount Is More Than A Blance !!!");
		}
		else
			System.out.println("In correct PIN !!!");
	}
	void setPin(int p)
	{ 
		this.pin=p;  	
	}
    void checkBalance(int p)
	{
		if(this.pin==p)
		   this.balance=this.balance+0;
		else
			System.out.println("In correct PIN !!!");
	}
	public static void main(String[] args) 
	{
		Customer c=new Customer("RAVI",1) ;
		c.setPin(5555);
	    c.deposite(5555,100000);
		c.withdraw(5555,5000);
	    c.checkBalance(5555);
	}
}

package org.com.rs;  
public class Bank {
	String name;
	int pin,bankCode,balance;
	long phNo;
	boolean panCard;
	public Bank(String name,int bankCode,long phNo,boolean panCard,int pin) {
		this.name=name;
		this.bankCode=bankCode;
		this.phNo=phNo;
		this.panCard=panCard;
		this.setPin(pin);
	}
	//SET PIN
	void setPin(int pin)
	{
		if(pin>=1000 && pin<=9999)
		{
			this.pin=pin;
			//System.out.println("New Pin Is Set");
		}
		else
			System.out.println("Enter Only 4 Digit Number!!!");
	}
	//DEPOSITE
	void deposite(int pin,int amount)
	{
		if(pin==this.pin)
		{
			if((amount>100000 && panCard==true)||(amount<100000))
			{
				this.balance=this.balance+amount;
				System.out.println("Total Balance "+balance);
			}
			else
			{
				balance=balance+amount;
				System.out.println("Firstly Link PanCard !!!!");
			}
		}
		else
			System.out.println("Need 4 Digit pin!! Or Wrong Pin!!!");	
	}
	//CHECK BALANCE
	void checkBalance(int pin)
	{
		if(pin==this.pin)
		{
			if(bankCode==2 || bankCode==3)
			{
				if(this.balance>10000)
				{
					System.out.println("Your Balance : "+balance);
				}
				else	
					System.out.println("Must be maintain Minimam 10000 Amount!!!");
			}
			else 
			{
				System.out.println(this.balance);
				System.out.println("Your Balance : "+balance);
			}
		}
		else
			System.out.println("Need 4 Digit pin!! Or Wrong Pin!!!");	
	}
	//UPDATE NUMBER
	void updateNumber(long oldphNo,long newPhNo,int pin)
	{
		if(pin==this.pin)
		{
			if(this.phNo==oldphNo)
			{
				this.phNo=newPhNo;
				System.out.println("Phone Number Is Change!!!");
			}
			else
				System.out.println("Old Phone Number Is Wrong please Try Again!!!");
		}
		else
			System.out.println("Need 4 Digit pin!! Or Wrong Pin!!!");	
	}
	//withraw amount
	void withraw(int pin ,int withrawAmount)
	{
		if(pin==this.pin)
		{
			if(this.bankCode==2 || this.bankCode==3)
			{
				if((this.balance>10000 && balance >withrawAmount) && (panCard == true && withrawAmount>50000) ||withrawAmount<50000)
				{
					balance=balance-withrawAmount;
					System.out.println("Withraw Balance : "+withrawAmount);
					System.out.println("Your Current Balance : "+balance);
				}
				else if(balance<10000)
				{
					balance=10000-balance;
					System.out.println("Must be maintain Minimam 10000 Amount! Please Deposite : "+balance);
				}
				else if((panCard == false && withrawAmount>50000) )
					System.out.println("Please Link Pancard First!!!");
				else
					System.out.println("Your Withraw Amount Is More Then Deposite Balance !!!");
			}
			else if(panCard==true && balance >withrawAmount && withrawAmount>50000)
			{
				balance=balance-withrawAmount;
				System.out.println("Withraw Balance : "+withrawAmount);
				System.out.println("Your Current Balance : "+balance);
			}
			else if(balance < withrawAmount)
				System.out.println("Your Withraw Amount Is More Then Deposite Balance !!!");
			else if(panCard==false && withrawAmount <50000)
			{
				balance=balance-withrawAmount;
				System.out.println("Withraw Balance : "+withrawAmount);
				System.out.println("Your Current Balance : "+balance);
			}
			else 
			{
				System.out.println("Please Link Pancard First!!!");
			}	
		}
		else
			System.out.println("Need 4 Digit pin!! Or Wrong Pin!!!");	
	}
	public static void main(String[] args) {
		Bank b=new Bank("Ravi",4,7004666465l,false,1234);
		b.deposite(1234,80000);
	    b.checkBalance(1234);
		b.updateNumber(7004666465l,9473331930l,1234);
		b.withraw(1234,60000);
	}
}

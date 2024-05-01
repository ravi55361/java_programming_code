package org.jsp.Multithreding;

class Task
{
	synchronized public void printNumber()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("value of printNumber "+i);
		}
	}
	synchronized public void printNumberOne()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("value of i printNumberOne "+i);
		}
	}
}
class ThreadOne extends Thread
{
	Task t1;
	public ThreadOne(Task t1)
	{
		this.t1=t1;
	}
	@Override
	public void run()
	{
		t1.printNumber();
		t1.printNumberOne();
	}
}
class ThreadTwo extends Thread
{
	Task t1;
	public ThreadTwo(Task t1)
	{
		this.t1=t1;
	}
	@Override
	public void run()
	{
		t1.printNumberOne();
		t1.printNumber();
	}
}
public class DoubleThread 
{
     public static void main(String[] args) {
		Task t1=new Task();
		ThreadOne th1= new ThreadOne(t1);
		ThreadTwo th2= new ThreadTwo(t1);
		th1.start();
		th2.start();
		System.out.println("-----------------------");
		for(int i=0;i<5;i++)
		{
			System.out.println("value of main thread "+i);
		}
	}
}

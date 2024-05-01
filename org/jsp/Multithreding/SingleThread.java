package org.jsp.Multithreding;

public class SingleThread extends Thread
{

	public static void main(String[] args) 
	{
		SingleThread st=new SingleThread();
		System.out.println("Id : "+st.getId());
		System.out.println("Name : "+st.getName());
		System.out.println("Priority : "+st.getPriority());
		st.setName("child thread");
		System.out.println("---------------------");
		st.setPriority(MAX_PRIORITY);
		System.out.println("Name : "+st.getName());
		System.out.println("Priority : "+st.getPriority());
		st.setPriority(MIN_PRIORITY);
		System.out.println("Priority : "+st.getPriority());
	}

}

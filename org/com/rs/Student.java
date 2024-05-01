package org.com.rs;

public class Student {
	String name;
	String quali;
	String branch;
	int yop;
	 
	Student(String n,String q,String b,int y)
	{
		this.name=n;
		this.quali=q;
		this.branch=b;
		this.yop=y;
	}

	public static void main(String[] args) {
		Student s1=new Student("Ravi","BCA","Computer science",2023);
		Student s2=new Student("Priti","BCA","Computer science",2023);
		Student s3=new Student("Priyanka","BCA","Computer science",2023);
		System.out.println(s1.name+" "+s1.quali+" "+s1.branch+" "+s1.yop);
		System.out.println(s2.name+" "+s2.quali+" "+s2.branch+" "+s2.yop);
		System.out.println(s3.name+" "+s3.quali+" "+s3.branch+" "+s3.yop);
	}
	
		
	
}

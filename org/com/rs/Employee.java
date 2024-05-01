package org.com.rs;
public class Employee
{
	String name,company;
	int sal,service;
	public Employee( String name,String company,int sal,int service) 
	{
        this.name=name;
        this.company=company;
        this.sal=sal;
        this.service=service;
	}
	public static void main(String[] args) 
	{
		Employee e=new Employee("Ravi","TCS",45000,4);
		Employee e1=new Employee("Ritik","Tesla",45000,3);
		Employee e2=new Employee("Saurabh","Mini",45000,1);
		Employee e3=new Employee("Harsh","TCS-e",43000,5);
		Employee e4=new Employee("Vaishu","Wipro",45000,4);
		Employee arr[]= {e,e1,e2,e3,e4};
		System.out.println("Employee Details!!!");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].name+" "+arr[i].company+" "+arr[i].sal+" "+arr[i].service);

		}
		System.out.println("-------------------------");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].sal>35000 && arr[i].sal<65000)
			{
				System.out.println(arr[i].name+" "+arr[i].company+" "+arr[i].sal+" "+arr[i].service);
			}
		}
		System.out.println("-------------------------");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].service>1 && arr[i].service<5)
			{
				System.out.println(arr[i].name+" "+arr[i].company+" "+arr[i].sal+" "+arr[i].service);
			}
		}
		}	
	}

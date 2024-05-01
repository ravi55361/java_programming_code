package Interface;

public class Employee implements Cloneable
{
	String name;
	int sal;

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="RAVI";
		e1.sal=45000;
		System.out.println("Name "+e1.name+" "+"Salary "+e1.sal+" "+e1);
		try {
			Object x=e1.clone();
			Employee e=(Employee)x;
			System.out.println(x);
			System.out.println("Name "+e1.name+" "+"Salary "+e1.sal+" "+e);
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Handled!!!");
		}

	}

}

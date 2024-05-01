package String;

public class Multi implements Runnable{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) 
	{
         Multi m=new Multi();
         m.run();
	}

}

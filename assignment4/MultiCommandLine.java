import java.lang.*;
class test
{
	public void doOperation(String arg[])
	{
		if(arg[0].equals("1"))
		{
			int sum=0;
			for(int i=0;i<arg.length;i++)
			{
				try
				{
					int num=Integer.parseInt(arg[i]);
					sum+=num;
				}
				catch(NumberFormatException e)
				{
					System.out.println(e.getMessage());
				}
			}
			System.out.println(sum);
		}
		else if(arg[0].equals("2"))
		{
			for(int i=0;i<arg.length;i++)
			{
				String s1=arg[i].toLowerCase();
				System.out.println(s1);
			}
		}
	}
	
}
public class MultiCommandLine
{
	public static void main(String arg[])
	{
		test t1=new test();
		t1.doOperation(arg);
		
		
	}
}
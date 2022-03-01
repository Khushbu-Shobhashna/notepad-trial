class A
{
	int a=10;
	char ch='k';
	boolean b=true;
	private String str="Khushbu";
	protected float f=125.87f;
	protected double d=15.99;
	long lg=1229l;
	
	
	
	public  void printPropertices()
	{
		System.out.println(a);
		System.out.println(ch);
		System.out.println(b);
		System.out.println(str);
		System.out.println(f);
		System.out.println(d);
		System.out.println(lg);
	}
}

class TestAccessMod extends A
{
	public static void main(String args[])
	{
		TestAccessMod test=new TestAccessMod();
		test.printPropertices();
	}
}
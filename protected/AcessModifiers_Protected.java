class A
{
	protected static int i1=10;
	protected static char ch='A';
	protected static boolean b=true;
	protected static String s="Khushbu";
	protected static float f1=65.6f;
	protected static double d1=128.6;
	protected static long l=1200088;
	
}
class b extends A
{	
	public static void printPropertices()
	{
		System.out.println(i1);
		System.out.println(ch);
		System.out.println(b);
		System.out.println(s);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(l);
	}
	
	
}
class AccessModifiers_Protected
{
	public static void main(String args[])
	{
		b b1=new b();
		b1.printPropertices();
	}
	
}
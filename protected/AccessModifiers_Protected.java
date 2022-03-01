//4th...........
class A
{
	protected  int i1=10;
	protected  char ch='A';
	protected  boolean b=true;
	protected  String s="Khushbu";
	protected  float f1=65.6f;
	protected  double d1=128.6;
	protected  long l=1200088;
	
}
class b extends A
{	
	public  void printPropertices()
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
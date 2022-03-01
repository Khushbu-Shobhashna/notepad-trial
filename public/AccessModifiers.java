//3rd..............

class A
{
	public  int i1=10;
	public  char ch='A';
	public  boolean b=true;
	public  String s="Khushbu";
	public  long l=1200;
	
}
class b extends A
{	
	public  void printPropertices()
	{
		System.out.println(i1);
		System.out.println(ch);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
	}
	
}	
class AccessModifiers
{
	public static void main(String args[])
	{
		b b1=new b();
		b1.printPropertices();
	}
	
}
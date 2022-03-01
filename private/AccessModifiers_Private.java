//task:-->line number 5

class A
{  
    private String str="Khushbu";
	int i1=10;
	char ch='A';
	boolean b=true;
	float f1=65;
	double d1=128;
	long l=1200;	
    public void msg()
    {
		System.out.println(str);
		System.out.println(i1);
		System.out.println(ch);
		System.out.println(b);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(l);
    } 
	
}	
      
public class AccessModifiers_Private extends A
{  
     public static void main(String args[])
	 {  
       A obj=new A();  
       obj.msg();
	   System.out.println(obj.str);
     }  
}  

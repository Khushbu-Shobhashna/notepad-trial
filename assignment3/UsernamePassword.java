class UsernamePassword
{
	public void validate(String username,String password)
	{
		
		System.out.println(username);
		System.out.println(password);
		if(usernm.equals("Khushbu") && password.equals("12345"))
		{
			System.out.println("Login Succesfully...");
		}
		else
		{
			System.out.println("Login Failed...");
		}
	}
	public static void main(String arg[])
	{
		
		UsernamePassword unpw=new UsernamePassword();
		unpw.validate(arg[0],arg[1]);
	}
}
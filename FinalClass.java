final class A
{
	public void display()
	{
		System.out.println("It can not be modified...");
	}

}

class B extends A
{
	public void fun()
	{
		System.out.println("Fun function of claas B");
	}
	// following not allowed here
	public void display()
	{
		System.out.println("....");
	}

}

class FinalClass
{
	public static void main(String[] args)

	{
		B obj = new B();
		obj.fun();
		obj.display();

	}
}
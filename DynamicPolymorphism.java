class A
{
	private int a;
	public A(int x)
	{
		//a=10;
		a=x;
		System.out.println("\nparents class");
	}
	public void method()
	{
		System.out.println("A="+a);
	}
}

class B extends A
{
	private int b;
	public B()
	{
		super(10);
		b= 20;
		System.out.println("Child Class");
	}
	public void method() // overriding
	{

		super.method();
		System.out.println("B = "+b);
	}
	public void method2() // overriding
		{

			//super.method();
			System.out.println("method2 of class B:");
	}
}


class DynamicPolymorphism
{
	public static void main(String[] args)
	{
		System.out.println("Single Inheritace");
		A obj;
		obj=new A(10);
		obj.method(); // that is call late binding or runtime binding or dynamic binding
		obj= new B();
		obj.method();
		((B)obj).method2();
	}
}

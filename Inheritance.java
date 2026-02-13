class A
{
	private int a;
	public A()
	{
		a=10;
		System.out.println("\nparents class");
	}
	public void methodA()
	{
		System.out.println("A="+a);
	}
}

class B extends A
{
	private int b;
	public B()
	{
		b= 20;
		System.out.println("Child Class");
	}
	public void methodB()
	{
		System.out.println("B = "+b);
	}
}


class Inheritance
{
	public static void main(String[] args)
	{
		System.out.println("Single Inheritace");
		B obj=new B();
		obj.methodB();
		obj.methodA();
	}
}

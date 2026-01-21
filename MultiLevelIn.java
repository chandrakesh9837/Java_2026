class A
{
	private int a;
	public A()
	{
		 a=10;
		System.out.println("Super Class ");
	}
	public void methodA()
	{
		System.out.println("A = "+a);
	}

}
class B extends A
{
	private int b;
	public B()
	{
		b=20;
		System.out.println("Second Super class");
	}
	public void methodB()
	{
		System.out.println("B = "+b);
	}

}

class C extends B
{
	private int c;
	public C()
	{
		c= 25;
		System.out.println("Child class");
	}

	public void methodC()
	{
		System.out.println("C = "+c);
	}


}

class MultiLevelIn
{
	public static void main(String[] args)

	{
		System.out.println("Multi Level Inheritance ");
		C objC = new C();
		objC.methodC();
		objC.methodB();
		objC.methodA();

	}

}
class A
{
	private int a;
	public A()
	{
		a=10;
		System.out.println("Super Class in this code");
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
		b=25;
		System.out.println("First Child class");
	}
	public void methodB()
	{
		System.out.println("B = "+b);
	}
}


class C extends A
{
	private int c;
	public C()
	{
		c=25;
		System.out.println("Second Child class");
	}
	public void methodC()
	{
		System.out.println("C = "+c);
	}
}


class SingleHir1
{
	public static void main(String[] args)
	{
		System.out.println("Single Inheritance Hirical");

		B objb = new B();
		objb.methodB();
		//objb.methodA();
		C objC = new C();
		objC.methodC();
		//objC.methodA();



	}
}
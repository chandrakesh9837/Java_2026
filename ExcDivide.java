class SecondNumberShouldNotBeGreaterThenFirstException extends Exception
{
	public SecondNumberShouldNotBeGreaterThenFirstException()
	{
		super("Second Number Should Not Be Greater Then First Exception. ");
	}
	public SecondNumberShouldNotBeGreaterThenFirstException(String msg)
	{
		super(msg);
	}
}


class Calc
{
	public static int divide(int num1, int num2) throws SecondNumberShouldNotBeGreaterThenFirstException
	{
		int r;
		boolean err=false;
		try
		{
			if(num1<num2)
				throw new SecondNumberShouldNotBeGreaterThenFirstException();
			r=num1/num2;
			return r;

		}
		catch(SecondNumberShouldNotBeGreaterThenFirstException se)
		{
			throw se;
		}
		catch(ArithmeticException ae)
		{
			err=true;
			throw ae ; //re-throwing
		}
		finally
		{
			if(err)
			{
				System.out.println("Returned from divide() method with Following Exception");
			}
			else
			{
				System.out.println("Returned from divide() method with Following Result: ");
			}
		}
	}

}

class ExcDivide
{

	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		int num1=1, num2=1,r=1;
		//System.out.println("Enter any Two Values for divide: ");


		try
		{
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			r =Calc.divide(num1,num2);

			System.out.println("Result="+r);
		}
		catch(SecondNumberShouldNotBeGreaterThenFirstException se)
		{
			System.out.println("Second Number Should Not Be Greater Then First... ");
			float res;
			res = (float)num1/num2;
			System.out.println("Result = "+res);
		}
		catch(ArithmeticException ae)
		{
			//System.out.println(ae);
			System.out.println("Second Number shoud not be Zero: ");
			r=num1/1;

			System.out.println("Result = "+r);
		} /*
		catch(ArrayIndexOutOfBoundsException ae)
		{
			//System.out.println(e);
			System.out.println("Index Out of Bonds: ");
		}  */
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Thanks for using this code...");
		}

		//System.out.println(r);

	}
}
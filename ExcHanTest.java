//import java.util.*;

public class ExcHanTest
{
	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		int num1, num2,r=0;
		//System.out.println("Enter any Two Values for divide: ");

		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		try
		{
			r = num1/num2;
		}
		catch(ArithmeticException ae)
		{
			//System.out.println(ae);
			System.out.println("Second Number shoud not be Zero: ");
		} /*
		catch(ArrayIndexOutOfBoundsException ae)
		{
			//System.out.println(e);
			System.out.println("Index Out of Bonds: ");
		}  */
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thanks for using this code...");
		}

		System.out.println(r);
	}
}


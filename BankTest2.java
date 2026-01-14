import java.util.*;

class BankAccount
{
	Scanner scan=new Scanner(System.in);

	private int balance;
	public BankAccount()
	{
		int amo;
		System.out.println("\nEnter Intial Amount: ");
		amo=scan.nextInt();
		while(amo<2000)
		{
			System.out.println("\nRe-Enter Intial Amount:  ");
			amo=scan.nextInt();
		}

		balance=amo;
		System.out.println("\nEnter amount succesfully: ");

	}
	public void deposit()
	{
		System.out.printf("Deposit Amount:	");
		int amo;
		amo=scan.nextInt();
		balance+=amo;
		System.out.println("Amount deposit succesfully:");

	}
	public void Withrowal()
	{
		int amo;
		System.out.println("Enter Withrowal Amount:");
		amo=scan.nextInt();

		if(amo<=balance-2000)
		{
			System.out.println("Withrowal Amount = " + amo);
			balance-= amo;
		}
		else
		{
			System.out.println("You can not Withrowal " + amo +" you can Withrowal maximum amount "+ (balance-2000)+ ".");
		}
	}
	public void Show()
	{
		System.out.println("your balance " + balance);
	}

}


class BankTest2
{
	public static void process(BankAccount cust)
	{
		Scanner scan = new Scanner(System.in);
		int ch;
		do
		{
			System.out.print("\n\n\nWelcome to your Account\n1. Deposit\n2. Withdrow\n3. ShowBalance\n0. Exit\n Enter your Choice..  ");

			ch=scan.nextInt();
			switch(ch)
			{
				case 1: cust.deposit(); break;
				case 2: cust.Withrowal(); break;
				case 3: cust.Show(); break;
			}
		}while(ch!=0);
	}


	public static void main(String[] args)
	{
				Scanner scan = new Scanner(System.in);


		BankAccount custs[]=new BankAccount[5];
		for(int i=0; i<5; i++)
		{
			custs[i]= new BankAccount();
		}
		int ano;
		do
		{
			System.out.println("Enter no. with want to work with(1-5).. ");
			ano=scan.nextInt();

			if(ano==0)
				break;
			process(custs[ano-1]);


		}while(true);


	}


}
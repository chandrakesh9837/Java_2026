class String1
{
	public static void main(String[] args)
	{

		//String
		//System.out.println("hello");
		String str1, str2, str3;
		str1= "        Hello everyone";
		str2= "Hello everyone";
		str3= "hello ";
		String str = "Chandrakesh yadav";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf("C"));
		System.out.println(str.charAt(12));

		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));


		System.out.println("Before: [" + str1 + "]");
		System.out.println("After:  [" + str1.trim() + "]");


		//String Concatenation

		System.out.println(str3 +" "+ str);

		String name = "Chandrakesh yadav";
		int age = 21;
		System.out.println("My name is "+ name + " and, I am "+age+" years old");

		String FirstName = "Chandrakesh ";
		String LastName = "Yadav ";
		System.out.println(FirstName.concat(LastName));

		// Numbers & String

		String a = "10";
		String b = "20";

		int c = 40;
		int d = 50;

		System.out.println(a+b); //output 1020
		System.out.println(c+d); // output 90
		System.out.println(a+c); // output 1040

		// String Special Characters

		String str4 = "My Name is \" Chandrakesh Yadav \". I belongs to Aligarh \' Uttar Pradesh \'. \\ ";
		System.out.println(str4);

		String str5 = " \\n use new line \n \\b Backspace \n \\t Tab \n \\r Carriage Return";
		System.out.println(str5);

	}
}
package java_bluestone;

public class operators {

	public static void main(String[] args) {
		arithmatic_operator();
		increment_operator();
		comparision_operator();
		logical_and_or();

	}
	
	public static void arithmatic_operator()
	{
		int a=10;
		int b=5;
		int div = a/b;
		int mod = a%b;
		
		System.out.println(div);  //gives quotient i.e 2
		System.out.println(mod);  //gives remainder i.e 0
	}
	
	public static void increment_operator()
	{
		int x= 5;
		System.out.println(x);		//5
		System.out.println(++x);	//6
		System.out.println(x++);	//6
		System.out.println(x); 		//7
		
	}
	
	public static void comparision_operator() 
	{
		int num = 11;
		if (num % 2 == 0) 
		{
		    System.out.println(num + " is even");
		} 
		else 
		{
		    System.out.println(num + " is odd");
		}
	}
	public static void logical_and_or() 
	{
		int a=5;
		int b=3;
		int c=9;
		
		if(a>b && b>c && c>a) 
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}

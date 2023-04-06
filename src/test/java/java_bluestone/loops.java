package java_bluestone;

public class loops {

	public static void main(String[] args) {
		number_1to10();
		decrement_loop();
		while_loop();
		decrement_while_loop();
		do_while_loop();
		decrement_do_while_loop();
		
	}
	
	private static void number_1to10() {
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}	
	}
	
	private static void decrement_loop()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	private static void while_loop() {
		int i=1;
		while (i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	
	private static void decrement_while_loop() {
		int i=10;
		while (i>=1)
		{
			System.out.println(i);
			i--;
		}	
	}
	
	private static void do_while_loop() {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);	
	}

	private static void decrement_do_while_loop() {
		int i=10;
		do {
			System.out.println(i);
			i--;
		}
		while(i<=1);	//false condition so it print 10 because  in do while it print atleast once output
	}

}

package java_bluestone;

public class loopstask {

	public static void main(String[] args) {
		fizz_buzzloop();
		even_odd_loop();
		for_loop();
	}
		
	private static void fizz_buzzloop() {
		for (int i = 1; i <= 20; i++) 	
		{    
			if (i % 5 == 0 && i % 3 == 0)     
			{
				System.out.println(i + " is fizz buzz");    
			}   
			else if(i % 5 == 0)  
			{ 
				System.out.println(i + " is fizz");
			}
			else if (i % 3 == 0)
			{
				System.out.println(i+ "is buzz");
			}
			else 
			{
				System.out.println(i);
			}	
		}
	}
	

	private static void even_odd_loop() {
		for (int i = 1; i <= 20; i++) 
		{
		    if (i % 2 == 0) 
		    {
		        System.out.println(i + " is even");
		    } 
		    else 
		    {
		        System.out.println(i + " is odd");
		    }
		}	
	}

	
	private static void for_loop() {	
		for(int i=1; i<=30; i++)
			{
				System.out.println(i);
			}	
		}
	
	
	
	
	}



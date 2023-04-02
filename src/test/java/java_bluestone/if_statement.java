package java_bluestone;

public class if_statement {

	public static void main(String[] args) {
		horror();

	}
	public static void IRCTC(){
		
		int age = 55;
		if(age>65)
		{
			System.out.println("you are eligible for free ticket");
		}
		else 	
		{
			System.out.println("please pay for ticket amount");
		}
	}
	
	public static void horror(){
		int age = 100;
		if(age<18) 
		{
			System.out.println("kids are not allowed");
		}
		else if(age>=18 && age<=60)
		{
			System.out.println("you are allowed to horror movie");
		}
		else
		{
			System.out.println("old age people are not allowed");
		}
	}

}

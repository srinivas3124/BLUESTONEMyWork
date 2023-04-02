package java_bluestone;

public class length_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3456789; // example number
		int count = 0;

		while(num != 0){
		    num = num / 10;
		    count++;
		}

		System.out.println("Length of number: " + count);


	}

}

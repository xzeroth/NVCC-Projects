import java.util.Scanner;

public class SecondClass {

	
	// Practice Program #4 Homework
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner fourDigit = new Scanner(System.in);
			System.out.println("Enter 4 digit number");
			int number = fourDigit.nextInt();
			
			String numberInString = Integer.toString(number);
			for (int x = 0; x < 4; x++) {
				char aChar = numberInString.charAt(x);
				System.out.println(aChar);
			}
			
			
		
	}

}
// *** Using this method changes the location of the number from front to back.

//while (number != 0) {
//	int remain = number % 10;
//	System.out.println(remain);
//	number = number / 10;
//	}

//String numberInString = Integer.toString(number);
//int numberLength = numberInString.length();


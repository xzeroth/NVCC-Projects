import java.util.Scanner;

public class c3n3PPhw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter First Word : ");
		String inputOne = userInput.nextLine();
		
		System.out.println("Enter Second Word : ");
		String inputTwo = userInput.nextLine();
		
		System.out.println("Enter Third Word : ");
		String inputThree = userInput.nextLine();
		
		if (inputOne.compareTo(inputThree) > 0 ) {
			String Temp = inputThree;
			inputThree = inputOne;
			inputOne = Temp;
		}
		if (inputOne.compareTo(inputTwo) > 0) {
			String Temp = inputTwo;
			inputTwo = inputOne;
			inputOne = Temp;
		
		}
		System.out.println(inputOne + " " + inputTwo + " " + inputThree);
	}

}

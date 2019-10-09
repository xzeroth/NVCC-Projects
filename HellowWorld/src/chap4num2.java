import java.util.Scanner;

public class chap4num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		while(true) {
			
		System.out.println("Enter a word or type \"quit\" to quit this program.");
		String word = input.nextLine();
		char char1 = word.charAt(0);
		String newWord = word + char1;
		int nWLength = newWord.length() - 1;

		String fWord = "";
		
		for (int x = nWLength; x > 0; x--) {
			fWord = fWord + newWord.charAt(x);
			
		}
		
		boolean checkQuit = word.equals("quit");
		boolean checkWord = fWord.equals(word);
		
		if (checkQuit == true) {
			System.out.println("Quiting this program" + "\n");
			break;
		}else if (checkWord == false) {
			System.out.println("Input word and final word is not same");
			System.out.println("Input = " + word);
			System.out.println("Final word = " + fWord + "\n");
		}else {
			System.out.println("The word backward is : " + fWord + "\n");
		}
		}
	}

}
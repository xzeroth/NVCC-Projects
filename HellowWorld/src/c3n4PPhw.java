import java.util.Scanner;

public class c3n4PPhw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String userSentence = userInput.nextLine();
		
		int sentenceLength = userSentence.length();
		String userMarks = "";
		
		
		if (sentenceLength % 2 == 0 && userSentence.indexOf("?") >= 0) {
			System.out.println("Yes");
		} else if (sentenceLength % 2 != 0 && userSentence.indexOf("?") >= 0) {
			System.out.println("No");
		} else if (userSentence.indexOf("!") >= 0) {
			System.out.println("WoW");
		} else {
			System.out.println("You always say \"" + userSentence + "\" ");
		}

}
}

import java.util.Scanner;

public class n2PPhw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputText = new Scanner(System.in);
		
		System.out.println("Enter a line of text");
		String textTyped = inputText.nextLine();
		
		System.out.println("I have rephrased that line to read: ");
		textTyped = textTyped.replaceFirst("hate", "love");
		System.out.println(textTyped);
		
	}

}

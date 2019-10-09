import java.util.Scanner;

public class ClassFirst {

	// Practice Program #2 Homework
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type words");
		System.out.println(" ");
		
		Scanner inputFromUserFirst = new Scanner(System.in);
		System.out.println("First Word ");
		String n1 = inputFromUserFirst.nextLine();
		int n1Length = n1.length();
		
		
		System.out.println("Second Word ");
		String n2 = inputFromUserFirst.nextLine();
		int n2Length = n2.length();
		
		System.out.println("First word is " + n1 + " and has " + n1Length + " Characters.");
		System.out.println("Second word is " + n2 + " and has " + n2Length + " Characters.");
		System.out.println(n1 + " " + n2);
		inputFromUserFirst.close();
	}

}

import java.util.Scanner;

public class n4PPhw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInoput = new Scanner(System.in);
		
		System.out.print("Enter favorite color: ");
		String color = userInoput.nextLine();
		
		System.out.print("Enter favorite food: ");
		String food = userInoput.nextLine();
		
		System.out.print("Enter favorite animal: ");
		String animal = userInoput.nextLine();
		
		System.out.print("Enter first name: ");
		String name = userInoput.nextLine();
		
		//counldn't make variables in to italics.
		System.out.println("I had a dream that " + name + " ate a " + color + " " + animal + " and said it tasted like " + food + "! ");
	}

}

import java.util.Scanner;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackInterface<Faculty> newStack = new ArrayBasedStack<Faculty>(3);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int tempInput;
		
		do {
			System.out.println("Please choose one of the following");
			System.out.println("1. Add a new faculty");
			System.out.println("2. Remove most recent faculty");
			System.out.println("3. Newest faculty");
			System.out.println("4. Oldest to newest faculty");
			System.out.println("5. Newest to oldest faculty");
			System.out.println("6. Exit the program");

			tempInput = input.nextInt();

			if (tempInput == 1) {
				Faculty newFaculty = new Faculty();
				System.out.println("Name of the faculty?");
				String name = input.next();
				newFaculty.setName(name);
				int id;
				System.out.println("EmployeeID of the faculty?");
				id = input.nextInt();
				newFaculty.setEmployeeID(id);
				newFaculty.setFaculty("ComputerScience");
				try {
					newStack.push(newFaculty);
				} catch (StackFullException e) {
					System.out.println(e.getMessage());
				}
			} else if (tempInput == 2) {
				try {
					newStack.pop();
				}catch(StackEmptyException e) {
					System.out.println(e.getMessage());
				}
			} else if (tempInput == 3) {
				try {
					System.out.println(newStack.peek());
				}catch(StackEmptyException e) {
					System.out.println(e.getMessage());
				}
			} else if (tempInput == 4) {
				System.out.println(newStack.toString2());
			} else if (tempInput == 5) {
				System.out.println(newStack.toString());
			} else if (tempInput == 6) {
				System.out.println("Ending program");
			} else {
				System.out.println("Invald input");
			}
			

		} while (tempInput != 6);

	}

}

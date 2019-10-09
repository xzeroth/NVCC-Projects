import java.util.Scanner;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueInterface<Student> studentQueue = new ArrayBasedQueue<Student>(5);
		Scanner input = new Scanner(System.in);
		int option;
		try {
			do {
			System.out.println("Please choose one of the following");
			System.out.println("1. Add student to waitlist");
			System.out.println("2. Remove student from waitlist");
			System.out.println("3. See size of the wait list");
			System.out.println("4. See waitlist");
			System.out.println("5. Close program");
			
			option = input.nextInt();
			
			if(option == 1) {
				Student newStudent = new Student();
				
				System.out.println("Name of the student");
				input.nextLine();
				newStudent.setName(input.nextLine());
				System.out.println("Student ID");
				newStudent.setStudentId(input.nextInt());
				
				studentQueue.enqueue(newStudent);
			}
			else if(option == 2) {
				System.out.printf("Removed student %s\n", studentQueue.dequeue().getName());
			}
			else if(option == 3) {
				System.out.println(studentQueue.size() + " students in queue");
			}
			else if(option == 4) {
				System.out.println(studentQueue.toString());
			}
			}
			while(option != 5);
		}
		catch(QueueFullException e) {
			System.out.println(e.getMessage());
		}
		catch(QueueEmptyException e) {
			System.out.println(e.getMessage());
		}
	}

}
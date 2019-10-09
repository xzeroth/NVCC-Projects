import java.util.Scanner;

public class Demo4 {

	public static void main(String[] arg) {
		
		Scanner input = new Scanner(System.in);
		Person[] csc202Class = new Person[26];
		int studentIndex = 1;
		int option;
		
		do {
			System.out.println("1 to change the professor");
			System.out.println("2 to add a stduent to class");
			System.out.println("3 to show everyone in class including the professor");
			System.out.println("4 to end the program");
			option = input.nextInt();
			input.nextLine();
			
			if(option == 1) {
				System.out.println("enter name of the professor");
				String name = input.nextLine();
				
				System.out.println("enter employee id");
				int employeeId = input.nextInt();
				input.nextLine();
				
				System.out.println("enter the department of the professor");
				String employeeDepartment = input.nextLine();
				
				Faculty currentProfessor = new Faculty();
				currentProfessor.setName(name);
				currentProfessor.setEmployeeId(employeeId);
				currentProfessor.setDepartment(employeeDepartment);
				
				csc202Class[0] = currentProfessor;
				
			
			}
			
			if(option == 2) {
				System.out.println("enter name of the student");
				String name = input.nextLine();
				
				System.out.println("enter student id");
				int studentId = input.nextInt();
				input.nextLine();
				
				Student newStudent = new Student();
				newStudent.setName(name);
				newStudent.setStudentId(studentId);
				
				csc202Class[studentIndex] = newStudent;
				studentIndex = studentIndex + 1;
				
			}
			
			if(option == 3) {
				for(int i = 0; i < studentIndex; i++) {
					System.out.println(csc202Class[i].toString());
				}
			}
		}while(option != 4);
		
		
		
	}
}

import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Person currentPerson = null;
		Employee currentEmployee = null;
		Faculty currentFaculty = null;
		int option;
		
		do {
			System.out.println("Press 1 to enter a Person");
			System.out.println("Press 2 to enter an Employee");
			System.out.println("Press 3 to enter a Faculty");
			System.out.println("Press 4 to display information about all 3 people");
			System.out.println("Press 5 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			if(option == 1) {
				//System.out.println("Enter the name of the person");
				//String name = keyboard.nextLine();
				
				currentPerson = new Person();
				enterAllInformation(currentPerson);
				//enterName(currentPerson);
				//currentPerson.setName(name);
			}
			else if(option == 2) {
				//System.out.println("Enter the name of the employee");
				//String employeeName = keyboard.nextLine();
				
				//System.out.println("Enter the employee id");
				//int newEmployeeId = keyboard.nextInt();
				
				currentEmployee = new Employee();
				enterAllInformation(currentEmployee);
				//enterName(currentEmployee);
				//enterEmployeeId(currentEmployee);
				//currentEmployee.setName(employeeName);
				//currentEmployee.setEmployeeId(newEmployeeId);
			}
			else if(option == 3) {
				//System.out.println("Enter the name of the faculty");
				//String facultyName = keyboard.nextLine();
				
				//System.out.println("Enter the employee id of the faculty");
				//int facultyId = keyboard.nextInt();
				//keyboard.nextLine(); //going to the next line
				
				//System.out.println("Enter the department of the faculty");
				//String department = keyboard.nextLine();
				
				currentFaculty = new Faculty();
				enterAllInformation(currentFaculty);
				//enterName(currentFaculty);
				//enterEmployeeId(currentFaculty);
				//currentFaculty.setName(facultyName);
				//currentFaculty.setEmployeeId(facultyId);
				//currentFaculty.setDepartment(department);				
			}
			else if(option == 4) {
				if(currentPerson != null) {
					System.out.println("Person's Name: " + currentPerson.getName());
				}
				else {
					System.out.println("No person has been entered into system!");
				}
				if(currentEmployee != null) {
					System.out.println("Employee's Name:" + currentEmployee.getName());
					System.out.println("Employee's Id: " + currentEmployee.getEmployeeId());
				}
				else {
					System.out.println("No employee has been entered into the system");
				}
				if(currentFaculty != null) {
					System.out.println("Faculty's Name: " + currentFaculty.getName());
					System.out.println("Faculty's Id: " + currentFaculty.getEmployeeId());
					System.out.println("Faculty's Department: " + currentFaculty.getDepartment());
				}
				else {
					System.out.println("No faculty has been entered into the system");
				}
			}
			else if(option == 5) {
				System.out.println("Thank you for using our program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 5);
		
	}
	public static void enterName(Person p) {
		if(p != null) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the name");
			String name = keyboard.nextLine();
			p.setName(name);
		}
	}
	
	public static void enterEmployeeId(Employee e) {
		if(e != null) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the employee id");
			int employeeId = keyboard.nextInt();
			e.setEmployeeId(employeeId);
		}
	}
	
	public static void enterAllInformation(Person p1) {
		if(p1 != null) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the name");
			String name = keyboard.nextLine();
			p1.setName(name);
			
			if(p1 instanceof Employee) {
				Employee e1 = (Employee)p1;
				System.out.println("Enter the employee id");
				int employeeId = keyboard.nextInt();
				keyboard.nextLine();
				e1.setEmployeeId(employeeId);
				
				if(p1 instanceof Faculty) {
					Faculty f1 = (Faculty)p1;
					System.out.println("Enter the department");
					String department = keyboard.nextLine();
					f1.setDepartment(department);
				}
			}
		}
	}
}
import java.util.Scanner;

public class UniversityDemo {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		University clerk = new University();
		Student student = new Student();// one student
		int i;
		System.out.println("Enter number of students:");
		int numberOfStudents = scan.nextInt();
		for (i = 1; i <= numberOfStudents; i++) {
			System.out.println("Enter data for student number " + i);
			student.readInput();
			student.calculateData();
			student.writeOutput();
			clerk.collectDataForUniversityReport(student);
		}
		clerk.printDataForSchoolReport();
	}
}
/*
 * the calculateData() method must have private methods. Examples:
 * tuitionCalculation(1) lateCalculation (1); healthCareCalculation(1);
 * incidentalCalculation (1); readMealSelection(1); computeFoodFee(x); Getters and
 * Setters for the private data is necessary. Eclipse will create them for you.
 * Place your mouse where you would like them (Usually at the bottom of the
 * class). Right click, choose Source, choose Generate Getters and Setters.
 * Choose the private variables you want. (all of them).
 */
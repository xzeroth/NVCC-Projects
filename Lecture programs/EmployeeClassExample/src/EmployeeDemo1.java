//*** copy of given demo
//*** Auto-generated class Company
//*** Auto-generated class Employee
//*** Auto-generated method stub
import java.util.Scanner;
public class EmployeeDemo1
{//*** classes and methods can be Auto-generated 
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Company clerk = new Company();
		Employee person = new Employee();// one Employee
		int numberOfEmployee, i, count;
		System.out.println("Enter number of Employees:");
		numberOfEmployee = scan.nextInt( );
		for(i = 0; i < numberOfEmployee; i++)
		{
			person.readInput();
			person.calculateData();
			person.writeOutput();
			clerk.colectDataForReport(person);
		}
		clerk.printDataForCompanyReport();
	}
}

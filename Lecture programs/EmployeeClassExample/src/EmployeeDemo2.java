import java.util.Scanner;
import java.io.*;
public class EmployeeDemo2
{
public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	Company2 clerk = new Company2( );
	Employee2 person = new Employee2();// one Employee
	int numberOfEmployees, i, count;
 	System.out.println("Enter number of Employee:");
 	numberOfEmployees = scan.nextInt( );
	for(i = 0; i < numberOfEmployees; i++)
 	{
   				person.readInput();
        		person.calculateData();
        		person.writeOutput();
        		clerk.colectDataForReport(person);
	}
	clerk.printDataForCompanyReport();
    }
}

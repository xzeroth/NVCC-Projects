//Demo
import java.io.*;
import java.util.Scanner;
// This demo must be used in Project 7
public class universityDemo
{
	public static void main(String[] args)
	{
		Scanner scan = new  Scanner(System.in);
		Scanner scanFile = TextFileIO.createTextRead("textFile2.txt");
		PrintWriter outStream = TextFileIO.createTextWrite("out.txt");
		int numberOfPersons, i, count;
		universityWithFiles clerk = new universityWithFiles( );
		studentWithFiles person = new studentWithFiles();// one person
		System.out.println("Enter number of persons:");
		numberOfPersons = scan.nextInt();
		for(i = 0; i < numberOfPersons; i++)
		{
			person.readInputFile(scanFile);// from personWithFiles
			person.calculateData();// from person
			person.writeOutputFile(outStream );// from personWithFiles
			person.writeOutput();// to the screen from person
			clerk.collectDataForUniversityReport(person);// from GroupReporter
		}
		System.out.println();
		clerk.printDataForSchoolReport();// to the screen from GroupReporter
		clerk.printDataForReportFile(outStream);// to file from GroupReporterWithFiles
		outStream.close( );
		scanFile.close();
	}
}


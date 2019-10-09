import java.util.Scanner;
import java.io.*;
public class TextFileIO
{
	public static void main(String[] args)
	{
		String fileName = "textFile2.txt";
		int x = 3;
		String line = null;
		int count;
		Scanner scan = new  Scanner(System.in);
		PrintWriter textStream =TextFileIO.createTextWrite(fileName);
		System.out.println("Enter 3 students:");
		for (count = 1; count <= 2; count++)
		{
			System.out.println("Student " + count + " \n");
			
			System.out.println("First name");
			line = scan.nextLine();
			textStream.println(line);

			System.out.println("Last name");
			line = scan.nextLine();
			textStream.println(line);

			System.out.println("Address");
			line = scan.nextLine();
			textStream.println(line);

			System.out.println("Phone number");
			line = scan.nextLine();
			textStream.println(line);
			
			System.out.println("number of credit");
			line = scan.nextLine();
			textStream.println(line);

			System.out.println("Instate");
			line = scan.nextLine();
			if(line.equalsIgnoreCase("yes")) {
			textStream.println(true);}
			else if(line.equalsIgnoreCase("no")) {
				textStream.println(false);
			}
			
			System.out.println("Campus Food");
			line = scan.nextLine();
			if(line.equalsIgnoreCase("yes")) {
				textStream.println(true);}
				else if(line.equalsIgnoreCase("no")) {
					textStream.println(false);
				}
			
			if (line.equalsIgnoreCase("yes")) {
				System.out.println("Meal Plan number");
				line = scan.nextLine();
				textStream.println(line);
			}else {
				textStream.println("0");
			}
			
			System.out.println("Health Care");
			line = scan.nextLine();
			if(line.equalsIgnoreCase("yes")) {
				textStream.println(true);}
				else if(line.equalsIgnoreCase("no")) {
					textStream.println(false);
				}
			
			System.out.println("Late fee");
			line = scan.nextLine();
			if(line.equalsIgnoreCase("yes")) {
				textStream.println(true);}
				else if(line.equalsIgnoreCase("no")) {
					textStream.println(false);
				}
			
		}
		textStream.close( ); // did not require error handling
	}

	public static PrintWriter  createTextWrite(String S)
	{
		PrintWriter TStream = null;
		try
		{
			TStream = new PrintWriter(new FileOutputStream(S));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file in createTextWrite");
			System.exit(0);
		}
		return TStream;
	}


	public static Scanner  createTextRead(String S)
	{
		Scanner textFile = null;
		try
		{
			textFile = new Scanner(new File(S));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.out.println("or could not be opened.");
		}
		return textFile;
	}



}



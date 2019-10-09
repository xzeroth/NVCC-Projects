import java.util.Scanner;
import java.io.*;
public class PersonWithFiles extends Person
{
	public PersonWithFiles()
	{	
		super();  
	}
	public void readInputFile(Scanner read )
	{	
		setFName (read.nextLine());
	}
	public void writeOutputFile( PrintWriter textStream)
	{
		textStream.println("Name " + getFName());}
}

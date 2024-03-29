
public class OutPut
{

	// *************************************************************************
	//Blank fills and left justifies a string in a field of size characters
	// and returns string
	public static String makeStringLeft(int size, String formatted)
	{
		String answer = "";
		int length = formatted.length();
		answer = answer + formatted;
		while (size > length)
		{
			answer = answer + " ";
			size --;
		} // End while (size > length)
		return answer;
	}
	public static void printStringLeft(int size, String formatted)
	// Blank fills and left justifies a string in a field of size characters

	{
		int length = formatted.length();
		System.out.print(formatted);
		while (size > length)
		{
			System.out.print(" ");
			size --;

		} // End while (size > length)

	} // End function printString

	// *************************************************************************
	//Blank fills and right justifies a string in a field of size characters
		// and returns string
	public static String makeStringRight(int size, String formatted)
	// Blank fills and right justifies a string in a field of size characters
	{
		String answer = "";
		int length = formatted.length();
		while (size > length)
		{
			answer = answer + " ";
			size --;
		} // End while (size > length)
		answer = answer + formatted;
		return answer;
	} 

	public static void printStringRight(int size, String formatted)
	// Blank fills and right justifies a string in a field of size characters
	{
		int length = formatted.length();
		while (size > length)
		{
			System.out.print(" ");
			size --;

		} // End while (size > length)
		System.out.print(formatted);
	} // End function printString

	// ***************************************************************************
}
import java.text.NumberFormat;


public class university {

	NumberFormat mF = NumberFormat.getCurrencyInstance();
	
	int totalStudent;
	int totalInstate;
	int totalOutState;
	int totalMP1;
	int totalMP2;
	int totalMP3;
	double totalAmountMP1;
	double totalAmountMP2;
	double totalAmountMP3;
	double TotalAmountMP;
	double totalTution;
	double totalLF;
	double totalIncidental;
	double totalHC;
	double allTotal;
	
	public university() {
		this.totalStudent = 0;
		this.totalInstate = 0;
		this.totalOutState = 0;
		this.totalMP1 = 0;
		this.totalMP2 = 0;
		this.totalMP3 = 0;
		this.totalAmountMP1 = 0;
		this.totalAmountMP2 = 0;
		this.totalAmountMP3 = 0;
		this.TotalAmountMP = 0;
		this.totalTution = 0;
		this.totalLF = 0;
		this.totalIncidental = 0;
		this.totalHC = 0;
		this.allTotal = 0;
	}
	
	private void calcTotalStudent() {
		this.totalStudent = this.totalStudent + 1;
	}
	
	private void calcTotalInAndOut(student studentOne) {
		if(studentOne.qInstate == true) {
			this.totalInstate = this.totalInstate + 1;
		}else if(studentOne.qInstate == false) {
			this.totalOutState = this.totalOutState + 1;
		}
	}
	
	private void calcMealPlan(student studentOne) {
		if (studentOne.campusFood == true) {
			if(studentOne.mealChoice == 1) {
				this.totalMP1 = this.totalMP1 + 1;
				this.totalAmountMP1 = this.totalAmountMP1 + studentOne.meal;
			}else if(studentOne.mealChoice == 2) {
				this.totalMP2 = this.totalMP2 + 1;
				this.totalAmountMP2 = this.totalAmountMP2 + studentOne.meal;
			}else if(studentOne.mealChoice == 3) {
				this.totalMP3 = this.totalMP3 + 1;
				this.totalAmountMP3 = this.totalAmountMP3 + studentOne.meal;
			}
			this.TotalAmountMP = this.TotalAmountMP + studentOne.meal;
		}
	}
	
	private void calcTuition(student studentOne) {
		this.totalTution = this.totalTution + studentOne.tuition;
	}
	
	private void calcIncidental(student studentOne) {
		this.totalIncidental = this.totalIncidental + studentOne.calcInci;
	}
	
	private void calcHealthCare(student studentOne) {
		this.totalHC = this.totalHC + studentOne.calcHC;
	}
	
	public void collectDataForUniversityReport(student studentOne) {
		calcTotalStudent();
		calcTotalInAndOut(studentOne);
		calcMealPlan(studentOne);
		calcTuition(studentOne);
		calcIncidental(studentOne);
		calcHealthCare(studentOne);
	}
	
	public void printDataForSchoolReport() {
		
		System.out.println(makeStringRight(50, "UNIVERSITY OF COMPUTERS"));
		
		System.out.println(makeStringLeft(20, "NUMBER OF STUDENTS ") + this.totalStudent);
		System.out.println(makeStringLeft(20, "INSTATE ") + this.totalInstate);
		System.out.println(makeStringLeft(20, "OUT OF STATE ") + this.totalOutState);
		System.out.println(" ");
		System.out.println(makeStringLeft(15, "MEAL PLAN") + makeStringLeft(30, "STUFF-YOUR-FACE ") + makeStringLeft(10, Double.toString(this.totalMP1)) + " " + mF.format(this.totalAmountMP1));
		System.out.println(makeStringLeft(15, "") + makeStringLeft(30, "I-CAN'T-STAND-THIS-FOOD ") + makeStringLeft(10, Double.toString(this.totalMP2)) + " " + mF.format(this.totalAmountMP2));
		System.out.println(makeStringLeft(15, "") + makeStringLeft(30, "I'M-ON-A-DIET ") + makeStringLeft(10, Double.toString(this.totalMP3)) + " " + mF.format(this.totalAmountMP3));
		System.out.println(makeStringLeft(45, "") + "TOTAL      " + mF.format(this.TotalAmountMP));
		System.out.println(" ");
		System.out.println(makeStringLeft(25, "TUITION ") + mF.format(this.totalTution));
		System.out.println(makeStringLeft(25, "INCEDENTAL ") + mF.format(this.totalIncidental));
		double allTotal = this.TotalAmountMP + this.totalTution + this.totalIncidental + this.totalHC;
		System.out.println(makeStringLeft(25, "HEALTH CARE ") + makeStringLeft(20, mF.format(this.totalHC)) + "TOTAL      " + mF.format(allTotal));
		
	}
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

}

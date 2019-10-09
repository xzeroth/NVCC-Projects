import java.io.PrintWriter;

public class universityWithFiles extends university {

	public   void printDataForReportFile(PrintWriter textStream)
	{	
		textStream.println(makeStringRight(50, "UNIVERSITY OF COMPUTERS"));
		
		textStream.println(makeStringLeft(20, "NUMBER OF STUDENTS ") + this.totalStudent);
		textStream.println(makeStringLeft(20, "INSTATE ") + this.totalInstate);
		textStream.println(makeStringLeft(20, "OUT OF STATE ") + this.totalOutState);
		textStream.println(" ");
		textStream.println(makeStringLeft(15, "MEAL PLAN") + makeStringLeft(30, "STUFF-YOUR-FACE ") + makeStringLeft(10, Double.toString(this.totalMP1)) + " " + mF.format(this.totalAmountMP1));
		textStream.println(makeStringLeft(15, "") + makeStringLeft(30, "I-CAN'T-STAND-THIS-FOOD ") + makeStringLeft(10, Double.toString(this.totalMP2)) + " " + mF.format(this.totalAmountMP2));
		textStream.println(makeStringLeft(15, "") + makeStringLeft(30, "I'M-ON-A-DIET ") + makeStringLeft(10, Double.toString(this.totalMP3)) + " " + mF.format(this.totalAmountMP3));
		textStream.println(makeStringLeft(45, "") + "TOTAL      " + mF.format(this.TotalAmountMP));
		textStream.println(" ");
		textStream.println(makeStringLeft(25, "TUITION ") + mF.format(this.totalTution));
		textStream.println(makeStringLeft(25, "INCEDENTAL ") + mF.format(this.totalIncidental));
		double allTotal = this.TotalAmountMP + this.totalTution + this.totalIncidental + this.totalHC;
		textStream.println(makeStringLeft(25, "HEALTH CARE ") + makeStringLeft(20, mF.format(this.totalHC)) + "TOTAL      " + mF.format(allTotal));
		
	}
	
}


public class University {

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
	
	public University() {
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
	
	private void calcTotalInAndOut(Student studentOne) {
		if(studentOne.qInstate == true) {
			this.totalInstate = this.totalInstate + 1;
		}else if(studentOne.qInstate == false) {
			this.totalOutState = this.totalOutState + 1;
		}
	}
	
	private void calcMealPlan(Student studentOne) {
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
	
	private void calcTuition(Student studentOne) {
		this.totalTution = this.totalTution + studentOne.tuition;
	}
	
	private void calcIncidental(Student studentOne) {
		this.totalIncidental = this.totalIncidental + studentOne.calcInci;
	}
	
	private void calcHealthCare(Student studentOne) {
		this.totalHC = this.totalHC + studentOne.calcHC;
	}
	
	public void collectDataForUniversityReport(Student studentOne) {
		calcTotalStudent();
		calcTotalInAndOut(studentOne);
		calcMealPlan(studentOne);
		calcTuition(studentOne);
		calcIncidental(studentOne);
		calcHealthCare(studentOne);
	}
	
	public void printDataForSchoolReport() {
		System.out.println("UNIVERSITY OF COMPUTERS\n");
		System.out.println("NUMBER OF STUDENTS " + this.totalStudent);
		System.out.println("INSTATE " + this.totalInstate);
		System.out.println("OUT OF STATE " + this.totalOutState);
		System.out.println(" ");
		System.out.println("Meal Plan");
		System.out.println("STUFF-YOUR-FACE " + this.totalMP1 + " " + this.totalAmountMP1);
		System.out.println("I-CAN'T-STAND-THIS-FOOD " + this.totalMP2 + " " + this.totalAmountMP2);
		System.out.println("I'M-ON-A-DIET " + this.totalMP3 + " " + this.totalAmountMP3);
		System.out.println("TOTAL " + this.TotalAmountMP);
		System.out.println(" ");
		System.out.println("TUITION " + this.totalTution);
		System.out.println("INCEDENTAL " + this.totalIncidental);
		System.out.println("HEALTH CARE " + this.totalHC);
		
	}

}

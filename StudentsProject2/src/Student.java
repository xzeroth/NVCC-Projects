import java.util.Scanner;

public class Student extends University {

	Scanner input = new Scanner(System.in);
	
	String fName;
	String lName;
	String address;
	String phoneNumber;
	int cEnrolled;
	boolean qInstate;
	boolean lateFee;
	boolean campusFood;
	boolean healthCare;
	
	double rate;
	double tuition;
	double late;
	double calcHC;
	double calcInci;
	double meal;
	int mealChoice;
	
public Student() {
	
	this.fName = "No first name";
	this.lName = "No last name";
	this.address = "No address";
	this.phoneNumber = "No phone number";
	this.cEnrolled = 0;
	this.qInstate = false;
	this.lateFee = false;
	this.campusFood = false;
	this.healthCare = false;
	this.mealChoice = 0;
}

public void readInput() {
	
	System.out.println("First name?");
	this.fName = input.next();
	
	System.out.println("Last name?");
	this.lName = input.next();
	input.nextLine();
	
	System.out.println("Address?");
	this.address = input.nextLine();
	
	System.out.println("Phone number?");
	this.phoneNumber = input.nextLine();
	
	System.out.println("Credit enrolled?");
	this.cEnrolled = input.nextInt();
	
	System.out.println("Qualified for instate? Yes? or No?");
	String qInstateInput = input.next();
	
	
	if (qInstateInput.equals("Yes")) {
		this.qInstate = true;
	}else {
		this.qInstate = false;
	}
		
	System.out.println("Late fee? Yes? or No?");
	String lateFeeInput = input.next();
	input.nextLine();
	if (lateFeeInput.equals("Yes")) {
		this.lateFee = true;
	}else {
		this.lateFee = false;
	}
	
	System.out.println("Campus food? Yes? or No?");
	String campusFoodInput = input.next();
	input.nextLine();
	if (campusFoodInput.equals("Yes")) {
		this.campusFood = true;
	}else {
		this.campusFood = false;
	}
	
	System.out.println("Health care? Yes? or No?");
	String healthCareInput = input.next();
	input.nextLine();
	if (healthCareInput.equals("Yes")) {
		this.healthCare = true;
	}else {
		this.healthCare = false;
	}
			
}
private void calculateRate() {
	
		
	if (this.qInstate == true) {
		if (this.cEnrolled < 12) {
			this.rate = 102.50;
		}else if (this.cEnrolled >= 12 && this.cEnrolled <= 18) {
			this.rate = 75.45;
		}else if (this.cEnrolled > 18) {
			this.rate = 93;
		}
	}else {
		if (this.cEnrolled < 12) {
			this.rate = 351;
		}else if (this.cEnrolled >= 12 && this.cEnrolled <= 18) {
			this.rate = 255;
		}else if (this.cEnrolled > 18) {
			this.rate = 304;
		}
		
	}
	
	
}

private void tuitionCalculation() {
	
	this.calculateRate();
	double cEnrolledDouble = this.cEnrolled;
	this.tuition = this.rate * cEnrolledDouble;
	
	
}

private void lateCalculation() {
	if (this.lateFee == true) {
		this.late = this.tuition * 0.10;		
	}else if (this.lateFee == false) {
		this.late = 0;
	}
}

private void healthCareCalculation() {
	
	int sum = 0;
	
	for (int count = 1 ; count <= this.cEnrolled ; count++) {
		if (count <= 10) {
			sum = sum + 25;
		}else if (count > 10 && count <= 15) {
			sum = sum + 20;
		}else if (count > 15) {
			sum = sum + 15;
		}
	}
	
	this.calcHC = sum;
}

private void incidentalCalculation() {
	
	this.calcInci = this.cEnrolled * 20;
	if (this.calcInci > 250) {
		this.calcInci = 250;
	}
	
}

private void readMealSelection() {
	if (this.campusFood == true) {
		System.out.println("Select a meal plan.");
		System.out.println("Choice 1, 2, 3 "
				+ "\n( 1 ) stuff-your-face."
				+ "\n( 2 ) I-can't-stand-this-food."
				+ "\n( 3 ) I'm-on-a-diet.");
		this.mealChoice = input.nextInt();
		if (this.mealChoice == 1) {
			this.meal = 4999;
		}else if (this.mealChoice == 2) {
			this.meal = 3499;
		}else if (this.mealChoice == 3) {
			this.meal = 2599;
		}
	}
}


public void calculateData() {
	tuitionCalculation();
	lateCalculation();
	healthCareCalculation();
	incidentalCalculation();
	readMealSelection();
	
	
	}

public void writeOutput() {
	System.out.println("NAME " + getfName() + " " + getlName());
	System.out.println("ADDRESS " + getAddress());
	System.out.println("PHONE " + getPhoneNumber());
	System.out.println("CREDIT " + getcEnrolled());
	System.out.println("TUITION " + this.tuition);
	System.out.println("LATE FEE " + this.late);
	System.out.println("INCIDENTAL " + this.calcInci);
	System.out.println("HEALTH CARE " + this.calcHC);
	System.out.println("MEAL PLAN " + this.meal);
	
	
}






public Scanner getInput() {
	return input;
}

public void setInput(Scanner input) {
	this.input = input;
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

public String getAddress() {
	return this.address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public int getcEnrolled() {
	return cEnrolled;
}

public void setcEnrolled(int cEnrolled) {
	this.cEnrolled = cEnrolled;
}

public boolean isqInstate() {
	return qInstate;
}

public void setqInstate(boolean qInstate) {
	this.qInstate = qInstate;
}

public boolean isLateFee() {
	return lateFee;
}

public void setLateFee(boolean lateFee) {
	this.lateFee = lateFee;
}

public boolean isCampusFood() {
	return campusFood;
}

public void setCampusFood(boolean campusFood) {
	this.campusFood = campusFood;
}

public boolean isHealthCare() {
	return healthCare;
}

public void setHealthCare(boolean healthCare) {
	this.healthCare = healthCare;
}




}





import java.util.Scanner;
public class Employee2
{
	//*** cut and pasted variables from assignment
	private String firsName;// Employee;
	private String lastName;// Employee;
	private double hoursWorked;
	private double hourlyRate;
	private double grossWages	;
	private double federalCurrent;
	private double federalYrToDate;
	private double stateCurrent;
	private double stateYrToDate;
	private double localCurrent;
	private double localYrToDate;
	private double totalDeductions;
	private double netPay;
	
	//*** The readInput is straight forward.
	//*** To read more than one Employee must read the 
	//*** enter key from the last double localYrToDate 
	//*** to be able to read the next String for firstName
	public void readInput()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name:");
		firsName = scan.nextLine( );
		System.out.println("Enter last name:");
		lastName = scan.nextLine( );
		System.out.println("Enter hours Worked:");
		hoursWorked = scan.nextDouble( );
		System.out.println("Enter hourly Rate:");
		hourlyRate = scan.nextDouble( );
		System.out.println("Enter federal Yr To Date:");
		federalYrToDate = scan.nextDouble( );
		System.out.println("Enter state Yr To Date:");
		stateYrToDate = scan.nextDouble( );
		System.out.println("Enter local Yr To Date:");
		localYrToDate = scan.nextDouble( );
		scan.nextLine( );//*** must read enter key
		
	}

	public void calculateData()
	{//*** created methods
	 //*** auto-generated method stubs
		// TODO Auto-generated method stub
		grossWages = computeGrossWages();
		federalCurrent = computeFederalCurrent();
		stateCurrent = computeStateCurrent();
		localCurrent = computeLocalCurrent();
		totalDeductions = federalCurrent + stateCurrent + localCurrent;
		netPay = grossWages - totalDeductions;
	}
	
	public void writeOutput() 
	{
		// TODO Auto-generated method stub
		
	}
	
	private double computeLocalCurrent() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double computeStateCurrent() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double computeFederalCurrent() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double computeGrossWages() {
		// TODO Auto-generated method stub
		return 0;
	}

	//*** auto-generated getters and setters

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getGrossWages() {
		return grossWages;
	}

	public void setGrossWages(double grossWages) {
		this.grossWages = grossWages;
	}

	public double getFederalCurrent() {
		return federalCurrent;
	}

	public void setFederalCurrent(double federalCurrent) {
		this.federalCurrent = federalCurrent;
	}

	public double getFederalYrToDate() {
		return federalYrToDate;
	}

	public void setFederalYrToDate(double federalYrToDate) {
		this.federalYrToDate = federalYrToDate;
	}

	public double getStateCurrent() {
		return stateCurrent;
	}

	public void setStateCurrent(double stateCurrent) {
		this.stateCurrent = stateCurrent;
	}

	public double getStateYrToDate() {
		return stateYrToDate;
	}

	public void setStateYrToDate(double stateYrToDate) {
		this.stateYrToDate = stateYrToDate;
	}

	public double getLocalCurrent() {
		return localCurrent;
	}

	public void setLocalCurrent(double localCurrent) {
		this.localCurrent = localCurrent;
	}

	public double getLocalYrToDate() {
		return localYrToDate;
	}

	public void setLocalYrToDate(double localYrToDate) {
		this.localYrToDate = localYrToDate;
	}

	public double getTotalDeductions() {
		return totalDeductions;
	}

	public void setTotalDeductions(double totalDeductions) {
		this.totalDeductions = totalDeductions;
	}

	public double getNetPay() {
		return netPay;
	}

	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}

}


public class Employee extends Person {
	//instance variables
	private int employeeId;
	
	//default constructor
	public Employee() {
		super(); //call the constructor of your parent (super) class 
		employeeId = 0;
	}
	
	//non-static methods
	public void setEmployeeId(int newEmployeeId) {
		if(newEmployeeId > 0) {
			employeeId = newEmployeeId;
		}
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String toString() {
		return super.toString() + " EmployeeID: " + employeeId;
	}
}
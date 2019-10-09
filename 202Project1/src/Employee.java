
public class Employee extends Person{

	private int employeeID;
	
	public Employee() {
		super();
		employeeID = 0;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String toString() {
		return super.toString() + "EmployeeID is: " + employeeID + "\n";
	}
}

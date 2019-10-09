public class Faculty extends Employee {
	//instance variable
	private String department;
	
	//default constructor
	public Faculty() {
		super(); //call the constructor of parent (super) class
		department = "";
	}
	
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String toString() {
		return super.toString() + " Department: " + department;
	}
}
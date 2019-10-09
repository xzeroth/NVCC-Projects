
public class Faculty extends Employee{
	
	private String department;
	
	public Faculty() {
		super();
		department = null;
	}
	
	public String getFaculty() {
		return department;
	}
	
	public void setFaculty(String department) {
		this.department = department;
	}
	
	public String toString() {
		return super.toString() + "Department is: " + department + "\n";
	}

}

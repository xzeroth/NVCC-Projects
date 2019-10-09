
public class Student extends Person {

	private int studentId;
	
	public Student() {
		studentId = 0;
	}
	
	public int getStudent() {
		return studentId;
	}
	
	public void setStudentId(int studentIdInput) {
		if(studentIdInput > 0) {
			studentId = studentIdInput;
		}
	}
	
	public String toString() {
		return super.toString() + " Student ID: " + studentId;
	}
	
	public boolean equals(Object otherObject) {
		
		boolean isEqual = false;
		
		if(super.equals(otherObject) == false) {
			return false;
		}
		
		if(otherObject != null && otherObject instanceof Student) {
			Student otherPerson = (Student)otherObject; //object type casting
			if(this.studentId == otherPerson.studentId) {
				isEqual = true;
			}
		}
		return isEqual;
	}
	
}


public class Student extends Person {
	//instance variables
	private int studentId;
	
	//default constructor
	public Student() {
		super(); //call to the constructor of the Person class
		studentId = 0;
	}
	
	//non-static methods
	public void setStudentId(int newStudentId) {
		if(newStudentId > 0) {
			studentId = newStudentId;
		}
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	//override the toString method from the Person class
	public String toString() {
		return super.toString() + " Student Id:" + studentId;
	}
	
	//override the equals method from the Person class
	public boolean equals(Object otherObject) {
		boolean isEqual = false;
		if(otherObject != null && otherObject instanceof Student) {
			Student otherStudent = (Student)otherObject; //object type-casting
			if(this.studentId == otherStudent.studentId) {
				isEqual = true;
			}
		}
		return isEqual;
	}
	
}

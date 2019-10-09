
public class Course {
	
	private String courseLetter;
	private int courseNumber;
	private String courseName;
	private String courseSemester;
	
	public Course() {
		courseLetter = null;
		courseNumber = 0;
		courseName = null;
		courseSemester = null;
	}

	public boolean isEqual(Course checkCourse) {
		
		boolean check = false;
		
		if(checkCourse.getCourseLetter().equalsIgnoreCase(this.courseLetter) && 
		   checkCourse.getCourseName().equalsIgnoreCase(this.courseName) && 
		   checkCourse.getCourseNumber() == this.courseNumber) {
			check = true;
		}
		return check;
	}
	
	@Override
	public String toString() {
		return "Course [courseLetter=" + courseLetter + ", courseNumber=" + courseNumber + ", courseName=" + courseName
				+ ", courseSemester=" + courseSemester + "]";
	}

	public String getCourseLetter() {
		return courseLetter;
	}

	public void setCourseLetter(String courseLetter) {
		this.courseLetter = courseLetter;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseSemester() {
		return courseSemester;
	}

	public void setCourseSemester(String courseSemester) {
		this.courseSemester = courseSemester;
	}
	

}

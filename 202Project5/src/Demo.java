import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListInterface<Course> needCourse = new ArrayBasedList<Course>();
		ListInterface<Course> doneCourse = new ArrayBasedList<Course>();
		Scanner input = new Scanner(System.in);
		int option;
		do {
			System.out.println("Please choose one of the following");
			System.out.println("1. Add required course");
			System.out.println("2. Add finished course");
			System.out.println("3. Remove required course");
			System.out.println("4. Remove finished course");
			System.out.println("5. See required courses");
			System.out.println("6. See finished courses");
			System.out.println("7. See not finished courses");
			System.out.println("8. See finished courses");
			System.out.println("9. Close program");
			option = input.nextInt();
			
			if(option == 1) {
				Course newCourse = new Course();
				System.out.println("Course ID");
				newCourse.setCourseLetter(input.next());
				System.out.println("Course Number");
				newCourse.setCourseNumber(input.nextInt());
				System.out.println("Course Name");
				newCourse.setCourseName(input.nextLine());
				input.nextLine();
				System.out.println("Course semester");
				newCourse.setCourseSemester(input.nextLine());
				
				needCourse.add(newCourse);
			}else if(option == 2) {
				Course newCourse = new Course();
				System.out.println("Course ID");
				newCourse.setCourseLetter(input.next());
				System.out.println("Course Number");
				newCourse.setCourseNumber(input.nextInt());
				System.out.println("Course Name");
				newCourse.setCourseName(input.nextLine());
				input.nextLine();
				System.out.println("Course semester");
				newCourse.setCourseSemester(input.nextLine());
				
				doneCourse.add(newCourse);

			}else if(option == 3) {
				Course newCourse = new Course();
				System.out.println("Course ID");
				newCourse.setCourseLetter(input.next());
				System.out.println("Course Number");
				newCourse.setCourseNumber(input.nextInt());
				System.out.println("Course Name");
				newCourse.setCourseName(input.nextLine());
				input.nextLine();
				System.out.println("Course semester");
				newCourse.setCourseSemester(input.nextLine());
				
				needCourse.remove(newCourse);
			}else if(option == 4) {
				Course newCourse = new Course();
				System.out.println("Course ID");
				newCourse.setCourseLetter(input.next());
				System.out.println("Course Number");
				newCourse.setCourseNumber(input.nextInt());
				System.out.println("Course Name");
				newCourse.setCourseName(input.nextLine());
				input.nextLine();
				System.out.println("Course semester");
				newCourse.setCourseSemester(input.nextLine());
				
				doneCourse.remove(newCourse);
			}else if(option == 5) {
				needCourse.toString();
			}else if(option == 6) {
				doneCourse.toString();
			}else if(option == 7) {
				System.out.println(needCourse.difference(doneCourse));
			}else if(option == 8) {
				System.out.println(doneCourse.difference(needCourse));
			}else if(option == 9) {
				System.out.println("closing program");
			}else {
				System.out.println("wrong input");
			}
			
		}while(option != 9);

	}

}

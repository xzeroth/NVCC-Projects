
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		int y = 8;
		
		if(x == y) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
		Student p1 = new Student();
		p1.setName("Pamel2a");
		p1.setStudentId(2);
		
		Student p2 = new Student();
		p2.setName("Pamela");
		p2.setStudentId(2);
		
		System.out.println(p1.equals(p2));
		
		
		//p1 = p2;
		if(p1.equals(p2)) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
	}

}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ryu = new Person();
		ryu.setName("Ryu");
		
		System.out.println(ryu.toString());
		
		System.out.println("Ryu's Name: " + ryu.getName());
		
		Employee ken = new Employee();
		ken.setName("Ken");
		ken.setEmployeeId(1);
		
		System.out.println(ken.toString());
//		System.out.println("Ken's Name: " + ken.getName());
//		System.out.println("Ken's Employee Id: " + ken.getEmployeeId());
		
		//ken = ryu;
		ryu = ken;
		ryu.setName("Ryu");
		//ryu.setEmployeeId(2);
		ken.setEmployeeId(2);
		
		System.out.println("Ryu's Name: " + ryu.getName());
		System.out.println("Ken's Name: " + ken.getName());
		System.out.println("Ken's Employee Id: " + ken.getEmployeeId());
		
		Faculty dan = new Faculty();
		dan.setName("Dan");
		dan.setEmployeeId(3);
		dan.setDepartment("CSC");
		
		
		
	}
}
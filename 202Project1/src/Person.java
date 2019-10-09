
public class Person {

	private String name;
	
	
	public Person(){
		name = null;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name is: " + name + "\n";
	}
}

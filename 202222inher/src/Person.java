public class Person {
	//instance variables
	private String name;
	
	//default constructor
	public Person() {
		name = "";
	}
	
	//non-static methods
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	//overriding a method replaces a method defintiion in a parent class
	//with a definition that is more appropriate for the child class
	public String toString() {
		return "Name: " + name;
	}
	
	public boolean equals(Object otherObject) {
		boolean isEqual = false;
		if(otherObject != null && otherObject instanceof Person) {
			Person otherPerson = (Person)otherObject; //object type casting
			if(this.name.equals(otherPerson.name)) {
				isEqual = true;
			}
		}
		return isEqual;
	}
	
	
}
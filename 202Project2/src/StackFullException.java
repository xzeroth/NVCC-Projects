
public class StackFullException extends Exception {
	// instance variables
	// none

	// default constructor
	public StackFullException() {
		super(); // calls the constructor of the Exception class
	}

	// overloaded constructor
	public StackFullException(String message) {
		super(message); // calls the constructor of the Exception class that take a string as an
						// argument
	}

}
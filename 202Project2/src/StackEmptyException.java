public class StackEmptyException extends Exception {
	// instance variables
	// none

	// default constructor
	public StackEmptyException() {
		super(); // calls default constructor of the Exception class
	}

	// overloaded constructor
	public StackEmptyException(String message) {
		super(message); // calls the constructor of the Exception class that takes a string as an
						// argument
	}
}
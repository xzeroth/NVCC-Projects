
public class QueueEmptyException extends Exception {
	//instance variables
	//none
	
	//default constructor
	public QueueEmptyException() {
		super(); //call the default constructor of the parent class (Exception)
	}
	
	//overloaded constructor
	public QueueEmptyException(String message) {
		super(message); //calls the constructor of the parent class (Exception) that takes a String argument 
	}
	
}
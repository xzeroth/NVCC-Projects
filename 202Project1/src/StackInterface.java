
public interface StackInterface<T> {
	//this class uses generics which means that the type can be passed in as a value
	//the type itself becomes a parameter (type paramter) and the value passed in is called type argument
	//method headings for methods that must be implemented by a class
	//that chooses to implement this interface
	
	public void push(T item) throws StackFullException; //method heading
	//places an item at the top of the stack if there is room  
	//otherwise throws StackFullException
	
	public void pop() throws StackEmptyException;
	//removes the item at the top of the stack if there is an item 
	//otherwise throws StackEmptyException
	
	public T peek() throws StackEmptyException;
	//returns the item at the top of the stack without changing the stack if there is an item
	//otherwise throws StackEmptyException
	
	public String toString2();
}
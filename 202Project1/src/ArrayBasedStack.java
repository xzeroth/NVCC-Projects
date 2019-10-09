
public class ArrayBasedStack<T> implements StackInterface<T> {
	//instance variables
	private int top;
	private T [] stack;
	
	//default constructor 
	public ArrayBasedStack() {
		top = -1;
		stack = (T[]) new Object[10]; //typcasting to the T type whatever value that is
	}
	
	//overloaded constructor
	public ArrayBasedStack(int size) {
		top = -1; 
		stack = (T[]) new Object[size];
	}
	
	@Override
	public void push(T item) throws StackFullException {
		// TODO Auto-generated method stub
		if(top < stack.length-1) {
			top++;
			stack[top] = item;
		}
		else 
			throw new StackFullException("Push attempted on a full stack!");
	}

	@Override
	public void pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(top > -1) {
			stack[top] = null;
			top--;
		}
		else 
			throw new StackEmptyException("Pop attempted on an empty stack");
	}

	@Override
	public T peek() throws StackEmptyException {
		// TODO Auto-generated method stub	
		if(top > -1) {
			return stack[top];
		}
		else 
			throw new StackEmptyException("Peek attempted on an empty stack");
	}
	
	//old to new
	public String toString2()  {
		String returnString = "";
		if(top == -1) {
			return returnString;
		}
		for(int i = 0; i <= top; i++) {
			returnString += stack[i] + " ";
		}
		
		return returnString;
	}

	//new to old
	public String toString() {
		String returnString = "";
		if(top == -1) {
			return returnString;
		}
		
		for(int i = top; i > -1; i--) {
			returnString += stack[i] + " ";
		}
		
		return returnString;
	}
	
}
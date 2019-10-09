
public class ArrayBasedStack implements stackInterface {

	private int top;
	private String[] stack;

	public ArrayBasedStack() {

		top = -1;
		stack = new String[10];
	}

	public ArrayBasedStack(int size) {

		top = -1;
		stack = new String[size];
	}

	public void push(String item) {

		try {
		top++;
		stack[top] = item;

		}catch(Exception e) {
			System.out.println("Stack is full");
		}
	}

	public void pop() {
		
		try {
			stack[top] = null;
			top--;
		}catch(Exception e) {
			System.out.println("Stack is empty");
		}
		
//		if (top == -1) {
//			System.out.println("Stack is empty");
//		} else {
//			stack[top] = "";
//			top--;
//		}
	}

	public String peek() {
		
		try {
			return stack[top];
		}catch(Exception e) {
			return "Stack is emptyyyy";
		}
		
//		if (top == -1) {
//			return "Stack is empty";
//		} else {
//			return stack[top];
//		}
	}

}

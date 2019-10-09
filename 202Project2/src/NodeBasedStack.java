
public class NodeBasedStack<T> implements UnboundedStackInterface<T> {
	//instance variables
	private Node<T> top;
	
	//default constructor 
	public NodeBasedStack() {
		top = null;
	}
	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		Node<T> currentNode = new Node<T>(item);
		if(top == null) {
			top = currentNode;
		}
		else {
			currentNode.setLink(top);
			top = currentNode;
		}
	}

	@Override
	public void pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(top != null) {
			top = top.getLink();
		}
		else {
			throw new StackEmptyException("Pop attempted on an empty stack.");
		}
	}

	@Override
	public T peek() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(top != null) {
			return top.getData();
		}
		else {
			throw new StackEmptyException("Peek attempted on an empty stack.");
		}
		
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		if(top == null) {
			return 0;
		}
		Node<T> tempNode = top;
		int counter = 1;
		while(tempNode.getLink() != null) {
			counter++;
			tempNode = tempNode.getLink();
		}
		return counter;
	}

}
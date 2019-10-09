
public class NodeBasedQueue<T> implements UnboundedQueueInterface<T> {
	//instance variables
	private int numberOfItems;
	private Node<T> front;
	private Node<T> rear;
	
	//default constructor
	public NodeBasedQueue() {
		numberOfItems = 0;
		front = null;
		rear = null;
	}
	
	@Override
	public T dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(numberOfItems == 0 && front == null & rear == null) {
			throw new QueueEmptyException("Dequeue attempted on an empty queue.");
		}
		else {
			T frontItem = front.getData();
			front = front.getLink();
			if(front == null) 
				rear = null;
			numberOfItems--;
			return frontItem;
		}
		
	}

	@Override
	public T look() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(numberOfItems == 0 && front == null && rear == null) {
			throw new QueueEmptyException("Look attempted on an empty queue.");
		}
		else {
			return front.getData();
		}
		
	}

	@Override
	public void enqueue(T item) {
		// TODO Auto-generated method stub
		Node<T> currentNode = new Node<T>(item);
		if(numberOfItems == 0 && front == null && rear == null) {
			front = currentNode;
			rear = currentNode;
			numberOfItems++;
		}
		else {
			rear.setLink(currentNode);
			rear = currentNode;
			numberOfItems++;
		}
	}

}
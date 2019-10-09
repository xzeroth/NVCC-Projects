
public class ArrayBasedQueue<T> implements QueueInterface<T> {
	// instance variables
	private int rear;
	private T[] queue;

	// default constructor
	public ArrayBasedQueue() {
		rear = 0;
		queue = (T[]) new Object[10];
	}

	// overloaded constructor
	public ArrayBasedQueue(int queueSize) {
		rear = 0;
		queue = (T[]) new Object[queueSize];
	}

	@Override
	public void enqueue(T item) throws QueueFullException {
		// TODO Auto-generated method stub
		if (size() < queue.length) {
			queue[rear] = item;
			rear++;
		} else {
			throw new QueueFullException("Enqueue attempted on a full queue.");
		}
	}

	@Override
	public T dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		T[] tempQueue = (T[]) new Object[queue.length];
		if (size() == 0) {
			throw new QueueEmptyException("Dequeue attempted on an empty queue.");
		} else {
			
			T frontItem = queue[0];
			
			for(int i = 0; i < tempQueue.length - 1 ; i ++) {
				tempQueue[i] = queue[i+1];
			}

			queue = tempQueue; 
			rear--;
			
			return frontItem;
		}

	}

	@Override
	public T look() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if (size() > 0) {
			return queue[0];
		} else {
			throw new QueueEmptyException("Look attempted on an empty queue.");
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		int numberOfItems = 0;
		while(queue[numberOfItems] != null ) {
			numberOfItems++;
			if(numberOfItems == queue.length) {
				break;
			}
		}
		return numberOfItems;
	}
	
	public String toString() {
		String ansStr = "";
		
		for(T item : queue) {
			ansStr = ansStr + item + " ";
		}
		
		return ansStr;
	}

}
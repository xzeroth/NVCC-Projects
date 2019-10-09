
public interface QueueInterface<T> {
	public void enqueue(T item);
	//adds an item to the rear of the queue if there is room
	//otherwise throws QueueFullException
	
	public T dequeue() throws QueueEmptyException;
	//removes the item at the front of the queue if there is one and returns it
	//otherwise throws QueueEmptyException
	
	public T look() throws QueueEmptyException;
	//returns the item at the front of queue without changing the queue if there is one
	//otherwise throws QueueEmptyException
}
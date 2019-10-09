
public interface UnboundedQueueInterface<T> extends QueueInterface<T> {
	public void enqueue(T item);
	//adds an item to the rear of the queue
}
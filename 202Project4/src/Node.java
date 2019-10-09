
public class Node<T> {
	//instance variables
	private T data;
	private Node<T> link; //reference to a Node object
	
	//constructor
	public Node(T newData) {
		data = newData;
		link = null;
	}
	
	//non-static methods
	public void setData(T newData) {
		data = newData;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node<T> newNode) {
		this.link = newNode;
	}
	
	public Node<T> getLink() {
		return link;
	}
}
	
	

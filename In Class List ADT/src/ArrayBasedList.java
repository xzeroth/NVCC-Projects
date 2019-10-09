
public class ArrayBasedList<T> implements ListInterface<T> {
	//instance variables
	private int numberOfItems;
	private T[] list;
	
	//default constructor
	public ArrayBasedList() {
		numberOfItems = 0;
		list = (T[])new Object[3];
	}
	
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		if(numberOfItems >= list.length) {
			expand();
			//list[numberOfItems] = item;
			//numberOfItems++;
		}
		//else {
			//T[] largerList = (T[])new Object[list.length * 2];
			//for(int index = 0; index < list.length; index++) {
			//	largerList[index] = list[index];
			//}
			//expand();
			//list[numberOfItems] = item;
			//numberOfItems++;
			
			//list = largerList;
		//}
		
		list[numberOfItems] = item;
		numberOfItems++;
	}
	
	//private methods are only accessible inside class and they are 
	//generally referred to as helper methods which can be called from other methods inside the class
	private void expand() {
		T[] largerList = (T[])new Object[list.length * 2];
		for(int index = 0; index < list.length; index++) {
			largerList[index] = list[index];
		}
		list = largerList;
	}

	@Override
	public boolean remove(T item) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.length; i++) {
			if(list[i].equals(item)) {
				list[i] = list[numberOfItems - 1];
				list[numberOfItems - 1] = null;
				numberOfItems--;
				
				for(T k : list) {
					System.out.println(k);
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean find(T item) {
		// TODO Auto-generated method stub
		for(T search : list) {
			if(search.equals(item)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		
		String returnString = "";
		for(int i = 0 ; i < numberOfItems; i++) {
			returnString += String.format("%s\n", list[i]);
		}
		return returnString;
	}

}
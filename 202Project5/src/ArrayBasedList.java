
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
		}
		
		list[numberOfItems] = item;
		numberOfItems++;
	}
	
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
		int index = locate(item);
		boolean removed = false;
		if(index < numberOfItems) {
			numberOfItems--;
			list[index] = null;
			list[index] = list[numberOfItems];
			list[numberOfItems] = null;
			removed = true;
		}
		return removed;
	}

	@Override
	public boolean find(T item) {
		// TODO Auto-generated method stub
		int index = locate(item);
		boolean found = false;
		if(index < numberOfItems) {
			found = true;
		}
		
		return found;
	}
	
	private int locate(T item) {
		int index = 0;
		boolean found = false;
		while(!found && index < numberOfItems) {
			if(list[index].equals(item)) {
				found = true;
			}
			else {
				index++;
			}
		}
		return index;
	}
//	
//	private boolean equals(Object item, int index) {
//		boolean ans = false;
//		if(item instanceof Course && list[index] instanceof Course) {
//			Course tempCourse = (Course) item;
//			Course temp1Course = (Course) list[index];
//			if(tempCourse.getCourseLetter().equalsIgnoreCase(temp1Course.getCourseLetter()) &&
//					tempCourse.getCourseNumber() == temp1Course.getCourseNumber()){
//				ans = true;
//			}
//		}
//		return ans;
//	}
	
	
	public String toString(){
		for(T courses : list) {
			System.out.println(courses);
		}
		return null;
	}
	
	private T[] getList() {
		return list;
	}
	
	@Override
	public ListInterface<T> difference(ListInterface<T> secondList) {
		// TODO Auto-generated method stub
		
		ListInterface<T> newDifference = new ArrayBasedList<T>();
		
		for(T item : list) {
			if(secondList.find(item) == false) {
				System.out.println(secondList.find(item));
				newDifference.add(item);
			}
		}
		

		return newDifference;
	}

}

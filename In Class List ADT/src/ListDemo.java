
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListInterface<String> favoriteBandList = new ArrayBasedList<String>();
		favoriteBandList.add("Rush");
		favoriteBandList.add("Pink Floyd");
		favoriteBandList.add("Iron Maiden");
		
		//favoriteBandList.expand();
		favoriteBandList.add("Van Halen");
		favoriteBandList.toString();
		System.out.println(favoriteBandList.toString());
//		favoriteBandList.remove("Rush");
		
	}

}
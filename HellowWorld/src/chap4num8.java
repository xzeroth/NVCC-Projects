
public class chap4num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int x = 20; x > 0; x--) {		
	
	int price1 = (int) (Math.random() * 10) + 1;
	int price2 = 0;
	int price3 = 0;



	while (price2 == price1 || price2 == price3) {
		price2 = (int) (Math.random() * 10) + 1;
	}

	while (price3 == price2 || price3 == price1 || price3 == 0) {
		price3 = (int) (Math.random() * 10) + 1;
	}


	System.out.println("Price goes to player " + price1 + ", " + price2 + ", " +price3);
	}


	}

}

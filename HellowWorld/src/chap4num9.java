import java.util.Scanner;

public class chap4num9 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("How much money do you have?");
		int userMoney = userInput.nextInt();
		
		int chocoBars = 0;
		int userCoupon = 0;		
		
		chocoBars =+ userMoney;
		
		if (userMoney >= 6) {
			chocoBars = chocoBars + (userMoney / 6);
			userCoupon = userMoney / 6;
		}
		
		while (userCoupon >= 6) {
			chocoBars = chocoBars + 1;
			userCoupon = userCoupon - 6;
		}
		
		System.out.println("You will have total of " + chocoBars + " bars and " + userCoupon + " coupons left.");
		
	}
}



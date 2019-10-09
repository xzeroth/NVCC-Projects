package prime;

import java.util.Scanner;

public class prime {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a phone number.");
		double number = input.nextDouble();
		System.out.println(isPrime(number));
	}
	public static boolean isPrime(double number) {
		
		if ((number % 2) == 0 && number != 2) {
			return false;
		}
		
		double x = number;
		double sumX = 0;
		int length = String.valueOf(x).length();
		
		for (int i = 0; i < length; i++) {
			sumX = sumX + (x % 10);
			x = x / 10;
		}
		
		if(sumX % 3 == 0) {
			return false;
		}
		
		if ((number % 5) == 5 && number !=5) {
			return false;
		}
		
		
		for (int i = 2; i < number - 1; i++) {
			if((number) % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}

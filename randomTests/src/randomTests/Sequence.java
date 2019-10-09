package randomTests;

import java.math.BigInteger;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger x = new BigInteger("5");
//		BigInteger y = new BigInteger("3");
//		System.out.println(x.multiply(y));
		System.out.println(perimeter(x));
		System.out.println(perimeter(5));
	}

	public static int perimeter(int n) {
		// your code
		return fib2(n);
	}

	public static BigInteger perimeter(BigInteger n) {
		// your code
		return fib3(n).multiply(BigInteger.valueOf(4));
	}

	public static BigInteger fib3(BigInteger n) {
		BigInteger first = BigInteger.valueOf(0);
		BigInteger second = BigInteger.valueOf(1);
		BigInteger third = BigInteger.valueOf(0);
		BigInteger ans = BigInteger.valueOf(1);
//			System.out.println(first);
		for (int x = 0; x < n.intValue(); x++) {
			ans = ans.add(first.add(second));
			third = first.add(second);
			first = second;
			second = third;
		}
		return ans;
	}

	public static int fib2(int n) {
		int first = 0;
		int second = 1;
		int third = 0;
		int ans = 1;
		for (int x = 0; x < n; x++) {
			ans = ans + first + second;
			third = first + second;
			first = second;
			second = third;
		}


		return ans;
	}

	public static int fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

}

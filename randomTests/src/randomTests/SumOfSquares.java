package randomTests;

public class SumOfSquares {

	/*
	 * sum_of_squares(17) = 2 17 = 16 + 1 (4 and 1 are perfect squares).
	 * 
	 * sum_of_squares(15) = 4 15 = 9 + 4 + 1 + 1. There is no way to represent 15 as
	 * the sum of three perfect squares.
	 * 
	 * sum_of_squares(16) = 1 16 itself is a perfect square.
	 */

	static int sumOfSquares = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println((int) Math.sqrt(1008));
//		System.out.println(Math.sqrt(17) * Math.sqrt(17));
		System.out.println(nSquaresFor(19));

	}

	public static int nSquaresFor(int n) {
		// Your code here!
		int counter = 0;
		
		
		if(n == Math.sqrt(n/2) * Math.sqrt(n/2) * 2) {
			return 2;
		}
		
		if((int)Math.sqrt(16) * (int)Math.sqrt(16) == n) {
			return 1;
		}
	
		
		while (n > 0) {
			if (n > 3) {
				n = n - ((int) Math.sqrt(n) * (int) Math.sqrt(n));
				//System.out.println(n);
				counter++;
				System.out.println("this" + counter);
			} else if (n <= 3 && n > 0) {
				System.out.println("what is n ? " + n);
				counter = counter + n;
				n = 0;
			}
		}

		return counter;

	}

}

package randomTests;

public class halfChristmasTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfSteps = 10;
		
		for(int i = 0; i < numberOfSteps; i++) {
			
			/*
			 * This for loop creates spaces before hash(#).
			 * Number of spaces are determined by numberOfSteps variable
			 * and it gets lowered by increment by -1 (k--)
   			 */
			for(int k = numberOfSteps; k > i; k--) {
				System.out.print(" ");
			}
			
			/*
			 *This for loop prints different number of hash(#) after previous loop
			 */
			for(int j = 0; j < i+1; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

package randomTests;

public class christmasTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfSteps = 10;
		
		/*
		 * changeInLeafs variable sets the leaf quantity by line.
		 * needed this variable outside of the for loop because
		 * Christmas tree have to know the numberOfLeafs in a previous step
		 */
		int changeInLeafs = 1;
		
		for(int treeSteps = 0; treeSteps < numberOfSteps; treeSteps++) {
			
			/*
			 * This for loop creates spaces before hash(#).
			 * Number of spaces are determined by numberOfSteps variable
			 * and it gets lowered by increment by -1 (k--)
   			 */
			for(int k = numberOfSteps; k > treeSteps; k--) {
				System.out.print(" ");
			}
			
			/*
			 *This for loop prints different number of hash(#) after previous loop
			 *changeInLeafs int is added to the treeSteps to add number of leafs
			 *that is required for each step of the tree
			 */
			for(int j = 0; j < treeSteps+changeInLeafs; j++) {
				System.out.print("#");
			}
			
			System.out.println();
			
			/*
			 * After main loop is over(after one step of the tree line is complete)
			 * before the next step of the tree it increment the changeInLeafs quantity 
			 * to match the required leafs per step.
			 */
			changeInLeafs++;
		}
	}
}

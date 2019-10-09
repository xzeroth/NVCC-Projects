
public class test
{
	
	public static void main(String[] args) {
		//set array
		int[] testArrOne = new int[5];
		int[] testArrTwo = new int[8];
		int[] testArrEql = new int[Math.max(testArrOne.length, testArrTwo.length)];
		//set values in to array
		for(int values = 0; values < testArrOne.length; values++) {
			testArrOne[values] = 1 + values;
			System.out.println("array one = " + testArrOne[values]);
		}
		
		for(int values = 0; values < testArrTwo.length; values++) {
			testArrTwo[values] = 1 + values;
			System.out.println("array two = " + testArrTwo[values]);
		}
		//compare two array
		for (int i = 0; i < Math.max(testArrOne.length, testArrTwo.length); i++) {
			if (testArrOne[i] == testArrTwo[i]) {
				testArrEql[i] = testArrOne[i];
				}
			}
		}
		
		
		
	}

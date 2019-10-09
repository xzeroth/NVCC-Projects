package randomStack;

import java.util.*;

public class stackProblem {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkStack("(())");
		

	}
public static void checkStack(String x) {
	
//	ArrayList<Character> charArray = new ArrayList<Character>();
	
	char[] testArray = x.toCharArray();
	
	System.out.println(testArray.length);
	
	Stack<Character> xStack = new Stack<>();
	
	int counter = 0;
	
	for(int i = 0; i <= testArray.length/2; i++) {
		xStack.push(testArray[i]);
		counter++;
	}
	
	for(int j = counter; j < testArray.length; j++) {
		if(testArray[j] == xStack.peek()) {
			xStack.pop();
		}
	}
	
	if(xStack.empty()) {
		System.out.println("yes");
	}
	
	
}

}

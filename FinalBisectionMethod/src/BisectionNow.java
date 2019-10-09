import java.util.Scanner;
import java.util.ArrayList;

public class BisectionNow {

	public static void main(String[] args) {
		
		
		//finding value
				
		Scanner input = new Scanner(System.in);
		
		calculation solve = new calculation();
		ArrayList<String> list = new ArrayList<String>(1);
		
		System.out.println("c5");
		solve.setC5(input.nextDouble());
		System.out.println("c4");
		solve.setC4(input.nextDouble());
		System.out.println("c3");
		solve.setC3(input.nextDouble());
		System.out.println("c2");
		solve.setC2(input.nextDouble());
		System.out.println("c1");
		solve.setC1(input.nextDouble());
		System.out.println("c0");
		solve.setC0(input.nextDouble());
		
		
		for(double i = -100; i < 100; i = i + .1) {
			if (solve.trigger(i) == true) {
				double temp = solve.bisectionD(i-.1, i);
				String tempString = String.valueOf(temp);
				list.add(tempString);
			}
		}
		
		for(String string:list) {
			System.out.println(string);
		}
		
		String listString = "roots are/is : \n";
		for(String string:list) {
			listString = listString + string +"\n";
		}
		
		System.out.println(listString);
		
	}
	 
	
	
	
	
}

import java.util.Scanner;

public class n8PPhw {

	public static void main(String[] args) {
		// I have already program this question with option to type in M or F. Which pg 195 # 5 asked to do so.
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		int weightP1 = userInput.nextInt();
		
		System.out.println("Enter height in inches: ");
		int heightP1 = userInput.nextInt();
		
		System.out.println("Enter age : ");
		int ageP1 = userInput.nextInt();
		
		double BMRM = 66 + ( 6.3 * weightP1) + (12.9 * heightP1) - (6.8 * ageP1);
		int BMRintM = (int) Math.round(BMRM);
		System.out.print("Male BMR is " + BMRintM);
		int needChocoM = BMRintM / 230;
		System.out.println(" and need " + needChocoM + " chocolate bars.");
		
		double BMR = 665 + ( 4.3 * weightP1) + (4.7 * heightP1) - (4.7 * ageP1);
		int BMRint = (int) Math.round(BMR);
		System.out.print("Female BMR is " + BMRint);
		int needChoco = BMRint / 230;
		System.out.print(" and need " + needChoco + " chocolate bars.");
		
		/*
		while (true) {
		if (sexP2 == 'M') {
			double BMR = 66 + ( 6.3 * weightP1) + (12.9 * heightP1) - (6.8 * ageP1);
			int BMRint = (int) Math.round(BMR);
			System.out.print("Your BMR is " + BMRint);
			int needChoco = BMRint / 230;
			System.out.print(" and need " + needChoco + " chocolate bars.");
			break;
		} else if (sexP2 == 'F') {
			double BMR = 665 + ( 4.3 * weightP1) + (4.7 * heightP1) - (4.7 * ageP1);
			int BMRint = (int) Math.round(BMR);
			System.out.print("Your BMR is " + BMRint);
			int needChoco = BMRint / 230;
			System.out.print(" and need " + needChoco + " chocolate bars.");
			break;
		} else {
			System.out.println("Wrong input. Enter sex (ex Female = F, Male = M : )");
			sexP1 = userInput.next().charAt(0);
			sexP2 = Character.toUpperCase(sexP1);
		}
	}
	*/

}
}

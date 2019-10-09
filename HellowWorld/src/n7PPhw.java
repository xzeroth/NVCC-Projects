import java.util.Scanner;

public class n7PPhw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter radius of the well: ");
		double radius = userInput.nextDouble();
		
		System.out.print("Enter depth of the well: ");
		double depth = userInput.nextDouble();
		
		double wellVolume = (Math.PI * radius/12 * radius/12 * depth) * 7.48;
		double needTank = 250 - wellVolume;
		
		if (wellVolume >= 250) {
			System.out.println("");
			System.out.println("Well holds " + String.format("%.2f", wellVolume) + 
					" gallons of water. Plenty for a family of 4.");
		}
		else {
			System.out.println("");
			System.out.println("Well holds " + String.format("%.2f", wellVolume) + 
					" gallons of water. Need to install " + String.format("%.2f", needTank) + 
					" gallon size holding tank.");
		}
		
	}

}

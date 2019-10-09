import java.io.PrintWriter;
import java.util.Scanner;

public class studentWithFiles extends student{
	
	public studentWithFiles() {
		super();
	}
	
	public void readInputFile(Scanner input) {
		String sInput;
		int iInput;
		boolean bInput;
		

		sInput = input.nextLine();
		super.setfName(sInput);
		
		sInput = input.nextLine();
		super.setlName(sInput);
		
		sInput = input.nextLine();
		super.setAddress(sInput);
		
		sInput = input.nextLine();
		super.setPhoneNumber(sInput);
		
		iInput = input.nextInt();
		super.setcEnrolled(iInput);
		
		
		bInput = input.nextBoolean();
		super.setqInstate(bInput);
		
		bInput = input.nextBoolean();
		super.setCampusFood(bInput);
		
		iInput = input.nextInt();
		super.setMealChoice(iInput);
		super.setMealPrice(iInput);
		
		bInput = input.nextBoolean();
		super.setHealthCare(bInput);
		
		bInput = input.nextBoolean();
		super.setLateFee(bInput);
		
		input.nextLine();
	}
	
	public void writeOutputFile(PrintWriter textStream) {
		textStream.println("First name: " + super.getfName());
		textStream.println("Last name: " + super.getlName());
		textStream.println("Address: " + super.getAddress());
		textStream.println("Phone number " + super.getPhoneNumber());
		textStream.println("Credits: " + super.getcEnrolled());
		textStream.println("Instate: " + super.isqInstate());
		textStream.println("Meal Choice: " + super.getMealChoice());
		textStream.println("Health Care: " + super.isHealthCare());
		textStream.println("Late Fee: " + super.isLateFee());
	}
	
	public boolean checkBool(String x) {
		if(x.equalsIgnoreCase("yes")) {
			return true;
		}else if (x.equalsIgnoreCase("no")) {
			return false;
		}
		return false;
	}

}

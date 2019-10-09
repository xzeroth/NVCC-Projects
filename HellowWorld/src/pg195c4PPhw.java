import java.util.Scanner;

public class pg195c4PPhw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dateInput = new Scanner(System.in);
		
		
		System.out.println("Please enter a date ex. mm/dd/yyyy");
		String userDate = dateInput.nextLine();
		
		String dateMonth = userDate.substring(0, 2);
		int dateMonthInt = Integer.parseInt(dateMonth);
	
		String dateDay = userDate.substring(3, 5);
		int dateDayInt = Integer.parseInt(dateDay);
		
		String dateYear = userDate.substring(6, 10);
		int dateYearInt = Integer.parseInt(dateYear);
		
		
		
		if (userDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
			switch(dateMonthInt) {
			case 1:
				if (dateDayInt > 31) {
					System.out.println("There are only 31 days in the month of January");
				}else {
					System.out.println("Valid Date");
				}
				break;
			case 2:
				
				boolean leapYear = (dateYearInt % 4 == 0) && (dateYearInt % 100 != 0) || (dateYearInt % 400 == 0);
				if (leapYear == true && (dateDayInt > 29)) {
					System.out.println("Year " + dateYear + " is a leap year. There are only 29 days in this month. ");
				}else if (dateYearInt % 4 != 0 && dateDayInt > 28) {
					System.out.println("There are only 28 days in the month of February (non-leap year)");
				}else if (leapYear == false) {
					
					System.out.println("Invalid Date");
				}
				
				else {
					System.out.println("Valid Date for Feb");
				}
				break;
			case 3:
				if (dateDayInt > 31) {
					System.out.println("There are only 31 days in the month of March");
				}else {
					System.out.println("Valid Date");
				}
				break;
			case 4:
				if (dateDayInt > 30) {
					System.out.println("There are only 30 days in the month of April");
				}else {
					System.out.println("Valid Date");
				}
				break;
			case 5:
				if (dateDayInt > 31) {
					System.out.println("There are only 31 days in the month of May");
				}else {
					System.out.println("Valid Date");
				}
				break;
			case 6:
				if (dateDayInt > 30) {
					System.out.println("There are only 30 days in the month of June");
				} else {
					System.out.println("Valid Date");
				}
				break;
			case 7:
				if (dateDayInt > 31) {
					System.out.println("There are only 31 days in the month of July");
				}else {
					System.out.println("Valid Date");
				}
				break;
			case 8:
				if (dateDayInt > 31) {
					System.out.println("There are only 31 days in the month of August");
				}else {
					System.out.println("Valid Date");
				}
				break;
			case 9:
				if (dateDayInt > 30) {
					System.out.println("There are only 30 days in the month of September");
				}else {
					System.out.println("Valid Date");
				}
				break;
			case 10:
				if (dateDayInt > 31) {
					System.out.println("There are only 31 days in the month of October");
				}else {
					System.out.println("Valid Date");
				}
				break;
			case 11:
				if (dateDayInt > 30) {
					System.out.println("There are only 30 days in the month of November");
				}else {
					System.out.println("Valid Date");
				}
				break;
			case 12:
				if (dateDayInt > 31) {
					System.out.println("There are only 31 days in the month of December");
				}else {
					System.out.println("Valid Date");
				}
				break;
			default:
				System.out.println("Invalid Month");
			
			}
		}else {
			System.out.println("Date format does not match.");
		}

	}

}


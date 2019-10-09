import java.util.Scanner;

public class PrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer printerOne = new Printer();
		Scanner input = new Scanner(System.in);
		int option;
		do {
			System.out.println("1. Process next print job");
			System.out.println("2. Add new print request");
			System.out.println("3. See print job in queue");
			System.out.println("4. Check paper tray");
			System.out.println("5. Add more paper to a tray");
			System.out.println("6. Leave printer");
			option = input.nextInt();
			
			
			if(option == 2) {
				PrintJob newJob = new PrintJob();
				System.out.println("What is the name for this job?");
				newJob.setName(input.next());
				System.out.println("What color paper do you want to print on?");
				System.out.println("1. White");
				System.out.println("2. Yellow");
				String color = null;
				if(input.nextInt() == 1) {
					color = "white";
				}else if(input.nextInt() == 2) {
					color = "yellow";
				}
				newJob.setColor(color);
				System.out.println("What do you want to print?");
				newJob.setText(input.nextLine());
				input.nextLine();
				System.out.println("How many copies?");
				try {
					newJob.setNumPaper(input.nextInt());
				} catch (LessThanOneException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				printerOne.acceptJob(newJob);
			}else if (option == 1) {
				try {
					printerOne.nextJob();
				} catch (NotEnoughPaperException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
			}else if (option == 3) {
				printerOne.allPrintJobs();
			}else if (option == 4) {
				System.out.println("Which tray would you like to check?");
				System.out.println("1. White paper tray");
				System.out.println("2. Yellow paper tray");
				if(input.nextInt() == 1) {
					try {
						printerOne.checkPaper("white");
					} catch (ColorPaperException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				}else if(input.nextInt() == 2) {
					try {
						printerOne.checkPaper("yellow");
					}catch(ColorPaperException e) {
						System.out.println(e.getMessage());
					}
				}
			}else if (option == 5) {
				System.out.println("How many paper do you want to add?");
				int addingPaper = input.nextInt();
				System.out.println("Which tray would you like to add paper to?");
				System.out.println("1. White paper tray");
				System.out.println("2. Yellow paper tray");
				if(input.nextInt() == 1) {
					try {
						printerOne.addPaper("white",addingPaper);
					} catch (ColorPaperException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				}else if(input.nextInt() == 2) {
					try {
						printerOne.addPaper("yellow",addingPaper);
					}catch(ColorPaperException e) {
						System.out.println(e.getMessage());
					}
				}
				
			}
			
		}while(option != 6);
		
	}

}

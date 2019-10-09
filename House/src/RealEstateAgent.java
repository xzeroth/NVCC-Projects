import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class RealEstateAgent // *** this is the largest class
{
	// *** ArrayLists that I used.
	Scanner input = new Scanner(System.in);
	private ArrayList<Agency> agencyArray = new ArrayList<Agency>();
	private ArrayList<RealEstateListing> listingsFromOneAgency = new ArrayList<RealEstateListing>();
	private ArrayList<RealEstateListing> finalArrayListOfRealEstateListings = new ArrayList<RealEstateListing>();
	private String answerSoFar = "";
	private Agency century21 = null;
	private Agency reMax = null;
	private Agency mcEnearney = null;
	private Agency longAndFoster = null;

	public RealEstateAgent()
	{	
//       Create real-estate companies here.  
//       Give them a name and pass in their text file. 
//       Here is the code.
       century21 = new Agency("Century 21","Century21.txt");
       longAndFoster = new Agency("Long and Foster", "longAndFoster.txt");
       reMax = new Agency("reMax", "Remax.txt");
       mcEnearney = new Agency("mcEnearney", "mcEnearney.txt");
       
       
	}
	private void getAgenciesForTheExhibition() {
		// TODO Auto-generated method stub
		System.out.println( "For this list of homes which real-estate agencies\n" + 
							"would you like the home listings drawn from?\n" + 
							"Please enter their numbers on one line");
		System.out.println(	"1. Century 21\n" +
							"2. ReMax\n" +
							"3. McEnearney\n" +
							"4. Long & Foster");
		String temp = input.next();
		
		input.nextLine();
		
		char[] tempArray = temp.toCharArray();
		for(int i = 0; i < tempArray.length; i++) {
			switch (tempArray[i]) {
			
			case '1':
				agencyArray.add(century21);
				break;
			case '2':
				agencyArray.add(reMax);
				break;
			case '3':
				agencyArray.add(mcEnearney);
				break;
			case '4':
				agencyArray.add(longAndFoster);
				break;
			default:
				break;
			}
		}
		
		
	}

	public String listingsChosen()
	{
		getAgenciesForTheExhibition();
		//*** this is an ArrayList
		//*** I read a String and used a Scanner instance to scan a string 
        //*** for the integers integers. See handout for an example of this.
		int homeCriterion = pickHomeCriterion();
		switch (homeCriterion)
		{
		case 1:// Style
			int style = getStyle();
			finalArrayListOfRealEstateListings = style(style, agencyArray);
			System.out.println(finalArrayListOfRealEstateListings);
			break;
		case 2: //bedroom
			int bedroom = getBedRoom();
			finalArrayListOfRealEstateListings = bedRoom(bedroom, agencyArray);
			System.out.println(finalArrayListOfRealEstateListings);
			break;
		case 3: //bathroom
			int bathroom = getBathRoom();
			finalArrayListOfRealEstateListings = bathRoom(bathroom, agencyArray);
			System.out.println(finalArrayListOfRealEstateListings);
			break;
		case 4: // lot size
			int lotsize = getLotSize();
			finalArrayListOfRealEstateListings = lotsize(lotsize, agencyArray);
			System.out.println(finalArrayListOfRealEstateListings);
			break;
		case 5: // age
			int age = getAge();
			finalArrayListOfRealEstateListings = age(age, agencyArray);
			System.out.println(finalArrayListOfRealEstateListings);
			break;
		case 6: //price
			int price = getPrice();
			finalArrayListOfRealEstateListings = price(price, agencyArray);
			System.out.println(finalArrayListOfRealEstateListings);
			break;
		case 7: //distance
			int distance = getDistance();
			finalArrayListOfRealEstateListings = distance(distance, agencyArray);
			System.out.println(finalArrayListOfRealEstateListings);
			break;
		case 8: //area
			int area = getArea();
			finalArrayListOfRealEstateListings = area(area, agencyArray);
			System.out.println(finalArrayListOfRealEstateListings);
			break;
		
		default:
			System.out.println("bad topic Selection choice " + homeCriterion);
			System.exit(0);
			
		}
		return "Hello";
	}// switch
	// *** I have a method that creates a string of the agencies used.
	// *** I have a method that takes the final list of homes
	// *** and puts them in a string that is returned.

	private int pickHomeCriterion() {
		// TODO Auto-generated method stub
		System.out.println("Please choose home criteria and enter it's number");
		System.out.println("1. Style");
		System.out.println("2. Bedrooms");
		System.out.println("3. Bathrooms");
		System.out.println("4. Lot Size");
		System.out.println("5. Age");
		System.out.println("6. Price");
		System.out.println("7. Distance from work");
		System.out.println("8. Jurisdiction");
		int x = input.nextInt();
		while(x < 1 || x > 8) {
			System.out.println("Choice is out of range, re-enter the number or type 0 to exit");
			x = input.nextInt();
			if (x == 0) {
				System.exit(0);
			}
		}
		return x;
	}



	public int getStyle() {
		System.out.println("Choose a style");
		System.out.println("1. Colonial");
		System.out.println("2. Split Level");
		System.out.println("3. Town House");
		System.out.println("4. Condominium");
		System.out.println("5. Cape Cod");
		System.out.println("6. Georgian");
		System.out.println("7. Rambler");
		int x = input.nextInt();
		while(x < 1 || x > 7) {
			System.out.println("Choice is out of range, re-enter the number or type 0 to exit");
			x = input.nextInt();
			if (x == 0) {
				System.exit(0);
			}
		}
		return x;
	}
	
	public int getBedRoom() {
		System.out.println("Type in number of bedrooms");
		int x = input.nextInt();
		if ( x < 0) {
			System.out.println("Number of the bedroom can't be less than 0");
		}
		return x;
	}
	
	public int getBathRoom() {
		System.out.println("Choose a number of bathrooms");
		System.out.println("1. 1 ~ 1.5");
		System.out.println("2. 2 ~ 2.5");
		System.out.println("3. over 3");
		int x = input.nextInt();
		while (x < 1 || x > 3) {
			System.out.println("Choice is out of range, re-enter the number or type 0 to exit");
			x = input.nextInt();
			if ( x == 0) {
				System.exit(0);
			}
		}
		return x;
	}
	
	public int getLotSize() {
		System.out.println("Choose a size of the lot");
		System.out.println("1.  0 ~ 0.5");
		System.out.println("2.  0.5 ~ 1");
		System.out.println("3.  1.5 ~ 2");
		System.out.println("4.  2 ~ 2.5");
		System.out.println("5.  over 2.5");
		int x = input.nextInt();
		while ( x < 1 || x > 5) {
			System.out.println("Choice is out of range, re-enter the number or type 0 to exit");
			x = input.nextInt();
			if ( x == 0) {
				System.exit(0);
				
			}
		}
		return x;
	}
	
	public int getAge() {
		System.out.println("Choose a age of the house");
		System.out.println("1. 1 ~ 5");
		System.out.println("2. 6 ~ 10");
		System.out.println("3. 11 ~ 15");
		System.out.println("4. 16 ~ 20");
		System.out.println("5. older than 21");
		int x = input.nextInt();
		while ( x < 1 || x > 5) {
			System.out.println("Choice is out of range, re-enter the number or type 0 to exit");
			x = input.nextInt();
			if ( x == 0) {
				System.exit(0);
			}
		}
		return x;
	}
	
	public int getPrice() {
		System.out.println("Choose a price range");
		System.out.println("1. under $100,000");
		System.out.println("2. $100,000 to $150,000");
		System.out.println("3. $150,000 to $200,000");
		System.out.println("4. $200,000 to $300,000");
		System.out.println("5. $300,000 to $400,000");
		System.out.println("6. Over $400,000");
		int x = input.nextInt();
		while ( x < 1 || x > 6) {
			System.out.println("Choice is out of range, re-enter the number or type 0 to exit");
			x = input.nextInt();
			if ( x == 0) {
				System.exit(0);
			}
		}
		return x;
	}
	
	public int getDistance() {
		System.out.println("Choose a disance from work");
		System.out.println("1. 0 ~ 1 miles");
		System.out.println("2. 1 ~ 5 miles");
		System.out.println("3. 5 ~ 10 miles");
		System.out.println("4. 10 ~ 15 miles");
		System.out.println("5. over 15 miles");
		int x = input.nextInt();
		while ( x < 1 || x > 5) {
			System.out.println("Choice is out of range, re-enter the number or type 0 to exit");
			x = input.nextInt();
			if ( x == 0) {
				System.exit(0);
			}
		}
		return x;
	}
	
	public int getArea() {
		System.out.println("Choose a Jurisdiction");
		System.out.println("1. Alexandria");
		System.out.println("2. Arlington");
		System.out.println("3. Fairfax");
		System.out.println("4. Falls Church");
		System.out.println("5. Washington D.C.");
		int x = input.nextInt();
		while(x < 1 || x > 5) {
			System.out.println("Choice is out of range, re-enter the number or type 0 to exit");
			x = input.nextInt();
			if (x == 0) {
				System.exit(0);
			}
		}
		return x;
	}

	public ArrayList<RealEstateListing> style(int styleType, ArrayList<Agency> agencyArray) {
		// *** ask each agency to give a list that satisfies the requested style.
//		System.out.println("1. Colonial");
//		System.out.println("2. Split Level");
//		System.out.println("3. Town House");
//		System.out.println("4. Condominium");
//		System.out.println("5. Cape Cod");
//		System.out.println("6. Georgian");
//		System.out.println("7. Rambler");
		ArrayList<RealEstateListing> tempListing = new ArrayList<RealEstateListing>();
		String choice = "";
		switch (styleType) {
		case 1:
			choice = "Colonial";
			break;
		case 2:
			choice = "Split Level";
			break;
		case 3:
			choice = "Town House";
			break;
		case 4:
			choice = "Condominium";
			break;
		case 5:
			choice = "Cape Cod";
			break;
		case 6:
			choice = "Georgian";
			break;
		case 7:
			choice = "Rambler";
			break;
		default:
			break;
		}
		for(Agency temp: agencyArray) {

			tempListing.addAll(temp.style(choice));
		}
		
		return tempListing;
	}

	// *** For each criteria there are similar pairs of methods.
	// *** Work on each pair one pair at a time and make them
	// *** work before you do the next pair.
	public ArrayList<RealEstateListing> bedRoom(int bedroom, ArrayList<Agency> agencyArray) {
		// *** ask each agency to give a list that satisfies the requested style.
		ArrayList<RealEstateListing> tempListing = new ArrayList<RealEstateListing>();
		
		for(Agency temp: agencyArray) {
			tempListing.addAll(temp.bedRoom(bedroom));
		}
		
		return tempListing;
	}
	public ArrayList<RealEstateListing> bathRoom(int bathroom, ArrayList<Agency> agencyArray) {
		// *** ask each agency to give a list that satisfies the requested style.
		ArrayList<RealEstateListing> tempListing = new ArrayList<RealEstateListing>();
//		System.out.println("Choose a number of bathrooms");
//		System.out.println("1. 1 ~ 1.5");
//		System.out.println("2. 2 ~ 2.5");
//		System.out.println("3. over 3");
		double min = 0;
		double max = 0;
		switch(bathroom) {
		
		case 1:
			min = 1;
			max = 1.5;
			break;
		case 2:
			min = 2;
			max = 2.5;
			break;
		case 3:
			min = 3;
			max = 99;
			break;
		default:
			break;
		}
		
		for(Agency temp: agencyArray) {
			tempListing.addAll(temp.bathRoom(min));
			tempListing.addAll(temp.bathRoom(max));
		}
		
		return tempListing;
	}
	public ArrayList<RealEstateListing> lotsize(int lotsize, ArrayList<Agency> agencyArray) {
		// *** ask each agency to give a list that satisfies the requested style.
		ArrayList<RealEstateListing> tempListing = new ArrayList<RealEstateListing>();
//		System.out.println("Choose a size of the lot");
//		System.out.println("1.  0 ~ 0.5");
//		System.out.println("2.  0.5 ~ 1");
//		System.out.println("3.  1.5 ~ 2");
//		System.out.println("4.  2 ~ 2.5");
//		System.out.println("5.  over 2.5");
		double min = 0, max = 0;
		switch(lotsize) {
		case 1:
			min = 0;
			max = .5;
			break;
		case 2:
			min = 0.5;
			max = 1;
			break;
		case 3:
			min = 1.5;
			max = 2;
			break;
		case 4:
			min = 2;
			max = 2.5;
			break;
		case 5:
			min = 2.5;
			max = 9999;
			
		}
		
		for(Agency temp: agencyArray) {
			tempListing.addAll(temp.lotSize(min));
			tempListing.addAll(temp.lotSize(max));
		}
		return tempListing;
	}
	public ArrayList<RealEstateListing> age(int age, ArrayList<Agency> agencyArray) {
		// *** ask each agency to give a list that satisfies the requested style.
		ArrayList<RealEstateListing> tempListing = new ArrayList<RealEstateListing>();
//		System.out.println("Choose a age of the house");
//		System.out.println("1. 1 ~ 5");
//		System.out.println("2. 6 ~ 10");
//		System.out.println("3. 11 ~ 15");
//		System.out.println("4. 16 ~ 20");
//		System.out.println("5. older than 21");
		
		int a = 0, b = a - 4, c = 20;
		
		switch (age) {
		case 1:
			a = 5;
			for(Agency temp: agencyArray) {
				while (b < a) {
					tempListing.addAll(temp.age(b));
					b++;
				}
			}
			break;
		case 2:
			a = 10;
			for(Agency temp: agencyArray) {
				while (b < a) {
					tempListing.addAll(temp.age(b));
					b++;
				}
			}
			break;
		case 3:
			a = 15;
			for(Agency temp: agencyArray) {
				while (b < a) {
					tempListing.addAll(temp.age(b));
					b++;
				}
			}
			break;
		case 4:
			a = 20;
			for(Agency temp: agencyArray) {
				while (b < a) {
					tempListing.addAll(temp.age(b));
					b++;
				}
			}
			break;
		case 5:
			a = 99;
			for(Agency temp: agencyArray) {
				while (c < a) {
					tempListing.addAll(temp.age(b));
					c++;
				}
			}
			c = 20;
			break;
		}
		
		return tempListing;
	}
	public ArrayList<RealEstateListing> price(int price, ArrayList<Agency> agencyArray) {
		// *** ask each agency to give a list that satisfies the requested style.
		ArrayList<RealEstateListing> tempListing = new ArrayList<RealEstateListing>();
//		("Choose a price range");
//		System.out.println("1. under $100,000");
//		System.out.println("2. $100,000 to $150,000");
//		System.out.println("3. $150,000 to $200,000");
//		System.out.println("4. $200,000 to $300,000");
//		System.out.println("5. $300,000 to $400,000");
//		System.out.println("6. Over $400,000");
		double min = 0, max = 0;
		switch (price) {
		case 1:
			min = 0;
			max = 100000;
			break;
		case 2:
			min = 100000;
			max = 150000;
			break;
		case 3:
			min = 150000;
			max = 200000;
			break;
		case 4:
			min = 200000;
			max = 300000;
			break;
		case 5:
			min = 300000;
			max = 400000;
			break;
		case 6:
			min = 400000;
			max = 99999999;
			break;
			
		}
		for(Agency temp : agencyArray) {
			tempListing.addAll(temp.priceMinMax(min, max));
		}
		
		return tempListing;
	}
	public ArrayList<RealEstateListing> distance(int distance, ArrayList<Agency> agencyArray) {
		// *** ask each agency to give a list that satisfies the requested style.
		ArrayList<RealEstateListing> tempListing = new ArrayList<RealEstateListing>();
//		System.out.println("Choose a disance from work");
//		System.out.println("1. 0 ~ 1 miles");
//		System.out.println("2. 1 ~ 5 miles");
//		System.out.println("3. 5 ~ 10 miles");
//		System.out.println("4. 10 ~ 15 miles");
//		System.out.println("5. over 15 miles");
		double min = 0, max = 0;
		switch(distance) {
		case 1:
			min = 0;
			max = 1;
			break;
		case 2:
			min = 1;
			max = 5;
			break;
		case 3:
			min = 5;
			max = 10;
			break;
		case 4:
			min = 10;
			max = 15;
			break;
		case 5:
			min = 15;
			max = 500;
			break;
		default:
			break;
		}
		for(Agency temp : agencyArray) {
			tempListing.addAll(temp.distanceMinMax(min, max));
		}
		
		return tempListing;
	}
	public ArrayList<RealEstateListing> area(int area, ArrayList<Agency> agencyArray) {
		// *** ask each agency to give a list that satisfies the requested style.
		ArrayList<RealEstateListing> tempListing = new ArrayList<RealEstateListing>();
//		System.out.println("Choose a Jurisdiction");
//		System.out.println("1. Alexandria");
//		System.out.println("2. Arlington");
//		System.out.println("3. Fairfax");
//		System.out.println("4. Falls Church");
//		System.out.println("5. Washington D.C.");
		String tempArea = "";
		switch (area) {
		case 1:
			tempArea = "Alexandria";
			break;
		case 2:
			tempArea = "Arlington";
			break;
		case 3:
			tempArea = "Fairfax";
			break;
		case 4:
			tempArea = "Falls Church";
			break;
		case 5:
			tempArea = "Washington D.C.";
			break;
		default:
			break;
		}
		for(Agency temp: agencyArray) {

			tempListing.addAll(temp.area(tempArea));
		}
		return tempListing;
	}
	
}


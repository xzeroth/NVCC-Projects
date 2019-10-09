import java.util.ArrayList;
import java.util.Scanner;

public class Agency {
	private String agency;
	private ArrayList<RealEstateListing> realEstateListingArray = new ArrayList<RealEstateListing>();

	public Agency(String agency, String agencyFile) {
		// *** Constructor reads its file into an ArrayList
		// *** don’t forget to close the Scanner
//*** Here is the code to read a file
		this.agency = agency;
		Scanner scanAgencyFile = TextFileIO.createTextRead(agencyFile);
		readFile(scanAgencyFile);
		scanAgencyFile.close();
		
	}

	public void readFile(Scanner read) {
		// *** The first number in the file is the number of listings.
		// *** This sets the for loop
		// *** A RealEstateListing can read itself.
		
		int iInput;
		
		iInput = read.nextInt();
		for(int i = 1; i <= iInput; i++) {
			RealEstateListing listing = new RealEstateListing();
			listing.readRealEstateListing(read);
			realEstateListingArray.add(listing);
		}
	}
		
	

	public ArrayList<RealEstateListing> style(String desiredStyle) {
		// *** Creates an ArrayList of for this criteria.
		// *** Each criteria creates a list.
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing : realEstateListingArray) {
			if (listing.getStyle().equalsIgnoreCase(desiredStyle)) {
				temp.add(listing);
			}
		}
		return temp;
		
	}
	
	public ArrayList<RealEstateListing> bedRoom(int rooms){
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing : realEstateListingArray) {
			if (listing.getBedRoom() == rooms) {
				temp.add(listing);
			}
		}
		return temp;
	}
	
	public ArrayList<RealEstateListing> bathRoom(double rooms){
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing : realEstateListingArray) {
			if(listing.getBathRoom() == rooms) {
				temp.add(listing);
			}
		}
		return temp;
	}
	
	public ArrayList<RealEstateListing> lotSize(double size){
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing : realEstateListingArray) {
			if(listing.getLotSize() == size) {
				temp.add(listing);
			}
		}
		return temp;
	}
	
	public ArrayList<RealEstateListing> age(int age){
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing : realEstateListingArray) {
			if(listing.getAge()== age) {
				temp.add(listing);
			}
		}
		return temp;
	}
	public ArrayList<RealEstateListing> priceMinMax(double min, double max){
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing: realEstateListingArray) {
			if(listing.getPrice() >= min && listing.getPrice() <= max) {
				temp.add(listing);
			}
		}
		return temp;
	}
	
	public ArrayList<RealEstateListing> price(double price){
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing : realEstateListingArray) {
			if(listing.getPrice() == price) {
				temp.add(listing);
			}
		}
		return temp;
	}
	
	public ArrayList<RealEstateListing> distanceMinMax(double min, double max){
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing: realEstateListingArray) {
			if(listing.getDistance() > min && listing.getDistance() < max) {
				temp.add(listing);
			}
		}
		return temp;
	}
	
	public ArrayList<RealEstateListing> distance(double distance){
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing : realEstateListingArray) {
			if(listing.getDistance() == distance) {
				temp.add(listing);
			}
		}
		return temp;
	}
	
	public ArrayList<RealEstateListing> area(String area){
		ArrayList<RealEstateListing> temp = new ArrayList<RealEstateListing>();
		for(RealEstateListing listing : realEstateListingArray) {
			if(listing.getArea().equalsIgnoreCase(area)) {
				temp.add(listing);
			}
		}
		return temp;
	}
}




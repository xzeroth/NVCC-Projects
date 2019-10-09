import java.util.Scanner;

public class RealEstateListing
{
	String style;
	int bedRoom;
	double bathRoom;
	double lotSize;
	int age;
	double price;
	double distance;
	String area;
	
       //*** instance variables go here.
	public RealEstateListing() {
		style = "";
		bedRoom = 0;
		bathRoom = 0;
		lotSize = 0;
		age = 0;
		price = 0;
		distance = 0;
		area = "";
	}
	
	public void readRealEstateListing(Scanner read)
	{
		String sInput;
		int iInput;
		double dInput;
		
		read.nextLine();
		read.nextLine();
		
		sInput = read.nextLine();
		this.setStyle(sInput);
		
		iInput = read.nextInt();
		this.setBedRoom(iInput);
		
		dInput = read.nextDouble();
		this.setBathRoom(dInput);
		
		dInput = read.nextDouble();
		this.setLotSize(dInput);
		
		iInput = read.nextInt();
		this.setAge(iInput);
		
		dInput = read.nextDouble();
		dInput = dInput * 1000;
		this.setPrice(dInput);
		
		
		dInput = read.nextDouble();
		this.setDistance(dInput);
		
		sInput = read.next();
		this.setArea(sInput);
		
		//*** Read a listing.
		//*** Set the instance variables. 		
	}
	//*** I have a complete set of getters and setters created by Eclipse
	
	public String toString()
	{
		return "\nStyle: " + getStyle() + "     Bedroom: " + getBedRoom() + "   Bathroom: " + getBathRoom() + "     LotSize: " + getLotSize() + " square acre\n"
				+ "age: " + getAge() + "     Price: " + getPrice() + "     Distance: " + getDistance() + "     Jurisdiction: " + getArea();
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String houseType) {
		this.style = houseType;
	}

	public int getBedRoom() {
		return bedRoom;
	}

	public void setBedRoom(int bedRoom) {
		this.bedRoom = bedRoom;
	}

	public double getBathRoom() {
		return bathRoom;
	}

	public void setBathRoom(double bathRoom) {
		this.bathRoom = bathRoom;
	}

	public double getLotSize() {
		return lotSize;
	}

	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}
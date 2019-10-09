import java.util.Scanner;

public class Temperature {
	
	Scanner input = new Scanner(System.in);
	double temp1;
	char scale;
	double temp2;
	
	public Temperature(double temp1, char scale) {
		this.temp1 = temp1;
		this.scale = scale;
	}
	

	public Temperature toCelsius() {
		
		Temperature y = new Temperature(temp1, scale);
		// F to C
		// c= 5 * (f - 32) / 9
		// k to c
		// c = k - 273
		this.scale = Character.toUpperCase(this.scale);
		
		switch (this.scale) {

		case 'F':
			this.temp1 = (5 * (this.temp1 - 32) / 9);
			this.scale = 'C';
			this.check();
			return y;
		case 'K':
			this.temp1 = temp1 - 273;
			this.scale = 'C';
			this.check();
			return y;
		case 'C':
			return y;
		default:
			return y;

		}
	}
	
	public void check() {
		Temperature y = new Temperature(temp1, scale);
		y.scale = Character.toUpperCase(y.scale);
		switch (y.scale) {
		case 'K':
			if (y.temp1 <= 0) {
				System.out.println("Temperature can't be under 0 K");
				System.exit(0);
			} else {
				break;
			}
			break;
		case 'C':
			if (y.temp1 <= -273.15) {
				System.out.println("Temperature can't be under -273.15 C");
				System.exit(0);
			} else {
				break;

			}
			break;
		case 'F':
			if (y.temp1 < -459.67) {
				System.out.println("Temperature can't be under -459.67 F");
				System.exit(0);
			} else {
				break;
			}
			break;
		default:
			System.out.println("Type in correct scale ex C, F, K ");
			System.exit(0);
		}

	}
	/*
	public void readInput() {
		System.out.println("Type in the temperature.");
		temp1 = input.nextDouble();
		System.out.println("Type in the scale.");
		scale = input.next().charAt(0);
	}*/
	
	public double getTemp() {
		return this.temp1;
	}
	

	public char getScale() {
		return this.scale;
	}
	
	public void set(double temp1, char scale) {
		
		this.temp1 = temp1;
		this.scale = scale;
	}
	
	public String toString() {
		return "" + this.temp1;
	}
}

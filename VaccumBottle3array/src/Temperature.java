import java.util.Scanner;

public class Temperature {

	Scanner userInput = new Scanner(System.in);

	double numTemperature;
	char scaleTemperature;
	int marbles;

	public Temperature() {
		this.numTemperature = 0;
		this.scaleTemperature = 'c';
		this.marbles = 0;
	}
	
	public Temperature(int marbles, double temp, char scale) {

		this.numTemperature = temp;
		this.scaleTemperature = scale;
		this.marbles = marbles;

	}
	
	public Temperature(double temp, char scale) {
		this.numTemperature = temp;
		this.scaleTemperature = scale;
	}

	public Temperature toCelsius() {

		Temperature y = new Temperature(numTemperature, scaleTemperature);
		// F to C
		// c= 5 * (f - 32) / 9
		// k to c
		// c = k - 273
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (scaleTemperature) {

		case 'F':
			y.numTemperature = (5 * (numTemperature - 32) / 9);
			y.scaleTemperature = 'C';
			y.check();
			return y;
		case 'K':
			y.numTemperature = numTemperature - 273;
			y.scaleTemperature = 'C';
			y.check();
			return y;
		case 'C':
			return y;
		default:
			return y;

		}

	}

	public Temperature toKelvin() {

		Temperature y = new Temperature(numTemperature, scaleTemperature);
		// f to k
		// k = (5 * (f - 32) / 9) + 273
		// c to k
		// k = c + 273
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (scaleTemperature) {

		case 'F':
			y.numTemperature = (5 * (numTemperature - 32) / 9) + 273;
			y.scaleTemperature = 'K';
			y.check();
			return y;
		case 'C':
			y.numTemperature = numTemperature + 273;
			y.scaleTemperature = 'K';
			return y;
		default:
			return y;
		}

	}

	public Temperature toFahrenheit() {
		Temperature y = new Temperature(numTemperature, scaleTemperature);
		// c to f
		// f = (9 * c / 5) + 32
		// k to f
		// f = (9 * (k - 273) / 5) + 32
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (scaleTemperature) {
		case 'C':
			y.numTemperature = (9 * numTemperature / 5) + 32;
			y.scaleTemperature = 'F';
			return y;
		case 'K':
			y.numTemperature = (9 * (numTemperature - 273) / 5) + 32;
			y.scaleTemperature = 'F';
			return y;
		default:
			return y;

		}
	}

	public Temperature add(Temperature x) {
		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (y.scaleTemperature) {
		case 'F':
			y.numTemperature = this.numTemperature + x.toFahrenheit().numTemperature;
			y.check();
			return y;

		case 'C':
			y.numTemperature = this.numTemperature + x.toCelsius().numTemperature;
			y.check();
			return y;
		case 'K':
			y.numTemperature = this.numTemperature + x.toKelvin().numTemperature;
			y.check();
			return y;
		default:
			return y;

		}

	}

	public Temperature add(int x) {
		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.numTemperature = this.numTemperature + x;
		y.check();
		return y;
	}

	public Temperature divide(int x) {
		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.numTemperature = this.numTemperature / Math.abs(x);
		y.check();
		return y;
	}

	public Temperature subtract(int x) {
		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.numTemperature = this.numTemperature - x;
		y.check();
		return y;
	}

	public Temperature multiply(int x) {
		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.numTemperature = this.numTemperature * Math.abs(x);
		y.check();
		return y;
	}

	public Temperature subtract(Temperature x) {
		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (y.scaleTemperature) {
		case 'F':
			y.numTemperature = this.numTemperature - x.toFahrenheit().numTemperature;
			y.check();
			return y;

		case 'C':
			y.numTemperature = this.numTemperature - x.toCelsius().numTemperature;
			y.check();
			return y;
		case 'K':
			y.numTemperature = this.numTemperature - x.toKelvin().numTemperature;
			y.check();
			return y;
		default:
			return y;
		}
	}

	public Temperature multiply(Temperature x) {
		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (y.scaleTemperature) {
		case 'F':
			y.numTemperature = this.numTemperature * x.toFahrenheit().numTemperature;
			y.check();
			return y;

		case 'C':
			y.numTemperature = this.numTemperature * x.toCelsius().numTemperature;
			y.check();
			return y;
		case 'K':
			y.numTemperature = this.numTemperature * x.toKelvin().numTemperature;
			y.check();
			return y;
		default:
			return y;

		}
	}

	public Temperature divide(Temperature x) {

		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (y.scaleTemperature) {
		case 'F':
			y.numTemperature = this.numTemperature / x.toFahrenheit().numTemperature;
			y.check();
			return y;

		case 'C':
			y.numTemperature = this.numTemperature / x.toCelsius().numTemperature;
			y.check();
			return y;
		case 'K':
			y.numTemperature = this.numTemperature / x.toKelvin().numTemperature;
			y.check();
			return y;
		default:
			return y;
		}
	}

	public boolean equals(Temperature x) {

		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (y.scaleTemperature) {
		case 'F':
			return this.numTemperature == x.toFahrenheit().numTemperature;
		case 'C':
			return this.numTemperature == x.toCelsius().numTemperature;
		case 'K':
			return this.numTemperature == x.toKelvin().numTemperature;
		default:
			return false;
		}

	}

	public boolean greaterThan(Temperature x) {

		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (y.scaleTemperature) {
		case 'F':
			return this.numTemperature > x.toFahrenheit().numTemperature;
		case 'C':
			return this.numTemperature > x.toCelsius().numTemperature;
		case 'K':
			return this.numTemperature > x.toKelvin().numTemperature;
		default:
			return false;
		}
	}

	public double get() {
		return this.numTemperature;
	}
	
	public double getTemperature() {
		return this.numTemperature;
	}
	
	public int getMarbles() {
		return this.marbles;
	}
	public char getScale() {
		return this.scaleTemperature;
	}

	public void read() {

		System.out.println("Please enter a temperature");
		this.numTemperature = userInput.nextDouble();
		System.out.println("Please enter a scale ex. C, F, K");
		this.scaleTemperature = userInput.next().toLowerCase().charAt(0);

	}

	public void check() {
		Temperature y = new Temperature(numTemperature, scaleTemperature);
		y.scaleTemperature = Character.toUpperCase(y.scaleTemperature);
		switch (y.scaleTemperature) {
		case 'K':
			if (y.numTemperature < 0) {
				System.out.println("Temperature can't be under 0 K");
				System.exit(0);
			} else {
				break;
			}
			break;
		case 'C':
			if (y.numTemperature < -273.15) {
				System.out.println("Temperature can't be under -273.15 C");
				System.exit(0);
			} else {
				break;

			}
			break;
		case 'F':
			if (y.numTemperature < -459.67) {
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

	public void set(double a, char b) {
		b = Character.toUpperCase(b);
		switch (b) {

		case 'K':
			if (a < 0) {
				System.out.println("Temperature can't be under 0 K");
				System.exit(0);
			} else {
				break;
			}
			break;
		case 'C':
			if (a < -273.15) {
				System.out.println("Temperature can't be under -273.15 C");
				System.exit(0);
			} else {
				break;

			}
			break;
		case 'F':
			if (a < -459.67) {
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
		this.numTemperature = a;
		this.scaleTemperature = b;
	}

	public String toString() {
		return "" + this.marbles + " " + this.numTemperature + " " + this.scaleTemperature;

	}

}

import java.util.Scanner;

public class Temperature {

	Scanner userInput = new Scanner(System.in);

	double temp;
	char scale;

	public Temperature() {
		this.temp = 0;
		this.scale = 'c';
	}
	
	public Temperature(double temp, char scale) {

		this.temp = temp;
		this.scale = scale;

	}

	public Temperature toCelsius() {

		Temperature y = new Temperature(temp, scale);
		// F to C
		// c= 5 * (f - 32) / 9
		// k to c
		// c = k - 273
		y.scale = Character.toUpperCase(y.scale);
		switch (scale) {

		case 'F':
			y.temp = (5 * (temp - 32) / 9);
			y.scale = 'C';
			y.check();
			return y;
		case 'K':
			y.temp = temp - 273;
			y.scale = 'C';
			y.check();
			return y;
		case 'C':
			return y;
		default:
			return y;

		}

	}

	public Temperature toKelvin() {

		Temperature y = new Temperature(temp, scale);
		// f to k
		// k = (5 * (f - 32) / 9) + 273
		// c to k
		// k = c + 273
		y.scale = Character.toUpperCase(y.scale);
		switch (scale) {

		case 'F':
			y.temp = (5 * (temp - 32) / 9) + 273;
			y.scale = 'K';
			y.check();
			return y;
		case 'C':
			y.temp = temp + 273;
			y.scale = 'K';
			return y;
		default:
			return y;
		}

	}

	public Temperature toFahrenheit() {
		Temperature y = new Temperature(temp, scale);
		// c to f
		// f = (9 * c / 5) + 32
		// k to f
		// f = (9 * (k - 273) / 5) + 32
		y.scale = Character.toUpperCase(y.scale);
		switch (scale) {
		case 'C':
			y.temp = (9 * temp / 5) + 32;
			y.scale = 'F';
			return y;
		case 'K':
			y.temp = (9 * (temp - 273) / 5) + 32;
			y.scale = 'F';
			return y;
		default:
			return y;

		}
	}

	public Temperature add(Temperature x) {
		Temperature y = new Temperature(temp, scale);
		y.scale = Character.toUpperCase(y.scale);
		switch (y.scale) {
		case 'F':
			y.temp = this.temp + x.toFahrenheit().temp;
			y.check();
			return y;

		case 'C':
			y.temp = this.temp + x.toCelsius().temp;
			y.check();
			return y;
		case 'K':
			y.temp = this.temp + x.toKelvin().temp;
			y.check();
			return y;
		default:
			return y;

		}

	}

	public Temperature add(int x) {
		Temperature y = new Temperature(temp, scale);
		y.temp = this.temp + x;
		y.check();
		return y;
	}

	public Temperature divide(int x) {
		Temperature y = new Temperature(temp, scale);
		y.temp = this.temp / Math.abs(x);
		y.check();
		return y;
	}

	public Temperature subtract(int x) {
		Temperature y = new Temperature(temp, scale);
		y.temp = this.temp - x;
		y.check();
		return y;
	}

	public Temperature multiply(int x) {
		Temperature y = new Temperature(temp, scale);
		y.temp = this.temp * Math.abs(x);
		y.check();
		return y;
	}

	public Temperature subtract(Temperature x) {
		Temperature y = new Temperature(temp, scale);
		y.scale = Character.toUpperCase(y.scale);
		switch (y.scale) {
		case 'F':
			y.temp = this.temp - x.toFahrenheit().temp;
			y.check();
			return y;

		case 'C':
			y.temp = this.temp - x.toCelsius().temp;
			y.check();
			return y;
		case 'K':
			y.temp = this.temp - x.toKelvin().temp;
			y.check();
			return y;
		default:
			return y;
		}
	}

	public Temperature multiply(Temperature x) {
		Temperature y = new Temperature(temp, scale);
		y.scale = Character.toUpperCase(y.scale);
		switch (y.scale) {
		case 'F':
			y.temp = this.temp * x.toFahrenheit().temp;
			y.check();
			return y;

		case 'C':
			y.temp = this.temp * x.toCelsius().temp;
			y.check();
			return y;
		case 'K':
			y.temp = this.temp * x.toKelvin().temp;
			y.check();
			return y;
		default:
			return y;

		}
	}

	public Temperature divide(Temperature x) {

		Temperature y = new Temperature(temp, scale);
		y.scale = Character.toUpperCase(y.scale);
		switch (y.scale) {
		case 'F':
			y.temp = this.temp / x.toFahrenheit().temp;
			y.check();
			return y;

		case 'C':
			y.temp = this.temp / x.toCelsius().temp;
			y.check();
			return y;
		case 'K':
			y.temp = this.temp / x.toKelvin().temp;
			y.check();
			return y;
		default:
			return y;
		}
	}

	public boolean equals(Temperature x) {

		Temperature y = new Temperature(temp, scale);
		y.scale = Character.toUpperCase(y.scale);
		switch (y.scale) {
		case 'F':
			return this.temp == x.toFahrenheit().temp;
		case 'C':
			return this.temp == x.toCelsius().temp;
		case 'K':
			return this.temp == x.toKelvin().temp;
		default:
			return false;
		}

	}

	public boolean greaterThan(Temperature x) {

		Temperature y = new Temperature(temp, scale);
		y.scale = Character.toUpperCase(y.scale);
		switch (y.scale) {
		case 'F':
			return this.temp > x.toFahrenheit().temp;
		case 'C':
			return this.temp > x.toCelsius().temp;
		case 'K':
			return this.temp > x.toKelvin().temp;
		default:
			return false;
		}
	}

	public double get() {
		return this.temp;
	}

	public void read() {

		System.out.println("Please enter a temperature");
		this.temp = userInput.nextDouble();
		System.out.println("Please enter a scale ex. C, F, K");
		this.scale = userInput.next().toLowerCase().charAt(0);

	}

	public void check() {
		Temperature y = new Temperature(temp, scale);
		y.scale = Character.toUpperCase(y.scale);
		switch (y.scale) {
		case 'K':
			if (y.temp < 0) {
				System.out.println("Temperature can't be under 0 K");
				System.exit(0);
			} else {
				break;
			}
			break;
		case 'C':
			if (y.temp < -273.15) {
				System.out.println("Temperature can't be under -273.15 C");
				System.exit(0);
			} else {
				break;

			}
			break;
		case 'F':
			if (y.temp < -459.67) {
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
		this.temp = a;
		this.scale = b;
	}

	public String toString() {
		return "" + this.temp;

	}

}

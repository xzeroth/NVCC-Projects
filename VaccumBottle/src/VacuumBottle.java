

public class VacuumBottle extends Bottle {

	int marbles;
	double temp;
	char scale;
	
	public VacuumBottle() {
		marbles = 0;
		temp = 0;
		scale = 'K';
	}
	
	public VacuumBottle(Bottle a, Temperature b) {
		Bottle partBottle = new Bottle();
		Temperature partTemperature = new Temperature();
	}
	
	public VacuumBottle(int marbles, double temp, char scale) {
		super.marbles = marbles;
		Temperature.temp = temp;
		this.marbles = marbles;
		this.temp = temp;
		this.scale = scale;
				
	}
	
	public void set(int marbles, double temp, char scale) {
		this.marbles = marbles;
		this.temp = temp;
		this.scale = scale;
	}
	
	public VacuumBottle divideBy(int x) {
		VacuumBottle ansBottle = new VacuumBottle();
		ansBottle.marbles = this.marbles / x;
		checkCountLimit();
		double y = x;
		char upperScale = Character.toUpperCase(this.scale);
		switch (upperScale) {
			case 'C' :
				ansBottle.marbles = this.marbles / x;
				ansBottle.temp = this.temp / y;
				ansBottle.checkCountLimit();
				ansBottle.checkTempLimit();
				break;
			case 'K' :
				ansBottle.marbles = this.marbles / x;
				ansBottle.temp = this.temp / ansBottle.temp;
				ansBottle.checkCountLimit();
				ansBottle.checkTempLimit();
				break;
			case 'F' :
				ansBottle.marbles = this.marbles / x;
				ansBottle.temp = this.temp / y;
				ansBottle.checkCountLimit();
				ansBottle.checkTempLimit();
				break;
		}
		ansBottle.scale = this.scale;
		return ansBottle;
	}
	
	public VacuumBottle multiply(VacuumBottle otherVaccumBottle) {
		VacuumBottle ansBottle = new VacuumBottle();
		ansBottle.marbles = this.marbles + otherVaccumBottle.marbles;
		checkCountLimit();
		char upperScale = Character.toUpperCase(this.scale);
		switch (upperScale) {
			case 'C' :
				ansBottle = otherVaccumBottle.toCelsius();
				ansBottle.marbles = this.marbles * ansBottle.marbles;
				ansBottle.temp = this.temp - ansBottle.temp;
				ansBottle.checkCountLimit();
				ansBottle.checkTempLimit();
				break;
			case 'K' :
				ansBottle = otherVaccumBottle.toKelvin();
				ansBottle.marbles = this.marbles * ansBottle.marbles;
				ansBottle.temp = this.temp - ansBottle.temp;
				ansBottle.checkCountLimit();
				ansBottle.checkTempLimit();
				break;
			case 'F' :
				ansBottle = otherVaccumBottle.toFahrenheit();
				ansBottle.marbles = this.marbles * ansBottle.marbles;
				ansBottle.temp = this.temp * ansBottle.temp;
				ansBottle.checkCountLimit();
				ansBottle.checkTempLimit();
				break;
		}
		return ansBottle;
	}
	
	public VacuumBottle subtract(VacuumBottle otherVaccumBottle) {
		VacuumBottle ansBottle = new VacuumBottle();
		ansBottle.marbles = this.marbles + otherVaccumBottle.marbles;
		checkCountLimit();
		char upperScale = Character.toUpperCase(this.scale);
		switch (upperScale) {
			case 'C' :
				ansBottle = otherVaccumBottle.toCelsius();
				ansBottle.marbles = this.marbles - ansBottle.marbles;
				ansBottle.temp = this.temp - ansBottle.temp;
				ansBottle.checkCountLimit();
				ansBottle.checkTempLimit();
				break;
			case 'K' :
				ansBottle = otherVaccumBottle.toKelvin();
				ansBottle.marbles = this.marbles - ansBottle.marbles;
				ansBottle.temp = this.temp - ansBottle.temp;
				ansBottle.checkCountLimit();
				ansBottle.checkTempLimit();
				break;
			case 'F' :
				ansBottle = otherVaccumBottle.toFahrenheit();
				ansBottle.marbles = this.marbles - ansBottle.marbles;
				ansBottle.temp = this.temp - ansBottle.temp;
				ansBottle.checkCountLimit();
				ansBottle.checkTempLimit();
				break;
		}
		return ansBottle;
	}
	
	public VacuumBottle add(VacuumBottle otherVaccumBottle) {
		VacuumBottle ansBottle = new VacuumBottle();
		ansBottle.marbles = this.marbles + otherVaccumBottle.marbles;
		checkCountLimit();
		char upperScale = Character.toUpperCase(this.scale);
		switch (upperScale) {
			case 'C' :
				ansBottle = otherVaccumBottle.toCelsius();
				ansBottle.marbles += this.marbles;
				ansBottle.temp += this.temp;
				break;
			case 'K' :
				ansBottle = otherVaccumBottle.toKelvin();
				ansBottle.marbles += this.marbles;
				ansBottle.temp += this.temp;
				break;
			case 'F' :
				ansBottle = otherVaccumBottle.toFahrenheit();
				ansBottle.marbles += this.marbles;
				ansBottle.temp += this.temp;
				break;
		}
		return ansBottle;
	}
	
	public boolean equals(VacuumBottle otherVaccumBottle) {
		if (this.marbles == otherVaccumBottle.marbles &&
			this.temp == otherVaccumBottle.scale &&
			this.scale == otherVaccumBottle.scale) {
			return true;
		}else {
			return false;
		}
	}
	
	public VacuumBottle toFahrenheit() {
		VacuumBottle ansBottle = new VacuumBottle(this.marbles, this.temp, this.scale);
		char upperScale = Character.toUpperCase(ansBottle.scale);
		switch(upperScale) {
			case 'C' :
				ansBottle.temp = (9 * temp / 5) + 32;
				ansBottle.scale = 'F';
				break;
				
			case 'K' :
				ansBottle.temp = (9 * (temp - 273) / 5) + 32;
				ansBottle.scale = 'F';
				ansBottle.checkTempLimit();
				break;
				
			default:
				break;
		}
		return ansBottle;
	}
	public VacuumBottle toCelsius() {
		VacuumBottle ansBottle = new VacuumBottle(this.marbles, this.temp, this.scale);
		char upperScale = Character.toUpperCase(ansBottle.scale);
		switch(upperScale) {
			case 'F' :
				ansBottle.temp = (5 * (temp - 32) / 9);
				ansBottle.scale = 'C';
				ansBottle.checkTempLimit();
				break;
				
			case 'K' :
				ansBottle.temp = temp - 273;
				ansBottle.scale = 'C';
				ansBottle.checkTempLimit();
				break;
				
			default:
				break;
		}
		return ansBottle;
	}
	
	public VacuumBottle toKelvin() {
		VacuumBottle ansBottle = new VacuumBottle(this.marbles, this.temp, this.scale);
		char upperScale = Character.toUpperCase(ansBottle.scale);
		switch(upperScale) {
			case 'C' :
				ansBottle.temp = temp + 273;
				ansBottle.scale = 'K';
				break;
				
			case 'F' :
				ansBottle.temp = (5 * (temp - 32) / 9) + 273;
				ansBottle.scale = 'K';
				ansBottle.checkTempLimit();
				break;
				
			default:
				break;
		}
		return ansBottle;
	}
	
	public void checkCountLimit() {
		if (this.marbles < 0) {
			System.exit(0);
		}
	}
	public void checkTempLimit() {
		char upperScale = Character.toUpperCase(this.scale);
		switch (upperScale) {
		case 'K':
			if (this.temp < 0) {
				System.out.println("Temperature can't be under 0 K");
				System.exit(0);
			} else {
				break;
			}
			break;
		case 'C':
			if (this.temp < -273.15) {
				System.out.println("Temperature can't be under -273.15 C");
				System.exit(0);
			} else {
				break;

			}
			break;
		case 'F':
			if (this.temp < -459.67) {
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
	public String toString() {
		return "" + this.marbles + " " + this.temp + " " + this.scale;

	}
}

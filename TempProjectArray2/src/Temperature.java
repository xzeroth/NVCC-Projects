import java.util.Scanner;

public class Temperature {

	double numTemperature;
	char scaleTemperature;

	public Temperature() {
		this.numTemperature = 0;
		this.scaleTemperature = 'K';
	}

	public Temperature(double temperature, char scale) {
		this.numTemperature = temperature;
		this.scaleTemperature = scale;
	}

	public char getScale() {
		return this.scaleTemperature;
	}

	public double getTemperature() {
		return this.numTemperature;
	}

	public Temperature toKelvin() {

		Temperature changeKelvin = new Temperature();
		// f to k
		// k = (5 * (f - 32) / 9) + 273
		// c to k
		// k = c + 273
		this.scaleTemperature = Character.toUpperCase(this.scaleTemperature);
		switch (scaleTemperature) {

		case 'F':
			changeKelvin.numTemperature = (5 * (this.numTemperature - 32) / 9) + 273;
			changeKelvin.scaleTemperature = 'K';
			return changeKelvin;
		case 'C':
			changeKelvin.numTemperature = this.numTemperature + 273;
			changeKelvin.scaleTemperature = 'K';
			return changeKelvin;
		case 'K':
			changeKelvin.numTemperature = this.numTemperature;
			changeKelvin.scaleTemperature = this.scaleTemperature;
			return changeKelvin;
		default:
			return changeKelvin;
		}

	}

	public String toString() {
		return "" + this.numTemperature;
	}

}

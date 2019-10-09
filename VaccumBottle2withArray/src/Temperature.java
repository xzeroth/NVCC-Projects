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

	public Temperature[] createArrayWithLargestValues(Temperature[] largest, Temperature[] temperatureArrayTwo,
			Temperature[] temperatureArrayThree) {
//Find largest of the combined array.

		Temperature[] answerArray = new Temperature[largest.length];
		for (int index = 0; index < largest.length; index++) {
			answerArray[index] = largest[index];
		}

		for (int index = 0; index < temperatureArrayTwo.length; index++) {
			if (largest[index].toKelvin().getTemperature() > temperatureArrayTwo[index].toKelvin().getTemperature()) {
				answerArray[index] = largest[index];
			} else {
				answerArray[index] = temperatureArrayTwo[index];
			}
		}
		for (int index = 0; index < temperatureArrayThree.length; index++) {
			if (largest[index].toKelvin().getTemperature() > temperatureArrayThree[index].toKelvin().getTemperature()) {
				answerArray[index] = largest[index];
			} else {
				answerArray[index] = temperatureArrayThree[index];
			}
		}
		return answerArray;
	}

	public Temperature[] getLargestArray(Temperature[] temperatureArrayOne, Temperature[] temperatureArrayTwo,
			Temperature[] temperatureArrayThree) {
//Get the largest array length.
		Temperature[] xLargest = temperatureArrayOne;

		if (temperatureArrayOne.length > temperatureArrayTwo.length
				&& temperatureArrayOne.length > temperatureArrayThree.length) {
			xLargest = temperatureArrayOne;
		} else if (temperatureArrayTwo.length > temperatureArrayOne.length
				&& temperatureArrayTwo.length > temperatureArrayThree.length) {
			xLargest = temperatureArrayTwo;
		} else if (temperatureArrayThree.length > temperatureArrayOne.length
				&& temperatureArrayThree.length > temperatureArrayTwo.length) {
			xLargest = temperatureArrayThree;
		}
		return xLargest;

	}

	public Temperature getAverage(Temperature[] temperatureArray) {
// returns the average of the temperatures within a array.
		Temperature calcAverage = new Temperature();
		double sumTemperature = 0;

		for (int index = 0; index < temperatureArray.length; index++) {
			sumTemperature = temperatureArray[index].toKelvin().numTemperature + sumTemperature;
		}
		sumTemperature = sumTemperature / temperatureArray.length;
		calcAverage.scaleTemperature = 'K';
		calcAverage.numTemperature = sumTemperature;
		char trueScale = Character.toLowerCase(temperatureArray[0].scaleTemperature);

		switch (trueScale) {

		case 'f':
			calcAverage.numTemperature = (9 * (sumTemperature - 273) / 5) + 32;
			calcAverage.scaleTemperature = 'F';
			if (calcAverage.numTemperature < -459) {
				System.out.println("F temperature can't go below -459 degrees.");
				System.exit(0);
			}
			return calcAverage;
		case 'c':
			calcAverage.numTemperature = sumTemperature - 273;
			calcAverage.scaleTemperature = 'C';
			if (calcAverage.numTemperature < -273) {
				System.out.println("C temperature can't go below -273 degrees.");
				System.exit(0);
			}
			return calcAverage;
		default:
			return calcAverage;

		}
	}

	public void printTemperatureArray(Temperature[] temperatureArray) {
//Prints out each elements(objects) in an array.
		for (int index = 0; index < temperatureArray.length; index++) {
			System.out.println(temperatureArray[index].getTemperature() + " " + temperatureArray[index].getScale());

		}

	}

	public void readTemperatureArray() {
//Read in the temperature in to an Array.
		System.out.println("Type in " + temperatureArray.length + " temperatures.");
		Scanner input = new Scanner(System.in);
		for (int index = 0; index < temperatureArray.length; index++) {

			double tempTemperature = input.nextDouble();
			char tempScale = input.next().toUpperCase().charAt(0);
			temperatureArray[index] = new Temperature(tempTemperature, tempScale);

		}

	}

	public int getRandomArraySize() {
//Produce random number from 1 to 3.

		return (int) (Math.random() * 3 + 1);
	}

	public String toString() {
		return "" + this.numTemperature;
	}

}

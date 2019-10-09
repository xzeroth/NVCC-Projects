import java.util.Scanner;

public class TemperatureDemoWithArrays
{
	public static void main(String[] args)
	{
		int x;
		Temperature average;
		System.out.println("You will be asked to fill 3 randomly sized arrays.");
		Temperature[] temperatureArrayOne;
		Temperature[] temperatureArrayTwo;
		Temperature[] temperatureArrayThree;

		temperatureArrayOne = new Temperature[getRandomArraySize()];
		readTemperatureArray(temperatureArrayOne);
		System.out.println("The values of temperature array one are ");
		printTemperatureArray(temperatureArrayOne);
		average = getAverage(temperatureArrayOne);
		System.out.println("The average of temperature array one is " + average);

		temperatureArrayTwo = new Temperature[getRandomArraySize()];
		readTemperatureArray(temperatureArrayTwo);
		System.out.println("The values of temperature array two are ");
		printTemperatureArray(temperatureArrayTwo);
		average = getAverage(temperatureArrayTwo);
		System.out.println("The average of temperature array two is " + average);

		temperatureArrayThree = new Temperature[getRandomArraySize()];
		readTemperatureArray(temperatureArrayThree);
		System.out.println("The values of temperature array three are ");
		printTemperatureArray(temperatureArrayThree);
		average = getAverage(temperatureArrayThree);
		System.out.println("The average of temperature array three is " + average);

		Temperature[] largest = getLargestArray(temperatureArrayOne, temperatureArrayTwo,
				temperatureArrayThree);
		Temperature[] arrayWithLargestValues1;
		if(temperatureArrayOne == largest)
			arrayWithLargestValues1 = createArrayWithLargestValues(largest,
					temperatureArrayTwo, temperatureArrayThree);
		else if(temperatureArrayTwo == largest)
			arrayWithLargestValues1 = createArrayWithLargestValues(largest,
					temperatureArrayOne, temperatureArrayThree);
		else// fractionArrayThree is largest
			arrayWithLargestValues1 = createArrayWithLargestValues(largest,
					temperatureArrayOne, temperatureArrayTwo);
		System.out.println("\nHere are the temperatures in the three arrays:");
		printTemperatureArray(temperatureArrayOne);
		printTemperatureArray(temperatureArrayTwo);
		printTemperatureArray(temperatureArrayThree);
		System.out.println("\nAn array with the largest values taken from the\n"+
				"3 arrays has " + arrayWithLargestValues1.length + " elements.");
		System.out.println("This new solution for the largest array of the three arrays:");
		printTemperatureArray(arrayWithLargestValues1);
		/*
CODE THAT FOLLOWS IS A DIFFERENT ALGORITH THAT ALSO FINDS THE LARGEST ARRAY
		int sizeOfLargestArray = getSizezOfLargestArray(temperatureArrayOne, temperatureArrayTwo,
				temperatureArrayThree);
		Temperature[] arrayWithLargestValues = createArrayWithLargestValues(sizeOfLargestArray, 
				temperatureArrayOne,temperatureArrayTwo, temperatureArrayThree);
		System.out.println("\nAn array with the largest values taken from the\n"+
				"3 arrays has " + arrayWithLargestValues.length + " elements.");
		System.out.println("This solution knew the largest size of the three arrays:");
		printTemperatureArray(arrayWithLargestValues);
*/
	}


	private static Temperature[] createArrayWithLargestValues(Temperature[] largest, 
															  Temperature[] temperatureArrayTwo,
															  Temperature[] temperatureArrayThree) {
		//Find largest of the combined array.
		
		Temperature[] answerArray = new Temperature[largest.length];
		for (int index = 0 ; index < largest.length ; index++) {
			answerArray[index] = largest[index];
		}
			
		for (int index = 0 ; index < temperatureArrayTwo.length ; index++) {
			if (largest[index].toKelvin().getTemperature() > temperatureArrayTwo[index].toKelvin().getTemperature()) {
				answerArray[index] = largest[index];
			}else {
				answerArray[index] = temperatureArrayTwo[index];
				}
		}
		for (int index = 0 ; index < temperatureArrayThree.length ; index++) {
			if (largest[index].toKelvin().getTemperature() > temperatureArrayThree[index].toKelvin().getTemperature()) {
				answerArray[index] = largest[index];
			}else {
				answerArray[index] = temperatureArrayThree[index];
			}	
		}	
		return answerArray;
	}


	private static Temperature[] getLargestArray(Temperature[] temperatureArrayOne, 
												 Temperature[] temperatureArrayTwo,
												 Temperature[] temperatureArrayThree) {
		//Get the largest array length.
		Temperature[] xLargest = temperatureArrayOne;
				
		if (temperatureArrayOne.length > temperatureArrayTwo.length &&
			temperatureArrayOne.length > temperatureArrayThree.length) {
			xLargest = temperatureArrayOne;
		}else if (temperatureArrayTwo.length > temperatureArrayOne.length &&
				  temperatureArrayTwo.length > temperatureArrayThree.length) {
			xLargest = temperatureArrayTwo;
		}else if (temperatureArrayThree.length > temperatureArrayOne.length &&
				  temperatureArrayThree.length > temperatureArrayTwo.length) {
			xLargest = temperatureArrayThree;
		}
		return xLargest;
	
	}


	private static Temperature getAverage(Temperature[] temperatureArray) {
		// returns the average of the temperatures within a array.
		Temperature calcAverage = new Temperature();
		double sumTemperature = 0;
		
		for (int index = 0 ; index < temperatureArray.length ; index ++) {
			sumTemperature = temperatureArray[index].toKelvin().numTemperature
										+ sumTemperature;
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


	private static void printTemperatureArray(Temperature[] temperatureArray) {
		//Prints out each elements(objects) in an array.
		for (int index = 0; index < temperatureArray.length; index++) {
			System.out.println(temperatureArray[index].getTemperature() + " " 
							 + temperatureArray[index].getScale());
		
		}
		
	}



	private static void readTemperatureArray(Temperature[] temperatureArray) {
		//Read in the temperature in to an Array.
		System.out.println("Type in " + temperatureArray.length + " temperatures.");
		Scanner input = new Scanner(System.in);
		for (int index = 0; index < temperatureArray.length ; index++) {
						
			double tempTemperature = input.nextDouble();
			char tempScale = input.next().toUpperCase().charAt(0);
			temperatureArray[index] = new Temperature(tempTemperature, tempScale);
			
		}
		
		
	}
		
	
	private static int getRandomArraySize() {
		//Produce random number from 1 to 3.
		
		return (int)(Math.random() * 3 + 1);
	}
	
}//main
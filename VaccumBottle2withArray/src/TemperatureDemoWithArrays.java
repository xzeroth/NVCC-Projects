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
		temperatureArrayOne.readTemperatureArray();
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


	public static int getRandomArraySize() {
		//Produce random number from 1 to 3.

				return (int) (Math.random() * 3 + 1);
			}
	
}//main
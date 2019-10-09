import java.util.Scanner;


public class TemperatureDemoWithArrays
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		int x;
		Temperature average;
		System.out.println("You will be asked to fill 3 randomly sized arrays.");
		Temperature[] temperatureArrayOne;
		Temperature[] temperatureArrayTwo;
		Temperature[] temperatureArrayThree;
//getRandomArraySize()
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
		System.out.println(" ");
	
		
		
		//Start from here
		Temperature[] arrayWithLargestValues1;
				
		if(temperatureArrayOne == largest) {
			arrayWithLargestValues1 = createArrayWithLargestValues(largest,
					temperatureArrayTwo, temperatureArrayThree);}
		else if(temperatureArrayTwo == largest) {
			arrayWithLargestValues1 = createArrayWithLargestValues(largest,
					temperatureArrayOne, temperatureArrayThree);}
		else{// fractionArrayThree is largest
			arrayWithLargestValues1 = createArrayWithLargestValues(largest,
					temperatureArrayOne, temperatureArrayTwo);}
		
		System.out.println("\nHere are the temperatures in the three arrays:");
		System.out.println(" ");
		printTemperatureArray(temperatureArrayOne);
		printTemperatureArray(temperatureArrayTwo);
		printTemperatureArray(temperatureArrayThree);
		System.out.println("\nAn array with the largest values taken from the\n"+
				"3 arrays has " + arrayWithLargestValues1.length + " elements.");
		System.out.println("This solution knew the largest array of the three arrays:");
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
															  Temperature[] a,
															  Temperature[] b) {
		Temperature[] q;
		q = new Temperature[largest.length];
		
		Temperature[] largest1;
		Temperature[] a1;
		Temperature[] b1;
		Temperature[] q1;
		
		largest1 = new Temperature[largest.length];
		a1 = new Temperature[a.length];
		b1 = new Temperature[b.length];
		q1 = new Temperature[q.length];
		
		//convert whole array to 'toCelsius'
		for (int index = 0; index < largest.length; index++) {
			largest1[index] = largest[index];
			largest1[index].toCelsius();
		}
		for (int index = 0; index < a.length; index++) {
			a1[index] = a[index];
			a1[index].toCelsius();
		}
		for (int index = 0; index < b.length; index++) {
			b1[index] = b[index];
			b1[index].toCelsius();
		}
		for (int index = 0; index < largest.length; index++) {
			q[index] = largest[index];
		}
	
		
		
		
		
		
		//comparing 'largest' and the array 'a'
		for (int index = 0; index < a.length; index++) {
			if(toCelsiusTemp(largest1[index]) < toCelsiusTemp(a1[index])) {
				q[index] = a[index];
			}else {
				q[index] = largest[index];
			}
		}
		
		//converting q index in to celsius and copying it in q1
		for (int index = 0; index < q1.length; index++) {
			q1[index] = q[index];
		}
		
		//comparing 'q' and the array 'b'
		for (int index = 0; index < b.length; index++) {
			if(toCelsiusTemp(q1[index]) < toCelsiusTemp(b1[index])) {
				q[index] = b[index];
			}else {
				q[index] = q[index];
			}
		}
		
		return q;
	}

	private static Temperature[] getLargestArray(Temperature[] a, 
												 Temperature[] b,
												 Temperature[] c) {
			
		if (a.length < b.length) {
			
			if (b.length < c.length) {
				return c;
			}
			return b;
		}
		else if (a.length < c.length) {
			return c;
			}
		else {
			return a;
		}
			
	}
	
	private static double toCelsiusTemp(Temperature y) {
		y.scale = Character.toUpperCase(y.scale);
		switch (y.scale) {

		case 'F':
			y.temp1 = (5 * (y.temp1 - 32) / 9);
			y.check();
			return y.temp1;
		case 'K':
			y.temp1 = y.temp1 - 273;
			y.check();
			return y.temp1;
		case 'C':
			return y.temp1;
		default:
			return y.temp1;
	}
	}
	private static void printTemperatureArray(Temperature[]y) {
		
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i].getTemp() + " " + y[i].getScale());
		}
		
	}


	private static void readTemperatureArray(Temperature[]y)
	{
		System.out.println("This array has " + y.length + " elements.");
		
		for(int x = 0; x < y.length; x++)
		{
			System.out.println("Enter a temperature followed by scale for slot " + (x+1));
			double q = input.nextDouble();
			char w = input.next().charAt(0);
			y[x] = new Temperature(q, w);
			y[x].check();
		}
	}
	
	private static Temperature getAverage(Temperature[]y) {
		Temperature k = new Temperature(0, 'c');
		
		double sum = 0;
		for (int i = 0; i < y.length; i++) {
			y[i].toCelsius();
			sum = y[i].temp1 + sum;
			
		}
		double ave = sum / y.length;
		k.set(ave, 'c');
		return k;
	}
	
		
	

	private static int getRandomArraySize() {
		
		return (int)(Math.random() * 3 + 1);
	}//main
	
}

import java.util.Scanner;
// test driver for the Bottle class
public class BottleDemo3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x;
		Bottle bottle1 = new Bottle();
		Bottle bottle2 = new Bottle();
		Bottle bottle3 = new Bottle();
		Bottle bottle4 = new Bottle();
		Bottle bottle5 = new Bottle();
		System.out.println("please enter a number for bottle1:");
		bottle1.read();
		System.out.println("Bottle1 is this value " + bottle1 + ".\n");
		System.out.println("Please enter a number for bottle2:");
		bottle2.read();
		
		
		bottle3 = bottle2.add(bottle1);
		System.out.println("The sum of bottle2 and bottle1 is: " + bottle3 + ".\n");
		
		
		bottle4 = bottle3.divide(2);
		System.out.println("The 2 bottle average is: " + bottle4 + ".");
		
		
		System.out.print("Subtracting bottle1 from bottle2 is: " );
		bottle3 = bottle2.subtract(bottle1);
		System.out.println( bottle3);
		
		
		bottle3 = bottle2.divide(bottle1);
		System.out.println("Dividing bottle2 with bottle1 is: " + bottle3.get() + ".");
		
		
		
		if (bottle1.equals(bottle2))
		{
			System.out.println("Bottle1 and bottle2 are equal.");
		}
		else
		{
			System.out.println("Bottle1 and bottle2 are not equal.");
		}
		
		
		System.out.println("Bottle4 is now given the value of 10 with the set() method.");
		bottle4.set(10);
		System.out.println("The value of bottle4 is " + bottle4 + ".");
		
		
		System.out.println("Bottle4 is now multipled with bottle1.  The value is placed in " +
				"bottle5.");
		bottle5 = bottle1.multiply(bottle4);
		System.out.println("The value of bottle5 is " + bottle5 + ".");
		
		
		System.out.println("\nEnter an integer to add to the value bottle1 has.");
		System.out.println("The sum will be put in bottle3.");
		x = scan.nextInt();
		
		
		bottle3 = bottle1.add(x);
		System.out.println("Adding your number " + x +
			" to bottle1 gives a new Bottle with " + bottle3 + " in it.");
		
		
		System.out.print("Adding the number " + bottle2 + " which is the number" +
				" in bottle2 to the\nnumber in ");
		bottle2 = bottle1.add(bottle2);
		System.out.println("bottle1 which is " + bottle1 +" gives " + bottle2 + ".");
		bottle2.set(bottle2);
		
	}
}

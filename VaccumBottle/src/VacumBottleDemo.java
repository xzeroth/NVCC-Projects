import java.util.Scanner;
public class VacumBottleDemo
{	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int x = 5;
		VacuumBottle vBottle1 = new VacuumBottle(4, 120.0, 'C');
		VacuumBottle vBottle2 = new VacuumBottle(3, 50, 'C');
		VacuumBottle vBottle3 = new VacuumBottle(27, 50.0, 'C');
		VacuumBottle vBottle4 = new VacuumBottle(12, 232.0, 'K');
		System.out.println("vBottle1 is " + vBottle1);
		// a new method toKelvin() needs to be written in VacuumBottle class
		vBottle1 = vBottle2.toKelvin();
		System.out.println("vBottle2 to Kalvin is " + vBottle1);
		vBottle1.set(100,100, 'c');
		vBottle3.set(100, 212, 'F');
		System.out.println("Vacuum Bottle vBottle1 has " + vBottle1 );
		System.out.println("Vacuum Bottle vBottle3 has " + vBottle3 );
		if (vBottle1.equals(vBottle3))
		{
			System.out.println("These two Vacuum Bottles are equal");
		}
		else
		{
			System.out.println("These two Vacuum Bottles are not equal");
		}
		vBottle3 = vBottle1.add(vBottle2);
		System.out.println("vBottle1 is " + vBottle1);
		System.out.println("vBottle2 is " + vBottle2);
		System.out.println("sum of vBottle1 plus vBottle2 is " + vBottle3);
		vBottle3 = vBottle1.subtract(vBottle2);
		System.out.println("vBottle1 is " + vBottle1);
		System.out.println("vBottle2 is " + vBottle2);
		System.out.println("vBottle1 minus vBottle2 is " + vBottle3);
		vBottle3 = vBottle1.multiply(vBottle2);
		System.out.println("vBottle1 is " + vBottle1);
		System.out.println("vBottle2 is " + vBottle2);
		System.out.println("vBottle1 times vBottle2 is " + vBottle3);
		vBottle3 = vBottle1.divideBy(x);
		System.out.println("vBottle1 is " + vBottle1);
		System.out.println("vBottle1 divided by " + x + " is " + vBottle3);
		
	}
}
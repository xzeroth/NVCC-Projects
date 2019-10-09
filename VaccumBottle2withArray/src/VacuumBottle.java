
public class VacuumBottle extends Bottle {

	// Bottle partBottle = new Bottle();
	Temperature partTemperature = new Temperature();

	public VacuumBottle(Bottle a, Temperature b) {
		super.set(a);
		this.partTemperature.set(b.get(), b.getScale());
	}

	public VacuumBottle(int marbles, double temp, char scale) {
		super.set(marbles);
		partTemperature.set(temp, scale);

	}

	public VacuumBottle() {
		super.set(0);
		partTemperature.set(0, 'k');
	}

	public VacuumBottle toKelvin() {
		Bottle kelvinBottle = new Bottle();
		kelvinBottle.set(super.get());

		Temperature kelvinTemp = new Temperature();
		kelvinTemp = this.partTemperature.toKelvin();

		VacuumBottle changeKelvin = new VacuumBottle(kelvinBottle, kelvinTemp);
		return changeKelvin;
	}

	public void set(int marbles, double temp, char scale) {
		super.set(marbles);
		this.partTemperature.set(temp, scale);
	}

	private Temperature[] createArrayWithLargestValues(Temperature[] largest, Temperature[] temperatureArrayTwo,
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

	public VacuumBottle add(VacuumBottle otherBottle) {
//		Bottle addBottle = new Bottle();
//		addBottle = super.add(otherBottle.get());

//		Temperature addTemperature = new Temperature();
//		addTemperature = this.partTemperature.add(otherBottle.partTemperature);

		VacuumBottle addVBottle = new VacuumBottle();
		addVBottle.partTemperature = this.partTemperature.add(otherBottle.partTemperature);
		addVBottle.set(super.add(otherBottle.get()));

		return addVBottle;

	}

	public VacuumBottle subtract(VacuumBottle otherBottle) {
		Bottle subBottle = new Bottle();
		subBottle = super.subtract(otherBottle.get());

		Temperature subTemperature = new Temperature();
		subTemperature = this.partTemperature.subtract(otherBottle.partTemperature);

		VacuumBottle subVBottle = new VacuumBottle(subBottle, subTemperature);

		return subVBottle;
	}

	public VacuumBottle multiply(VacuumBottle otherBottle) {
		Bottle mulBottle = new Bottle();
		mulBottle = super.multiply(otherBottle.get());

		Temperature mulTemperature = new Temperature();
		mulTemperature = this.partTemperature.multiply(otherBottle.partTemperature);

		VacuumBottle mulVBottle = new VacuumBottle(mulBottle, mulTemperature);

		return mulVBottle;
	}

	public VacuumBottle divideBy(int number) {
		Bottle divBottle = new Bottle();
		divBottle = super.divide(number);

		Temperature divTemperature = new Temperature();
		divTemperature = this.partTemperature.divide(number);

		VacuumBottle divVBottle = new VacuumBottle(divBottle, divTemperature);

		return divVBottle;
	}

	public boolean equals(VacuumBottle otherBottle) {
		if (super.equals(otherBottle) && this.partTemperature.equals(otherBottle.partTemperature)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "" + super.get() + " " + this.partTemperature.get() + " " + this.partTemperature.getScale();

	}

}


public class calculation {

	double c5, c4, c3, c2, c1, c0;
	final double check = .01;

	public calculation() {
		c5 = 0;
		c4 = 0;
		c3 = 0;
		c2 = 0;
		c1 = 1;
		c0 = 0;
	}

	public boolean trigger(double x) {
		double tempA, tempB;
		tempA = func(x - .1);
		tempB = func(x);
		if((tempA * tempB) < 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public double func(double x) {
		return c5 * x * x * x * x * x + c4 * x * x * x * x + c3 * x * x * x + c2 * x * x + c1 * x + c0;
	}


	
	public double bisectionD(double a, double b) {
		double c = a;
		while ((b - a) >= check) {
			
			c = (a + b) / 2;

			
			if (func(c) == 0.0)
				break;

			
			else if (func(c) * func(a) < 0)
				b = c;
			else
				a = c;
		}
		
		return c;
	}
	
	public void bisectionV(double a, double b) {
		double c = a;
		while ((b - a) >= check) {
			
			c = (a + b) / 2;

			
			if (func(c) == 0.0)
				break;

			
			else if (func(c) * func(a) < 0)
				b = c;
			else
				a = c;
		}
		
		System.out.printf("The value of root is : %.4f\n", c);
	}

	public double getC5() {
		return c5;
	}

	public void setC5(double c5) {
		this.c5 = c5;
	}

	public double getC4() {
		return c4;
	}

	public void setC4(double c4) {
		this.c4 = c4;
	}

	public double getC3() {
		return c3;
	}

	public void setC3(double c3) {
		this.c3 = c3;
	}

	public double getC2() {
		return c2;
	}

	public void setC2(double c2) {
		this.c2 = c2;
	}

	public double getC1() {
		return c1;
	}

	public void setC1(double c1) {
		this.c1 = c1;
	}

	public double getC0() {
		return c0;
	}

	public void setC0(double c0) {
		this.c0 = c0;
	}

}

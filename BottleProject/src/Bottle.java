import java.util.Scanner;

public class Bottle {
	
	Scanner input = new Scanner(System.in);

	int marbles;
	static final int max = 300;
	static final int min = 0;
	
	public void read() {
		int x = input.nextInt();
		
		while (x < min || x > max) {
			
			System.out.println("Number of marbles are out of range.");
			System.out.println("Please enter number of marbles again.");
			x = input.nextInt();
			
		}
		this.marbles = x;
		
		
	}
	
	public int get() {
		return marbles;
		
	}
	
	public void set(Bottle x) {
		if (max > x.marbles && x.marbles > min) {
			this.marbles = x.marbles;
		} else {
			System.out.println("Number of marbles are out of range.");
			System.exit(0);
		}
		
		
	}
	
	public void set(int x) {
		
		if (max > x && x > min) {
			this.marbles = x;
		} else {
			System.out.println("Number of marbles are out of range.");
			System.exit(0);
		}
				
	}
	
	public Bottle add(Bottle x) {
		Bottle y = new Bottle();
		if (max < (this.marbles + x.marbles) || (this.marbles + x.marbles) < min) {
			System.out.println("Number of marbles are out of range. ");
			System.exit(0);
		} else {
		y.marbles = this.marbles + x.marbles;
		}
		return y;
			
	}
	
	public Bottle add(int x) {
		Bottle y = new Bottle();
		
		if (max < x || x < min) {
			System.out.println("Number of marbles are out of range.");
			System.exit(0);
		}
		if (max < (this.marbles + x) || (this.marbles + x) < min) {
			System.out.println("Number of marbles are out of range. ");
			System.exit(0);
		} else {
		y.marbles = this.marbles + x;
		}
		return y;
	}
	
	public Bottle divide(Bottle x) {
		Bottle y = new Bottle();
		if (max < (this.marbles / x.marbles) || (this.marbles / x.marbles) < min) {
			System.out.println("Number of marbles are out of range. ");
			System.exit(0);
		} else {
		y.marbles = this.marbles / x.marbles;
		}
		return y;
		
		
	}
	
	public Bottle divide(int x) {
		Bottle y = new Bottle();
		
		if (max < x || x < min) {
			System.out.println("Number of marbles are out of range.");
			System.exit(0);
		}
		if (max < (this.marbles / x) || (this.marbles / x) < min) {
			System.out.println("Number of marbles are out of range. ");
			System.exit(0);
		} else {
		y.marbles = this.marbles / x;
		}
		return y;
		
	}
	
	public Bottle multiply(Bottle x) {
		Bottle y = new Bottle();
		if (max < (this.marbles * x.marbles) || (this.marbles * x.marbles) < min) {
			System.out.println("Number of marbles are out of range. ");
			System.exit(0);
		} else {
		y.marbles = this.marbles * x.marbles;
		}
		return y;
		
	}
	
	public Bottle multiply(int x) {
		Bottle y = new Bottle();
		
		if (max < x || x < min) {
			System.out.println("Number of marbles are out of range.");
			System.exit(0);
		}
		if (max < (this.marbles * x) || (this.marbles * x) < min) {
			System.out.println("Number of marbles are out of range. ");
			System.exit(0);
		} else {
		y.marbles = this.marbles * x;
		}
		return y;
		
	}
	
	public Bottle subtract(Bottle x) {
		Bottle y = new Bottle();
		
		if (max < (this.marbles - x.marbles) || (this.marbles - x.marbles) < min) {
			System.out.println("Number of marbles are out of range. ");
			System.exit(0);
		} else {
		y.marbles = this.marbles - x.marbles;
		}
		return y;
		
	}
	
	public Bottle subtract(int x) {
		Bottle y = new Bottle();
		
		if (max < x || x < min) {
			System.out.println("Number of marbles are out of range.");
			System.exit(0);
		}
		if (max < (this.marbles - x) || (this.marbles - x) < min) {
			System.out.println("Number of marbles are out of range. ");
			System.exit(0);
		} else {
		y.marbles = this.marbles - x;
		}
		return y;
		
	}
	
	public boolean equals(Bottle x) {
		return this.marbles == x.marbles;
		
	}
	
	public String toString() {
		
		return "" + this.marbles;
	}
	
	
}






















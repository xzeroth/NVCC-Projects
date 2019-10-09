
public class BottleVoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bottle xbottle1 = new Bottle();
		Bottle xbottle2 = new Bottle();
		Bottle xbottle3 = new Bottle();
		
		
		
		System.out.println("Type");
		//xbottle1.read();
		xbottle1.set(15);
		xbottle2.set(10);
		//System.out.println(xbottle1.add(xbottle2));
		
		xbottle3 = xbottle2.add(xbottle1);
		
		
		
		System.out.println(xbottle1.get());
		System.out.println(xbottle2.get());
		System.out.println(xbottle3.get());
	}

}

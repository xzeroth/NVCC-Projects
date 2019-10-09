package randomTests;

public class exceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		finally{
			System.out.println("no");
		}

	}

}

package randomTests;

public class Scramblies {

	public static void main(String[] args) {
		scramble("rkqodlw", "world");
System.out.println(scramble("rkqodlw", "world"));
System.out.println(scramble("cedewaraaossoqqyt","codewars"));
System.out.println(scramble("katas","steak"));
System.out.println(scramble("scriptjavx","javascript"));
		
	}

	public static boolean scramble(String str1, String str2) {
		
		char [] oneArray = str1.toCharArray();
		char [] twoArray = str2.toCharArray();
		
		for(int i = 0 ; i < twoArray.length; i++ ) {
			for(int j = 0 ; j < oneArray.length; j++) {
				if(oneArray[j] == twoArray[i]) {
					twoArray[i] = ' ';
					oneArray[j] = ' ';
				}
			}
		}
		
		boolean ans = true;
		
		for(int k = 0; k < twoArray.length; k++) {
			if(twoArray[k] != ' ') {
				ans = false;
			}
			
		}
		
		return ans;
	}
}
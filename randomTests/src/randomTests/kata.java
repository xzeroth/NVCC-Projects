package randomTests;

public class kata {

	public static void main(String[] args) {
		String[] x = { "#", "!" };
//		stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", x);
		System.out.println(stripComments("apples, pears     # and bananas   \n  \ngrapes\nbananas      !apples", x));
		System.out.println(stripComments("a #b\nc\nd $e f g", new String[] { "#", "$" }));
	}

	public static String stripComments(String text, String[] commentSymbols) {
		String finalString = "";

		String[] lines = text.split("\\r?\\n");
		String[] newLines = new String[lines.length];
		int test = 0;
		for (int m = 0; m < newLines.length; m++) {
			newLines[m] = "";
		}

//		for(String x :lines ) {
//			System.out.println(x);
//		}

		for (int i = 0; i < newLines.length; i++) {
			secondLoop: for (int j = 0; j < lines[i].length(); j++) {
				for (int k = 0; k < commentSymbols.length; k++) {
					if (lines[i].charAt(j) == commentSymbols[k].charAt(0)) {
						break secondLoop;
					}
				}
				newLines[i] = newLines[i] + lines[i].charAt(j);
			}
			test = newLines[i].length() - 1;
			// while(newLines[i].charAt(newLines[i].length() - 1) == ' ' )

			String spaces = "";
			for (int g = 0; g < newLines[i].length(); g++) {
				spaces = spaces + " ";
			}
			if (newLines[i].equals(spaces)) {
				newLines[i] = "";
			}

			if (newLines[i].length() > 1) {
				if (newLines[i].equals(spaces)) {
					newLines[i] = "";
				} else {
					while (newLines[i].charAt(test) == ' ') {

						newLines[i] = newLines[i].substring(0, newLines[i].length() - 1);
						test--;

					}
				}
			}
		}

//		for(String p : newLines) {
//			System.out.println(p);
//		}

		finalString = String.join("\n", newLines);

		return finalString;
	}
}

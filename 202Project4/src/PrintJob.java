
public class PrintJob {

	private String name;
	private String color;
	private String text;
	private int numPaper;

	public PrintJob() {
		name = null;
		color = null;
		text = null;
		numPaper = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}
//
//	public void setColor(PaperTray color) {
//		this.color = color;
//	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumPaper() {
		return numPaper;
	}

	public void setNumPaper(int numPaper) throws LessThanOneException {
		if (numPaper < 1) {
			throw new LessThanOneException("Can only print one or more copies");
		} else {
			this.numPaper = numPaper;
		}
	}

	public String toString() {
		return String.format("Name: %s\nColor: %s\nNumber of Paper\n: %s\nText: %s", name, color, numPaper, text);
	}

}

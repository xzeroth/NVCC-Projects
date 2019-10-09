
public class PaperTray {

	private final int trayFull = 100;
	private int numPaper;

	public PaperTray() {
		numPaper = 0;
	}

	public PaperTray(int num) {
		numPaper = num;
	}

	public int getNumPaper() {
		return numPaper;
	}

	public void setNumPaper(int numPaper) throws PaperOverFlowException,NotEnoughPaperException {
		if (numPaper > 100) {
			throw new PaperOverFlowException("Tray can only hold 100 peices of paper");
		} else if(numPaper < 0) {
			throw new NotEnoughPaperException("Can't remove more papers");
		}else {
			this.numPaper = numPaper;
		}
	}

	public String toString() {
		return String.format("%s paper(s) in this tray.", numPaper);
	}
}

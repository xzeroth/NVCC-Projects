
public class Printer {

	private PaperTray white;
	private PaperTray yellow;
	private NodeBasedQueue<PrintJob> job;

	public Printer() {
		white = new PaperTray(100);
		yellow = new PaperTray(100);
		job = new NodeBasedQueue<PrintJob>();
	}

	public void nextJob() throws NotEnoughPaperException {

		try {
			if(job.dequeue().getColor().equalsIgnoreCase("white")) {
				if(job.dequeue().getNumPaper() > white.getNumPaper()) {
					throw new NotEnoughPaperException("There is not enough paper in this tray");
				}else {
					removePaper("white",job.look().getNumPaper());
					job.dequeue();
					
				}
			}else if(job.look().getColor().equalsIgnoreCase("yellow")) {
				if(job.look().getNumPaper() > yellow.getNumPaper()) {
					throw new NotEnoughPaperException("There is not enough paper in this tray");
				}else {
					removePaper("yellow",job.look().getNumPaper());
					job.dequeue();
				}
			}
		} catch (QueueEmptyException e) {
			System.out.println(e.getMessage());
		} catch(NotEnoughPaperException e) {
			System.out.println(e.getMessage());
		} catch(ColorPaperException e) {
			System.out.println(e.getMessage());
		}

	}

	public void acceptJob(PrintJob item) {

		job.enqueue(item);

	}

	public void allPrintJobs() {
		try {
			while(job.look()!= null) {
				System.out.println(job.look());
			}
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + "in printer");;
		}
	}

	public int checkPaper(String color) throws ColorPaperException{
		if(color.equalsIgnoreCase("white")) {
			return white.getNumPaper();
		}else if (color.equalsIgnoreCase("yellow")) {
			return yellow.getNumPaper();
		}else {
			throw new ColorPaperException("Wrong color selected");
		}
	}

	public void addPaper(String color, int numPaper) throws ColorPaperException{

		if(color.equalsIgnoreCase("white")) {
			try {
				int totalPaper = white.getNumPaper() + numPaper;
				white.setNumPaper(totalPaper);
			}catch(PaperOverFlowException | NotEnoughPaperException e){
				System.out.println(e.getMessage());
			}
		}else if (color.equalsIgnoreCase("yellow")) {
			try {
				int totalPaper = yellow.getNumPaper() + numPaper;
				yellow.setNumPaper(totalPaper);
			}catch(PaperOverFlowException | NotEnoughPaperException e) {
				System.out.println(e.getMessage());
			}
		}else {
			throw new ColorPaperException("Wrong color selected");
		}
	}

	public void removePaper(String color, int numPaper) throws ColorPaperException{
		
		if(color.equalsIgnoreCase("white")) {
			try {
				int totalPaper = white.getNumPaper() - numPaper;
				white.setNumPaper(totalPaper);
			}catch(NotEnoughPaperException | PaperOverFlowException e){
				System.out.println(e.getMessage());
			}
		}else if (color.equalsIgnoreCase("yellow")) {
			try {
				int totalPaper = yellow.getNumPaper() - numPaper;
				yellow.setNumPaper(totalPaper);
			}catch(NotEnoughPaperException | PaperOverFlowException e) {
				System.out.println(e.getMessage());
			}
		}else {
			throw new ColorPaperException("Wrong color selected");
		}
	}

}

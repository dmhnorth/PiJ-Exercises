//Works
public class ReadMarks {
	private int totalMarks = 0;
	private int distinctions = 0;
	private int passes = 0;
	private int failed = 0;
	private int invalidEntries = 0;
	
		public ReadMarks() {
			totalMarks = 0;
			distinctions = 0;
			passes = 0;
			failed = 0;
			invalidEntries = 0;
	}
	
	private void marks() {	
		boolean finished = false;
		
		String userEntry = "";
		
		
		
		do {
			System.out.print("Please enter a pass mark, enter -1 to finish: ");
			userEntry = System.console().readLine();
			int curMark = Integer.parseInt(userEntry);


			if (curMark >= 101 || curMark <= -2) {
				invalidEntries++;
				totalMarks++;
			} else if (curMark <= 100 && curMark >= 70) {
				distinctions++;
				totalMarks++;
			} else if (curMark <= 69 && curMark >= 50) {
				passes++;
				totalMarks++;
			} else if (curMark <= 49 && curMark >= 0) {
				failed++;
				totalMarks++;
			}
		} while (!userEntry.equals("-1"));	
	System.out.println("There are " + totalMarks + " students: "+ distinctions + " distinctions, " + passes + " passes, " + failed + " failed. There were " + invalidEntries + " invalid entries.");
	}


//Program starts here
	public static void main(String[] args) {
		System.out.println("Please enter some marks, one after another, and finish by entering -1");
		ReadMarks reader1 = new ReadMarks();
		reader1.marks();
	}
}


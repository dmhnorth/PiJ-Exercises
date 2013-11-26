public class Mean {
	
	private int getNumber() {
		int result = 0;
		boolean number = false;		
		
		
			try {
				String str = System.console().readLine();
				result = Integer.parseInt(str);
				System.out.println("You entered " + result + ".");
				number = true;
			} catch (NumberFormatException ex) {
				System.out.println("What you entered was not an integer number! Enter another: ");
			}
		
		if (number) {
			return result;
		} else { 
			return getNumber();
			}
	}
	
	private void getAverageOf10() {		
		int count = 0;
		int total = 0;
		
		do {			
			total += getNumber();
			count++;
		} while (count <= 10);
	
		double result = (total/10);		
		System.out.println("The average of ten numbers is: " + result);
	}
	
	private void getAverageOf(int userEntry) {		
		int count = 0;
		int total = 0;
		
		do {			
			total += getNumber();
			count++;
		} while (count <= userEntry);
	
		double result = (total/userEntry);		
		System.out.println("The average of " + userEntry + " numbers is: " + result);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Mean mn = new Mean();
		mn.launch();

	}
	
	public void launch() {
		int n = 0;
	
		System.out.println("How many numbers would you like to find the average of?: ");
		n = getNumber();
		System.out.println("Thank you, please now enter your " + n + " numbers:");
		
		getAverageOf(n);
		//getAverageOf10();
	
	}
}
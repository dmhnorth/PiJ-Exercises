public class SmartPhone extends MobilePhone{
	
	
	public void browseWeb(String site) {
		System.out.println("You're now looking at the website: " + site);
	}

	public void findPosition() {
		double x = Math.random()*1000;
		double y = Math.random()*1000;
		System.out.println("You're currently standing at: " + x + "," + y);
	}

	public void call(String number) {	
				
		if (number.substring(0,2).equals("00")) {
			System.out.println("Calling via the internet to save money.");
			} 
		super.call(number);
		
	}
}
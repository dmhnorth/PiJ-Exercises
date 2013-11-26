public class MobilePhone extends OldPhone {
	private String[] lastNumbers;
	private int counter;
	
	public MobilePhone() {	//constructor
		lastNumbers = new String[10];
		counter = 0;
	}
	
	public void call(String number) {	
		System.out.println("Calling " + number + "...");		
		if (counter > 9) {
			counter = 0;
		}		
		lastNumbers[counter] = number;	
		counter++;
	}
	
	
	public void ringAlarm(String ring) {
		System.out.println("Alarm alarm alarm...");
	}

	public void playGame(String game) {
		System.out.println("You are playing " + game);
	}

	public void printLastNumbers() {
		for (int i = 0; i < lastNumbers.length; i++) {
			if(lastNumbers[i] != null) {
				System.out.println("Previous number dialed: " + lastNumbers[i]);
			}
		}

	}

}

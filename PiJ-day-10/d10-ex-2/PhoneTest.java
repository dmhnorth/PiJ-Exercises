public class PhoneTest{


	public static void main(String[] args) {
	
		PhoneTest pt = new PhoneTest();	
		pt.launch();
	
	
	}
	
	public void launch(){
		
		SmartPhone davesPhone = new SmartPhone();
		
		davesPhone.ringAlarm("ARLAMA!");
		davesPhone.call("07753483195");
		davesPhone.call("07753487659");
		davesPhone.call("007754658956");
		
		davesPhone.findPosition();
		
		davesPhone.ringAlarm("The phone is ringing");
		
		davesPhone.playGame("Private Pirate");
		davesPhone.browseWeb("www.worksafepron.com");

		
		davesPhone.printLastNumbers();
	}
}	
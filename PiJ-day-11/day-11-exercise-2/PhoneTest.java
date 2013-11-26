public class PhoneTest{


	public static void main(String[] args) {
	
		PhoneTest pt = new PhoneTest();	
		pt.launch();
	
	
	}
	
	public void testPhone(MobilePhone phone){
		
		SmartPhone downCastPhone = new SmartPhone(phone.getBrand()); 
		

		
		downCastPhone.ringAlarm("ARLAMA!");
		downCastPhone.call("07753483195");
		downCastPhone.call("07753487659");
		downCastPhone.call("007754658956");		
		downCastPhone.findPosition();
		System.out.println(downCastPhone.getBrand());
		downCastPhone.ringAlarm("The phone is ringing");		
		downCastPhone.playGame("Private Pirate");
		downCastPhone.browseWeb("www.worksafepron.com");		
		downCastPhone.printLastNumbers();
		
	
	}
	
	
	public void launch(){
		SmartPhone np = new SmartPhone("butthole");
		
		MobilePhone davesPhone = new SmartPhone("Sony");
		
		
		testPhone(davesPhone);
	
	
	
	
	
	
	
	}
}	
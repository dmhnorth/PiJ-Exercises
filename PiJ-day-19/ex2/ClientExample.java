import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class ClientExample {

	public static void main(String[] args){
	
	try {
	
	Remote service = Naming.lookup("//127.0.0.1:1099/date");	//assigning a server thats running somewhere
	DateService dateService = (DateService) service;	//casting the server assigned above, AS a DateService, so I can use it in the program below
	
	System.out.println("The server is now connected and being used");	//For reference. The server at this point must now be running
																		//and if the server is running we can now make calls to it
	
	String recievedDate = dateService.date();	//this is using the service to see what the date is, assigning a string for recievedDate
	System.out.println("The string assigned at the server side for recievedDate is: " + recievedDate);
	
	
	} catch (Exception ex) {
		System.err.println("There's been a problem");
		ex.printStackTrace();
	
	}
	
	}

}

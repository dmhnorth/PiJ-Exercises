import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class ClientExample {

	public static void main(String[] args){
	
	try {
	
	Remote service = Naming.lookup("//127.0.0.1:1099/echo");	//assigning a server thats running somewhere
	EchoService echoService = (EchoService) service;	//casting the server assigned above, AS an EchoService, so I can use it in the program
	
	System.out.println("The server is now connected and being used");	//The server at this point must now be running
																		//and if the server is running we can now make calls to it
	
	String recievedEcho = echoService.echo(args[0]);	//this is using the service to do some echo'ing, assigning a string for example
	System.out.println("The string assigned at the server side using args input 0 is: " + recievedEcho);
	
	
	} catch (Exception ex) {
		System.err.println("There's been a problem");
	
	}
	
	}

}

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClientExample {

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	
	try {
	
	
	
	Remote service = Naming.lookup("//127.0.0.1:1099/calc");	//assigning a server thats running somewhere
	CalcService calcService = (CalcService) service;	//casting the server assigned above, AS a DateService, so I can use it in the program below
	
	System.out.println("The server is now connected and being used. Enter a calculation: ");	//For reference. The server at this point must now be running
																		//and if the server is running we can now make calls to it
	
	String userInput = sc.nextLine();
	String recievedAns = calcService.calc(userInput);	//this is using the service to see what the date is, assigning a string for recievedCalc
	System.out.println("The string assigned at the server side for recievedAns is: " + recievedAns);
	
	
	} catch (Exception ex) {
		System.err.println("There's been a problem");
		ex.printStackTrace();
	
	}
	
	}

}

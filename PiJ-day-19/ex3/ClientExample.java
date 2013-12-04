import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClientExample {

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	
	try {
	
	
	
	Remote service = Naming.lookup("//127.0.0.1:1099/calc");	//assigning a server that's running somewhere
	CalcService calcService = (CalcService) service;	//casting the server assigned above, AS a DateService, so I can use it in the program below
	
	System.out.println("The server is now connected and being used. Enter a calculation: ");	//For reference. The server at this point must now be running
																		//and if the server is running we can now make calls to it
    String userInput;
    String receivedAns;
        do {
	userInput = sc.nextLine();

            if ((userInput.equals("End") || (userInput.equals("end"))))  {
                receivedAns = "End";
            } else {
                try {
                receivedAns = calcService.calc(userInput);	//this is using the service to see what the date is, assigning a string for receivedCalc
                System.out.println(receivedAns + ", Please enter another ('End' to exit): ");
                } catch (Exception ex) {
                    System.out.println("That was not a calculation, or you have a typo.");
                    receivedAns = "";
                }

            }

    } while (!receivedAns.equals("End"));
        System.out.println("You have exited.");

    } catch (Exception ex) {
		System.err.println("There's been a problem");
		ex.printStackTrace();
	
	}
	
	}

}

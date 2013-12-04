import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalcServer extends UnicastRemoteObject implements CalcService {
	
	
	public CalcServer() throws RemoteException {	
	//CommandLineCalc cl = new CommandLineCalc();	
	// Potentially initialise calculator object for this server?
	}

	@Override
	public String calc(String c) {
	// This println is not necessary, but helps verifying whether
	// the server has received the call or not on the remote machine		
	
	/*
	** implement the CommandLineCalc class here and assign its answer to answer
	
	double answer = cl.calculate(c);
	
	*/
	
	
	double answer = 666;	//temp answer
	
	String answerAsStr = String.valueOf(answer);
	
	System.out.println("Replied to some client with a calculation as a double.");
	return answerAsStr;
	}
}
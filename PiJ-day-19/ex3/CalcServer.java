import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalcServer extends UnicastRemoteObject implements CalcService {
	
	
	public CalcServer() throws RemoteException {

	// Potentially initialise calculator object for this server?
	}

	@Override
	public String calc(String c) {
    CommandLineCalc cl = new CommandLineCalc();

	// This println is not necessary, but helps verifying whether
	// the server has received the call or not on the remote machine
	System.out.println("Replied to some client with a calculation as a String.");

	return cl.calculate(c);
	}
}
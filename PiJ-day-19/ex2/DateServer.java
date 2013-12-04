import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;


public class DateServer extends UnicastRemoteObject implements DateService {
	private Calendar rightNow;
	
	public DateServer() throws RemoteException {	
		rightNow = Calendar.getInstance();
	// Calendar initialised for this server
	}

	@Override
	public String date() {
	// This println is not necessary, but helps verifying whether
	// the server has received the call or not on the remote machine		
	
	String time = rightNow.getTime().toString();
	
	System.out.println("Replied to some client with the date as a String.");
	return time;
	}
}
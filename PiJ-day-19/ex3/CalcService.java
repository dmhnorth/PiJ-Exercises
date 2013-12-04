import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * An implementation of the echo service.
 */
public interface CalcService extends Remote {
	/**
	 * Returns the answer to a simple maths problem sent as a String
	 * @return the answer to a calculation in String format
	 */
	public String calc(String c) throws RemoteException;
}
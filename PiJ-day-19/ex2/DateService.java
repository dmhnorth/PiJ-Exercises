import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * An implementation of the echo service.
 */
public interface DateService extends Remote {
	/**
	 * Returns the date on the particular server called
	 * @return the date
	 */
	public String date() throws RemoteException;
}
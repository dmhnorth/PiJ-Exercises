import java.rmi.RemoteException;
import java.rmi.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;



public class CalcServerLauncher {

	public static void main(String[] args) {
	
		CalcServerLauncher cl1 = new CalcServerLauncher();
		cl1.launch();
	
	}
	


	private static void launch() {
		// 1. If there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			// 2. Create the registry if there is not one
			LocateRegistry.createRegistry(1099);
			// 3. Create the server object
			CalcServer server = new CalcServer();
			// 4. Register (bind) the server object on the registy.
			// The registry may be on a different machine
			String registryHost = "//localhost/";
			String serviceName = "calc";
			Naming.rebind(registryHost + serviceName, server);
			System.out.println("The date server is now running...");
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}

}
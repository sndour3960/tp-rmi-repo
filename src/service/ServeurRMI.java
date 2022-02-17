package service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {

	public static void main(String[] args) {
		try {
			
			LocateRegistry.createRegistry(1990);
			IBanqueImpl od = new IBanqueImpl();
			System.out.println(od.toString());
			Naming.rebind("rmi://localhost:1990/BS", od);
			
		} catch (RemoteException | MalformedURLException e) {
		
			e.printStackTrace();
		}
		

	}

}

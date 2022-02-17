package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class IBanqueImpl extends UnicastRemoteObject implements IBanqueService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected IBanqueImpl() throws RemoteException {
		super();
	
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		
		return 200*mt;
	}

	@Override
	public Date getServerDate() throws RemoteException {
	
		return new Date();
	}

}

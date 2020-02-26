import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner; 
public class nametestIMPL extends UnicastRemoteObject implements nametest {
	private String first, surname;
	protected nametestIMPL() throws RemoteException {
		first = "Varun";
		surname = "Tiwari";
	}
	
	public void nametest(String f, String s) throws RemoteException {
		// TODO Auto-generated method stub
		first=f;
		surname=s;
	}

	public void updateSurname(String s) throws RemoteException {
		// TODO Auto-generated method stub
		surname=s;
	}

	public String readName() throws RemoteException {
		return first +" "+ surname;	
	}

	
}

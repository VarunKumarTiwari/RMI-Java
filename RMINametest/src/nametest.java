import java.rmi.*;
interface nametest extends Remote {
	public void nametest(String f, String s) throws RemoteException;
	public void updateSurname(String s) throws RemoteException;
	public String readName()throws RemoteException;
}
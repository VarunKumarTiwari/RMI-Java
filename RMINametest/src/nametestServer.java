import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*; 
import java.util.Scanner;
public class nametestServer {

	
	public static  void main( String args[] ) throws Exception {
 		
	   	 
        LocateRegistry.createRegistry(1099); 
        System.out.println("java RMI registry created.");
        nametestIMPL n1=new nametestIMPL();
        Naming.rebind("toaster",n1);
      
       
    
   
}
}

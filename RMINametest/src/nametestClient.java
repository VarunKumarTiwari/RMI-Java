import java.util.Scanner;

import java.rmi.*;
public class nametestClient {
	
	public static void main(String [] args) throws Exception
	{
		String url="rmi:///";
		nametest n = (nametest)Naming.lookup(url+"toaster");
		
		int choice = 1;
		Scanner sc = new Scanner(System.in);
		while(choice!=3)
		{
         System.out.println();
		 System.out.println("1.Change Surname");
		 System.out.println("2.Print_Name");
		 System.out.println("3.Exit");

			System.out.print("\nPlease enter a value-->");
			choice=sc.nextInt();
		 if(choice==1)
			{
			 System.out.print("\nEnter new surname-->");
			 String nm=sc.next();
			 n.updateSurname(nm);
			}



			else if(choice==2)
			{
				String res=n.readName();
				System.out.println(res);
			}

		}  // end while
	}
	}
	


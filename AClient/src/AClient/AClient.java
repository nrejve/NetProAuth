package AClient;

import java.io.*;
import java.net.*;
class AClient
{
	public static void main(String argv[]) throws Exception
	{
		String sentence;
		String modifiedSentence;
		
		String user;
		String pass;

		BufferedReader inFromUser=
			new BufferedReader(new InputStreamReader(System.in));

		InetAddress inetAddress=InetAddress.getLocalHost();
        Socket clientSocket = new Socket("localhost",6789);
		DataOutputStream outToServer=
			new  DataOutputStream(clientSocket.getOutputStream());

		BufferedReader inFromServer=
			new  BufferedReader(new InputStreamReader
							(clientSocket.getInputStream()));
		
		
 

		System.out.print("Enter user name: ");
		user = inFromUser.readLine();
		outToServer.writeBytes(user+'\n'); 			
		
		String passNeed = inFromServer.readLine();
		System.out.println(passNeed);
		pass = inFromUser.readLine(); 				
		outToServer.writeBytes(pass+'\n'); 	        
		
		String login = inFromServer.readLine();
		System.out.println(login);

		
		
		
		clientSocket.close();



	}
}

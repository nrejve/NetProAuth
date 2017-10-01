package AServer;

import java.io.*;
import java.net.*;


class AServer
{
	public static void main(String argv[]) throws Exception
	{
		
		String password; 
		String enterPass = "Enter pasword: ";
		ServerSocket welcomeSocket= new ServerSocket(6789);
		while (true)
		{
			Socket connectionSocket=welcomeSocket.accept();
			BufferedReader inFromClient=
				new BufferedReader(new InputStreamReader(
					connectionSocket.getInputStream()));
			DataOutputStream outToClient=
				new DataOutputStream(
					connectionSocket.getOutputStream());
			
			
			
			String userName = inFromClient.readLine();         
			System.out.println("From Client: "+userName); 
			
			
			if(userName.equalsIgnoreCase("alice"))
			{
				outToClient.writeBytes(enterPass+'\n');  
			    password = inFromClient.readLine();          
			    
			    if(password.equals("aaa"))
			    {
			    	
			    	outToClient.writeBytes("Sccessfully Logged in ! "+'\n');   
	    
			    }
			    else
			    	{
			    
			    	outToClient.writeBytes("Wrong password ! "+'\n');
			    	
			    	}
			}
			
			else if(userName.equalsIgnoreCase("bob"))
			{
				outToClient.writeBytes(enterPass+'\n');  
			    password = inFromClient.readLine();          
			    
			    if(password.equals("bbb"))
			    {
			    	
			    	outToClient.writeBytes("Sccessfully Logged in ! "+'\n');  
	    
			    }
			    else
			    	{
			    
			    	outToClient.writeBytes("Wrong password ! "+'\n');
			    	
			    	}
			}
			
			else if(userName.equalsIgnoreCase("cindy"))
			{
				outToClient.writeBytes(enterPass+'\n');   
			    password = inFromClient.readLine();         
			    
			    if(password.equals("ccc"))
			    {
			    	
			    	outToClient.writeBytes("Sccessfully Logged in ! "+'\n');   
	    
			    }
			    else
			    {
			    
			    	outToClient.writeBytes("Wrong password ! "+'\n');
			    	
			    }
			}
			
			else if(userName.equalsIgnoreCase("david"))
			{
				outToClient.writeBytes(enterPass+'\n');   
			    password = inFromClient.readLine();          
			    
			    if(password.equals("ddd"))
			    {
			    	
			    	outToClient.writeBytes("Sccessfully Logged in ! "+'\n');   
	    
			    }
			    else
			    {
			    
			    	outToClient.writeBytes("Wrong password ! "+'\n');
			    	
			    }
			}
			
			else if(userName.equalsIgnoreCase("eve"))
			{
				outToClient.writeBytes(enterPass+'\n');   
			    password = inFromClient.readLine();          
			    
			    if(password.equals("eee"))
			    {
			    	
			    	outToClient.writeBytes("Sccessfully Logged in ! "+'\n');   
	    
			    }
			    else
			    {
			    
			    	outToClient.writeBytes("Wrong password ! "+'\n');
			    	
			    }
			}
			
			else if(userName.equalsIgnoreCase("frank"))
			{
				outToClient.writeBytes(enterPass+'\n');  
			    password = inFromClient.readLine();          
			    
			    if(password.equals("fff"))
			    {
			    	
			    	outToClient.writeBytes("Sccessfully Logged in ! "+'\n');   
	    
			    }
			    else
			    {
			    
			    	outToClient.writeBytes("Wrong password ! "+'\n');
			    	
			    }
			}
			
			else if(userName.equalsIgnoreCase("george"))
			{
				outToClient.writeBytes(enterPass+'\n');  
			    password = inFromClient.readLine();          
			    
			    if(password.equals("ggg"))
			    {
			    	
			    	outToClient.writeBytes("Sccessfully Logged in ! "+'\n');   
	    
			    }
			    else
			    {
			    
			    	outToClient.writeBytes("Wrong password ! "+'\n');
			    	
			    }
			}
			
			else
				outToClient.writeBytes("User name do not match ! "+'\n');
				
			
			
			
			
		}
		
	}
	
	
	
}

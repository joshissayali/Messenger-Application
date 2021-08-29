import java.net.ServerSocket;
import java.net.*;
import java.io.*;
class server
{
	public static void main(String[] args) throws IOException
	{
		try {
			ServerSocket ss = new ServerSocket(5000);
			Socket s= ss.accept();
			System.out.println("server connected");
			while(true) 
			{
			BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=in.readLine();
			PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			out.println("server : " +str);
			System.out.println("client : " +str );
			BufferedReader userinput=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("server :");
			String s3=userinput.readLine();
			PrintWriter ou=new PrintWriter(s.getOutputStream(),true);
			out.println("server : " +s3);
		
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
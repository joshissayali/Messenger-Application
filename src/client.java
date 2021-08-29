
import java.net.*;
import java.io.*;
class client
{
	public static void main(String[] args) throws IOException
	{  
		try {
		System.out.println("client started");
		Socket s = new Socket("localhost",5000);
		while(true)
		{
		BufferedReader userinput=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("client :");
		String str=userinput.readLine();
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		out.println(str);
		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(in.readLine());
		BufferedReader i=new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(in.readLine());
		
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
import java.io.*;
import java.net.*;

class MSSClient {
	
    public static void main(String[] args) throws Exception {
    {
	
	String num;
	String modifiedNum;
	
	BufferedReader inFormUser = new BufferedReader (new InputStreamReader(System.in));
	
	Socket clientSocket = new Socket("localhost",300);
	
	DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
	
	BufferedReader inFormServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	
	num = inFormUser.readLine();
	
	outToServer.writeBytes("num" + '\n');
	
	modifiedNum = inFormServer.readLine();
	
	System.out.println("Server:" +modifiedNum);
	
	clientSocket.close();
	}
}
}

import java.io.*;
import java.net.*;

class MSSServer {
	public static void main(String[] args) throws Exception {
	
	String clientNum;
	String capitalizedNum;
	
	ServerSocket welcomeSocket = new ServerSocket(300);
	
	while(true) {
	Socket connectionSocket = welcomeSocket.accept();
	BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
	
	DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
	
	clientNum = inFromClient.readLine();
	
	capitalizedNum = clientNum.toUpperCase() + '\n';
	
	outToClient.writeBytes(capitalizedNum);
	
	}
}
}
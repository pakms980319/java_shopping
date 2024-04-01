package Ch22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
	public static void main(String[] args) throws IOException {
		// Server socket
		ServerSocket server = new ServerSocket(6000); // port number , 192.168.2.3:6000
		System.out.println("[INFO] Srever Socket Listening...");
		
		while(true) {
			Socket client = server.accept();
			System.out.println("[INFO] " + client.getInetAddress() + " 에서 접속");
			OutputStream out = client.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			
			dout.writeUTF("WELCOME TO SERVER!");
			dout.flush();
			dout.close();
			out.close();
			
			InputStream in = client.getInputStream();
			DataInputStream din = new DataInputStream(in);
			
			String recv = din.readUTF();
			System.out.println("RECIVE: " + recv);
		}
		
	}
}

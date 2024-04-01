package Ch22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class C02Server {
	public static void main(String[] args) throws IOException {
		// Server socket
		ServerSocket server = new ServerSocket(8000); // port number , 192.168.2.3:6000
		System.out.println("[INFO] Srever Socket Listening...");
		
		Socket client = server.accept();
		
		System.out.println("[INFO] Client: " + client.getInetAddress());
		DataInputStream din = new DataInputStream(client.getInputStream());
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		String recv = null;
		String send = null;
		while (true) {
			// 수신
			recv = din.readUTF();
			if (recv.equals("q") || recv==null) {
				break;
			}
			System.out.println("[Client]: " + recv);
			
			// 송신
			System.out.print("[ME(q: 종료)]: ");
			send = sc.nextLine();
			
			dout.writeUTF(send);
			dout.flush();
			
			if(send.equals("q")) {
				break;
			}
		}
		dout.close();
		din.close();
		client.close();	
	}
}

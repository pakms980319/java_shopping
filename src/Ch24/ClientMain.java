package Ch24;

import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) throws Exception {
//		String Ip = "192.168.2.254";
		String Ip = "192.168.2.2";
		Socket client = new Socket(Ip, 8000);
		
		ClientSendThread send = new ClientSendThread(client);
		ClientRecvThread recv = new ClientRecvThread(client);
		
		Thread th1 = new Thread(send);
		Thread th2 = new Thread(recv);
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		client.close();
	}
}

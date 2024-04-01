package Ch24;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ServerSendThread implements Runnable {
	Socket socket;
	Scanner sc;
	DataOutputStream dout;
	
	public ServerSendThread(Socket socket) {
		this.socket = socket;
		this.sc = new Scanner(System.in);
	}
	
	@Override
	public void run() {
		try {
			dout = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				System.out.print("[SERVER(q:종료)] : ");
				String send = sc.nextLine();
				dout.writeUTF(send);
				dout.flush();
				if (send.equals("q"))	break;
			}
			System.out.println("[INFO] 종료합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

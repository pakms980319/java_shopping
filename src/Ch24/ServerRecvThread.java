package Ch24;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerRecvThread implements Runnable {

	Socket socket;
	DataInputStream din;
	
	public ServerRecvThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			din = new DataInputStream(socket.getInputStream());
			
			String recv = null;
			
			while(true) {
				recv = din.readUTF();
				if(recv.equals("q") || recv == null ) {
					break;
				}
				System.out.println("\n[Client] : " + recv);
			}
			
			System.out.println("[INFO] 수신을 종료합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

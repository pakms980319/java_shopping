package Ch25;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerRecvThread implements Runnable {

	Socket socket;
	DataInputStream din;
	Sgui sgui;
	
	public ServerRecvThread(Socket socket, Sgui sgui) {
		this.socket = socket;
		this.sgui = sgui;
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
				sgui.area.append("[Client] : " + recv + "\n");
			}			
			System.out.println("[INFO] 수신을 종료합니다.");
			sgui.area.append("[Client] 와의 연결을 종료합니다.\n");
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

package Ch25;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientRecvThread implements Runnable {
	Socket socket;
	DataInputStream din;
	Cgui cgui;
	
	public ClientRecvThread(Socket socket, Cgui cgui) {
		this.socket = socket;
		this.cgui = cgui;
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
				cgui.area.append("[Server]: " + recv + "\n");
			}
			
			cgui.area.append("[Server] 와의 연결을 종료합니다.");
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

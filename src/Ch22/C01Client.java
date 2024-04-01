package Ch22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Client {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.2.254", 7000);
			System.out.println("서버와 연결 완료");
			
			InputStream in = client.getInputStream();
			DataInputStream din = new DataInputStream(in);
			String msg = din.readUTF();
			System.out.println("[SERVER] " + msg);
			
			OutputStream out = client.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			
			dout.writeUTF("집에 보내주세요");
			
			dout.flush();
			dout.close();
			out.close();
			
			din.close();
			in.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

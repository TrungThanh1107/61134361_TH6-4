package cntt61.NTThanh;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CTChinh {

	public static void main(String[] args) throws IOException {
		ServerSocket socketserver = new ServerSocket(6565);
		System.out.print("I'm listening on port..");
		int id=0;
		while(true) {
			Socket s = socketserver.accept();
			id++;
			MoFile m = new MoFile(s,id);
			m.start();
		}
	}

}
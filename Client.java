package cntt61.NTThanh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {			
			Socket socket = new Socket("localhost",6565);
			System.out.print("Conected!");
			
			InputStream in = socket.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);

			OutputStream osToClient = socket.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWrite = new BufferedWriter(write2Client);

			Scanner banPhim = new Scanner(System.in);
			while(true) {
				System.out.print("\nNhập số của file:");
				String chuoiGui = banPhim.nextLine();
				buffWrite.write(chuoiGui+"\n");
				buffWrite.flush();
				
				
				
				
				if(chuoiGui.equals("0")) break;
			}
			socket.close();
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
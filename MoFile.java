package cntt61.NTThanh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MoFile extends Thread{
	Socket socketClient;
	int id = -1;
	public MoFile(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
	}
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = socketClient.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2client);
			
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
			
			while(true){
				String chuoiNhan=buffR.readLine();
				System.out.print(chuoiNhan);
				
				if(chuoiNhan.equals("1"))
				{
					FileReader fr = new FileReader("G:\\file1.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				if(chuoiNhan.equals("2"))
				{
					FileReader fr = new FileReader("G:\\file2.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				if(chuoiNhan.equals("3"))
				{
					FileReader fr = new FileReader("G:\\file3.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				if(chuoiNhan.equals("4"))
				{
					FileReader fr = new FileReader("G:\\file4.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				if(chuoiNhan.equals("5"))
				{
					FileReader fr = new FileReader("G:\\file5.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				if(chuoiNhan.equals("6"))
				{
					FileReader fr = new FileReader("G:\\file6.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				if(chuoiNhan.equals("7"))
				{
					FileReader fr = new FileReader("G:\\file7.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				if(chuoiNhan.equals("8"))
				{
					FileReader fr = new FileReader("G:\\file8.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				if(chuoiNhan.equals("9"))
				{
					FileReader fr = new FileReader("G:\\file9.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				if(chuoiNhan.equals("10"))
				{
					FileReader fr = new FileReader("G:\\file10.txt");
					BufferedReader br = new BufferedReader(fr);
					int i;
					while ((i = br.read()) != -1) 
					{
						System.out.print((char) i);
					}
				}
				 if(chuoiNhan.equals("0")) {
					break;
				}
				
			}
			socketClient.close();
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
}

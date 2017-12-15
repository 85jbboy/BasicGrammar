package io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputTest {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\Users\\85jbb\\eclipse-workspace\\jaout.txt");
			String str = "자, 다시 시작하는거야!!";
			byte[] bs = str.getBytes();
			os.write(bs);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os != null) os.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());	
			}
		}
		
	}
}

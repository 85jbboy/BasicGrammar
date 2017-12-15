package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public interface InOutput2 {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		byte[] bs = new byte[5];  // 이거 다름
		 
		try {
			is = new FileInputStream("C:\\Users\\85jbb\\eclipse-workspace\\jain.txt");
			os = new FileOutputStream("C:\\Users\\85jbb\\eclipse-workspace\\jain_copy.txt");
			
			while(true) {
				int i = is.read(bs); // 이거 다름
				if(i == -1) break;
				os.write(bs, 0, i); // 이거 다름
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch(Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			if(os != null) {
				try {
					os.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
	}
	
}
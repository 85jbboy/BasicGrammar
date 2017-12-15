package io;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Users\\85jbb\\eclipse-workspace\\jain.txt");
			while(true) {
				int i = is.read();
				System.out.println("데이터: " + i);
				if(i == -1) break;
			}
		} catch(Exception e) {
			
		}
		

	}

}

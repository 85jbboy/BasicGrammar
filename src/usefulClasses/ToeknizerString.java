package usefulClasses;

import java.util.StringTokenizer;

public class ToeknizerString {
	public static void main(String[] args) {
		String phoneNum = "TEL 82-02-877-2719";
		String javaCode = "num+=1";
		
		System.out.println("First Result...");
		StringTokenizer str1 = new StringTokenizer(phoneNum);
		while(str1.hasMoreTokens())
			System.out.println(str1.nextToken());
		
		System.out.println("Second Result...");
		StringTokenizer str2 = new StringTokenizer(phoneNum, "-");
		while(str2.hasMoreTokens())
			System.out.println(str2.nextToken());
		
		System.out.println("Third Result...");
		StringTokenizer str3 = new StringTokenizer(phoneNum, " -");
		while(str3.hasMoreTokens())
			System.out.println(str3.nextToken());
		
	}

}

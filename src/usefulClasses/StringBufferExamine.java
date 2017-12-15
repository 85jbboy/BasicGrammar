package usefulClasses;

public class StringBufferExamine {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("abcdefg");
		String str2 = "hijk";
		str1.append(str2);
		System.out.println(str1 + "문자열 길이 : " + str1.length());
		
		StringBuffer str3 = new StringBuffer(100);
		str3.append("abcdefghijklmn");
		System.out.println(str3 + "문자열 길이 : " + str3.length());
		
		// 삭제와 삽입
		StringBuffer strFileName = new StringBuffer(100);
		strFileName.append("test.txt");
		System.out.println(strFileName);
		strFileName.delete(0, strFileName.length() - 5);
		System.out.println(strFileName);
		strFileName.insert(0, "success");
		System.out.println(strFileName);
		
	}
}

package usefulClasses;

public class StringExamine {
	public static void main(String[] args) {
		String str1 = new String("abcdefg");
		String str2 = "hijklmn";
		System.out.println(str1);
		System.out.println(str2);
		// str2를 쓰겠지만, str1의 원리를 기반으로 해두고 있음.
		
		// 문자열의 연결
		String str3 = str1 + str2;
		System.out.println(str3);
		
		str3 = str1 + "12345";
		System.out.println(str3);
		
		str3 = str1.concat(str2);
		System.out.println(str3);
		
		// valueOf 메소드 활용: 기본형값을 '문자열'로 변환
		
		String str4 = String.valueOf(3.14f);
		System.out.println(str4);
		char[] strArray = {'a', 'b', 'c', 'd', 'e'};
		String str5 = String.valueOf(strArray);
		System.out.println(str5+ " 길이: " + str5.length()); // 문자열.length()는 길이
	} 
	
	
}

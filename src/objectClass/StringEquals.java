package objectClass;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("Hi");
		String str2 = new String("Hi");
		
		if(str1 == str2)
			System.out.println("참조 대상 동일");
		else
			System.out.println("참조 대상 상이, 객체 2개.");
		
		if(str1.equals(str2))
			System.out.println("인스턴스 내용 동일");
		else
			System.out.println("인스턴스 내용 상이");
		
		// 내용이 동일한 인스턴스 2개를 str1과 str2이 각각 달리 참조하고 있음.
	}

}

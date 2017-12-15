package usefulClasses;

public class Useful {
	static int m_val;
	public static void main(String[] args) {
		
		Integer intVar1 = new Integer(123);
		int nVar = intVar1.intValue();
		System.out.println("intValue()는 객체의 값을 int형으로 전환, nVar = "+ nVar);
		
		String sVar = intVar1.toString();
		System.out.println("toSting()은 객체의 값을 문자열로 전환, sVar = "+ sVar);
		
		nVar = Integer.parseInt("300");
		System.out.println("parseInt(String s)는 문자열을 int형으로 반환, nVar = " + nVar);
		
		sVar = Integer.toString(nVar);
		System.out.println("toString(int i)는 정수값을 문자열로 변환, sVar = "+ sVar);

	}
}

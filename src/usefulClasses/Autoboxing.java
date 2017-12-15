package usefulClasses;

public class Autoboxing {
	public static void main(String[] args) {
		
		Integer intVar = 12; // 오토박싱 덕분에 new Integer(12) 라고 안 해도 인티저 클래스에 바로 정수 값 대입 가능
		int nVar = 3;
		int nTotal = nVar + intVar; // 오토박싱으로 intVar.intValue()를 해준 효과가 있음.  
		System.out.println("autoboxing: " + intVar);
		System.out.println("합 : " + nTotal);
		
		intVar++;
		System.out.println("++ autoboxing: " + intVar);
		System.out.println("return : " + add(intVar));
	}

	public static int add(Integer intVar) {
		int nVar = 10;
		intVar += nVar;
		return intVar; // 반환형은 int, 반환값은 객체값?? 오토박싱기능으로 객체값이 정수형으로 자동변환됨.
	}
}

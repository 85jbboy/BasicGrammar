package objectClass;

class Person implements Cloneable {
	String strName;
	int nAge;
	
	Person (String strName, int nAge) {
		this.strName = strName;
		this.nAge = nAge;
	}
	
	public void changeName(String strName) {
		this.strName = strName;
	}
	public void changeAge(int age) {
		nAge = age;
	}
	
	public void showPerson() {
		System.out.println("이름: "+ this.strName);
		System.out.println("나이: "+ this.nAge);
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();  
	}
}

public class StringClone {
	public static void main(String[] args) {
		Person p1 = new Person("85jbboy", 33);
		try {
			Person p2 = (Person) p1.clone();
			p2.changeName("MazERunnER");
			p2.changeAge(p1.nAge+1);
			
			p1.showPerson();
			p2.showPerson();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}

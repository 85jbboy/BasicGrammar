package CollectionClasses;

import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector myVec = new Vector();
		myVec.addElement(new Integer(3));
		myVec.addElement(new Float(3.14f));
		myVec.addElement("java");
		myVec.addElement("하이!");
		
		System.out.println(myVec);
		System.out.println(myVec.elementAt(2));
		
		myVec.removeElementAt(1);
		System.out.println(myVec);
		
		int nVar1 = (int) myVec.firstElement();
		String nVar2 = (String) myVec.lastElement();
		System.out.println(nVar1);
		System.out.println(nVar2);
		System.out.println("저장된 객체 수: " + myVec.size() );
		
		myVec.insertElementAt("a-yo", 1);
		System.out.println(myVec); 
		System.out.println("삽입 후 객체 수: " + myVec.size() );
		
		System.out.println("-------------------------");
		
		//generics로!!!!
		Vector<String> myVec2 = new Vector();
		myVec2.add("java");
		myVec2.add("programming");
		myVec2.add("android");
		myVec2.add("hope");
		myVec2.add("Jesus");
		System.out.println(myVec2);
		
		String str1 = myVec2.elementAt(2);
		System.out.println(str1);
		
		int nIndex = myVec2.indexOf("Jesus");
		System.out.println(nIndex + " " + myVec2.get(nIndex));
		
	}	
}

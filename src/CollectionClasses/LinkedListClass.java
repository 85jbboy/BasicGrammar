package CollectionClasses;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(7); 
		list1.add(6); 
		list1.add(1); 
		list1.add(5); 
		list1.add(3); 
		list1.add(4); 
		list1.add(2); 
		
		System.out.println(list1);
		
		System.out.println("첫 노드: "+ list1.getFirst());
		System.out.println("끝 노드: "+ list1.getLast());
		System.out.println("인덱스가 1인 노드: " + list1.get(1));
		System.out.println("개수: "+ list1.size());
		
		list1.remove(1);
		System.out.println(list1);
		list1.set(3, 12);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println("sort: " + list1);
		list1.clear();
		System.out.println(list1);
		System.out.println("clear한 후 개수: "+list1.size());
		
		System.out.println("---------------------------");
		//이제 더 중요한 내용! 객체 사용!!
		
		LinkedList<Person> list2 = new LinkedList<Person>();
		list2.add(new Person("Russ"));
		list2.add(new Person("Melo"));
		list2.add(new Person("PG13"));
		list2.add(new Person("Kobe"));		
		list2.add(new Person("Cupcake"));
		list2.add(new Person("Curry"));
		list2.add(new Person("Steven"));
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).strName);
		}
		
		int nSearchIndex = -1;
		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i).strName.equals("Cupcake")) {
				System.out.println(list2.get(i).strName + "을 "
						+ i + "인덱스에서 찾음");
				nSearchIndex = i;
				break;
			}
		}
		
		//삭제
		System.out.println("삭제------------------");
		list2.remove(nSearchIndex);
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).strName);
		}
		
		//삽입
		System.out.println("삽입------------------");
		list2.add(nSearchIndex, new Person("Kawhi"));
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).strName);		
		}
	}
}

class Person {
	String strName;
	public Person(String str) {
		strName = str;
	}
}


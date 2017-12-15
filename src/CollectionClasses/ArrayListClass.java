package CollectionClasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(7);
		list1.add(1);
		list1.add(5);
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(2);
		
		System.out.println("개수: "+list1.size());
		System.out.println("리스트: "+list1);
		
		Collections.sort(list1); // 오름차순 정렬
		System.out.println("sort된 list1의 리스트: " + list1);
		
		list1.set(6, 11); // 인덱스 6(7번째)에 값 11을 대입하라.
		System.out.println("list1의 리스트: " + list1);
		
		int nVar = (int) list1.get(2);
		System.out.println(nVar);
		
		list1.clear();
		System.out.println(list1);
		System.out.println("clear 후 size: "+list1.size());
		System.out.println("-----------------------------");
		//generics!!!
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("OKC");
		list2.add("NBA team");
		list2.add("Russ");
		list2.add("Melo");
		list2.add("PG");
		list2.add("hope");
		System.out.println(list2);
		
		int nIndex = list2.indexOf("Melo");
		System.out.println("index "+nIndex+" is " +list2.get(nIndex));
		list2.add(nIndex+1, "should be 2nd unit");
		System.out.println(list2);
	}

}

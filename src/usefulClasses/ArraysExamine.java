package usefulClasses;

import java.util.Arrays;

public class ArraysExamine {
	public static void main(String[] args) {
		int[] nIntArrays = {1, 4, 7, 2, 6, 3, 5};
		System.out.println("정렬전: " + Arrays.toString(nIntArrays));
		
		Arrays.sort(nIntArrays);
		System.out.println("정렬후: " + Arrays.toString(nIntArrays));
		
		System.out.println( Arrays.binarySearch(nIntArrays, 13));
		System.out.println( Arrays.binarySearch(nIntArrays, 5));
		
		Arrays.fill(nIntArrays, 1, 3 ,12);
		System.out.println("치환결과 :" + Arrays.toString(nIntArrays));
	}
}

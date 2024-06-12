package day13.api.util.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {
	
	public static void main(String[] args) {
		
//		배열 관련 클래스 Arrays
		int[] arr = {3,4,5,1,2,6,7,9,10};
		Arrays.sort(arr); // 오름차순
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr, Collections.reverseOrder()); 다만 int는 Integer[] 타입만 가능함
		
		int index = Arrays.binarySearch(arr, 4); // 정렬이 먼저 되어 있어야 함
		System.out.println("4가 있는 위치 : "+index+"번째 index");
		
		int[] arr2 = Arrays.copyOf(arr, arr.length*2); // 배열, 복사할 길이
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr, 3, 5); // 3 이상 5 미만 index까지 복사함
		System.out.println(Arrays.toString(arr3));
		
//		배열의 비교 equals
		if (Arrays.equals(arr2, arr3)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		
		
		
		
		
	}

}

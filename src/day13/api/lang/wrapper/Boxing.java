package day13.api.lang.wrapper;

import java.util.Arrays;

public class Boxing {
	
	public static void main(String[] args) {
		
//		Wrapper란?
//		기본 타입의 객체 타입을 wrapper클래스라고 함
		
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
//		Boxing - 기본 타입을 객체 타입으로 변환하는 작업
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Character val3 = new Character(c);
		Boolean val4 = new Boolean(d);
		
		System.out.println(val1);
		
		Object[] arr = {val1,val2,val3,val4}; // Wrapper는 Object의 자식이기 때문에 저장하는 게 가능해짐
 		
		
//		Unboxing - 객체 타입을 기본 타입으로 변환하는 작업
		a = val1.intValue();
		b = val2.doubleValue();
		c = val3.charValue();
		d = val4.booleanValue();
		
		
		System.out.println("------------------");
		
		
//		auto-boxing - 자동 형 변환		
		Integer x = 100; // 정수를 wrapper에 바로 저장함
		Double y = 3.14; // 실수를 wrapper에 바로 저장함
		int v1 = x; // wrapper를 정수에 저장함
		double v2 = y; // wrapper를 실수에 저장함
		
		Object[] arr2 = {1,2,3.14}; // 이것도 가능함
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println("-------------------");
		
//		Wrapper 클래스의 핵심 기능 - 문자열을 기본 타입으로 변환시켜줌
		int result1 = Integer.parseInt("3");
		double result2 = Double.parseDouble("3.13");
		long result3 = Long.parseLong("100");
		
		System.out.println(result1+result2+result3);
		
		
		
		
		
		
		
		
		
		
		
	}

}

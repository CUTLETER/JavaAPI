package day16.ramda.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass03 {

	public static void main(String[] args) {
		
		/*
		 * 스트림 타입 여러 가지
		 * Stream - 오리지널 스트림
		 * IntStream  - 정수 스트림
		 * DoubleStream - 실수 스트림
		 * LongStream - long타입 스트림
		 * 
		 * 스트림 타입의 변환
		 * mapToXXXXX()
		 */
			List<Integer> list = new ArrayList<>();
				
			for (int i=1; i<=100; i++) {
				list.add(new Random().nextInt(100)+1);
			}
			
			// 정수형 스트림으로 형 변환 + 정수에서 사용할 수 있는 메소드 추가
			long r1 = list.stream().mapToInt(t -> t).count();
			System.out.println("스트림 개수 : "+r1);
			int r2 = list.stream().mapToInt(t -> t).sum();
			System.out.println("스트림의 총합 : "+r2);
			double r3 = list.stream().mapToInt(t -> t).average().getAsDouble(); // 더블형 반환
			System.out.println("스트림 평균 : "+r3);
			int r4 = list.stream().mapToInt(t -> t).max().getAsInt();
			System.out.println("최댓값 : "+r4);
	
			int[] arr = {1,40,50,23,43,70,99,94}; 
			int r5 = Arrays.stream(arr).min().getAsInt();
			System.out.println("최소값 : "+r5);
		
			// boxed() - 원본 스트림으로 형 변환	 // 1이상 10미만
			List<Integer> list2 = IntStream.range(1, 10)/*IntStream*/.boxed()/*Stream 형 변환*/.collect(Collectors.toList());			
			System.out.println(list2.toString());
											// 1이상 10이하
			List<Integer> list3 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
			System.out.println(list3.toString());
		
			
			
		
		
		
	}
}

package day16.ramda.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass02 {

	public static void main(String[] args) {
		
		// 리스트에 랜덤한 값을 저장함
		List<Integer> list = new ArrayList<>();
		
		for (int i=1; i<=100; i++) {
			list.add(new Random().nextInt(100)+1);
		}
		System.out.println("원본 : " + list.toString());
		
		
		System.out.println("------------------------");

		
		// stream을 적용하려면 시작은 무조건 stream으로 변환 먼저 시킴
		// 중간 처리 메소드는 반환을 다시 stream으로 함 .찍으면 또 다른 메소드 쓸 수 있음
		list.stream().distinct().forEach(a -> System.out.print(a+" ")); // 중복 숫자 제거됨 - distinct()
		
		System.out.println();
		
		
		// 컬렉터 -> 다시 컬렉션으로 반환받기
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList()); // toList() - List타입 반환 , toSet() - Set 타입 반환
		System.out.println(newList.toString());
		
		
		// filter() - 원하는 값만 걸러내기
/*		list.stream().filter(new Predicate<T>() {

			@Override
			public boolean test(T t) {
				// TODO Auto-generated method stub
				return false;
			}
		}); 아래처럼 줄여씀
*/		
		// filter() - 리턴에 true인 값만 필터링
		list.stream().filter(t -> /*return*/ t %2 == 0).forEach(t -> System.out.print(t+" "));
		
		System.out.println();
		
		// sorted = 오름차순 정렬
		list.stream().filter(t -> /*return*/ t%2 == 0).sorted().forEach(t -> System.out.print(t+" "));
		
		
		System.out.println();
		
		
		// map - 리턴에 담긴 값으로 새로운 Stream을 생성함
/*		list.stream().map(new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				// TODO Auto-generated method stub
				return null;
			}
		});  아래처럼 줄여씀
*/			List<String> list2 = list.stream().map(a -> /*return*/ a % 2 == 0 ? "짝" : "홀").collect(Collectors.toList());		
			System.out.println(list2.toString());
		
			System.out.println("------------------------------------");
		
			/*
			 * 원본 list를 가지고
			 * 중복은 제거하고 65보다는 큰 수들만 정렬해서 이 값들을 아스키코드 문자로 반환하여 리스트로 생성하기
			 */
			
			List<Character> list3 = list.stream().distinct().filter(t -> t>=65).sorted().map(a -> (char)a.intValue()).collect(Collectors.toList());
			System.out.println(list3.toString());
	}

}

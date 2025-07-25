package w0203_stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamEx1 {
	public static void main(String[] args) {
//		int[] n= {1,2,3,4,5,6};
//		for(int i:n) {
//			System.out.println(i);
//		}
		
//		Arrays.asList(1,2,3,4,5,6).stream().forEach(System.out::println);
		
//		Arrays.asList(1,2,3,4).stream()
//		.map(i->i*i)
//		.forEach(System.out::println);
		
//		Arrays.asList(1,2,3,4,5,6).stream()
//		.limit(3)
//		.forEach(System.out::println);
		
//		Arrays.asList(1,2,3,4,5,6).stream()
//		.skip(2)
//		.forEach(System.out::println);   // 3 4 5 6
		
//		Arrays.asList(1,2,3,4,5,6).stream()
//		.filter(i->i%2==0)
//		.forEach(System.out::println);   // 2 4 6
		
//		Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8), Arrays.asList(9,10)).stream()
//		.flatMap(i->i.stream())
//		.forEach(j->System.out.printf(j+" "));
		
//		Arrays.asList(Arrays.asList(1,2,3,4).stream()
//		.reduce((a,b)->a+b)
//		.get())
//		.forEach(System.out::println);
		
//		Arrays.asList(1,2,3,4,5).stream()
//		.collect(Collectors.toList())
//		.forEach(System.out::println);		
		
		//[문제 1] 1 ~ 10까지 3의 배수만 출력하시오
		Arrays.asList(1,2,3,4,5,6,7,8,9,10)
		.stream()
		.filter(i->i%3==0)
		.forEach(System.out::println);
	}
}










package w0203_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamEx3 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("kim", 90));
		list.add(new Student("lee", 65));
		list.add(new Student("park", 100));
		list.add(new Student("hong", 75));
		list.add(new Student("kang", 80));
		
		System.out.println("*** 정렬 전 ***");
		list.forEach((ob)->System.out.println(ob.getName()+"  " +ob.getTot()));
		
		// 점수순으로 내림차순 정렬하시오-------------------------------
		System.out.println("*** 정렬 후(점수로 내림차순) ***");
//		list.sort((o1,o2)->o2.getTot() - o1.getTot());
//		list.forEach((ob)->System.out.println(ob.getName()+"  " +ob.getTot()));
		
		list.stream()
		.sorted((o1, o2) -> o2.getTot() - o1.getTot())
		.forEach(System.out::println);
		
		// 이름순으로 오름차순 정렬하시오-------------------------------
		System.out.println("*** 정렬 후(이름으로 오름차순) ***");
//		list.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));
//		list.forEach((ob)-> System.out.println(ob.toString()));
		
		list.stream()
		.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
		.forEach(System.out::println);
	}
}
/*
[출력 결과]
*** 정렬 전 ***
kim   90
lee   65
   :

*** 정렬 후(점수로 내림차순) ***
park  100
kim    90
    :

*** 정렬 후(이름으로 오름차순) ***
hong    75
kang    80
     :

[참고]
System.out.println("*** 정렬 후(이름으로 오름차순) ***");
Collections.sort(list, new Comparator<Student>() {
	@Override
	public int compare(Student o1, Student o2) {
		//return o2.getTot() - o1.getTot();            // 점수로 내림차순
		return o2.getName().compareTo(o1.getName());   // 이름으로 오름차순
	}
});
list.forEach((ob)-> System.out.println(ob.getName() +"  " + ob.getTot()));
		
//System.out.println((int)'m' + "   "+(int)'p');  // 109  112
*/
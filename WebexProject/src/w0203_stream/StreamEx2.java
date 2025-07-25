package w0203_stream;

import java.util.ArrayList;
import java.util.List;

//인자 2개받는 생성자, setter/getter, toString()추가
class Student{
	private String name;
	private int tot;
	
	public Student(String name, int tot) {
		super();
		this.name = name;
		this.tot = tot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	@Override
	public String toString() {
		return "이름: " + name + "  점수: " + tot;
	}
}
public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("kim", 90));
		list.add(new Student("lee", 65));
		list.add(new Student("park", 100));
		list.add(new Student("hong", 75));
		list.add(new Student("kang", 80));
		
		// 객체중에 점수가 90점 이상인 학생만 출력(filter)
		list.stream()
		.filter(i->i.getTot() >= 90)
//		.forEach(System.out::println);    // toString()을 호출
		.forEach(i -> {
			System.out.println(i.getName() +"  " + i.getTot());
		});
		
		System.out.println("==================");
		//--------------------------------------------------------------------
		// 앞에서 부터 3객체 까지만 출력(limit)
		list.stream().limit(3).forEach(System.out::println);
		System.out.println("==================");
		//--------------------------------------------------------------------
		// 점수를 50점 만점으로 환산하시오(map)
//		list.stream()
//        .map(i -> {
//            i.setTot(i.getTot()/2); 
//            return i; 
//        })
//        .forEach(System.out::println);
		
//		list.stream().map((x) -> new Student(x.getName(), x.getTot() / 2)).forEach(System.out::println);
		
		list.forEach(i -> i.setTot((int)(i.getTot()*0.5)));
		list.forEach(i -> System.out.println(i.toString()));	
	}
}











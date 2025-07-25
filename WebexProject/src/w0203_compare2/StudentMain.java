package w0203_compare2;

import java.util.Arrays;

//Comparable - 기본 정렬기준을 구현하는데 사용
//기본생성자, 인자3개받는 생성자, toString추가
class Student implements Comparable<Student>{
	String name;
	int num;
	double score;
	
	public Student() {
		super();
	}
	public Student(String name, int num, double score) {
		super();
		this.name = name;
		this.num = num;
		this.score = score;
	}
	@Override
	public String toString() {
		return name + " " + num +" "+score;
	}
	@Override
	public int compareTo(Student o) {
//		return this.name.compareTo(o.name);           //이름으로 오름차순
//		return Double.compare(o.score, this.score);   //학점으로 내림차순
		
		//학점으로 내림차순정렬하시오. 만약,학점이 같으면 이름으로 오름차순정렬하시오
		if(Double.compare(this.score, o.score)==0) {
			return this.name.compareTo(o.name);
		}
		return Double.compare(o.score, this.score);
	}
}
public class StudentMain {
	public static void main(String[] args) {
		Student[] s=new Student[5];
		s[0]=new Student("Dave",20170301, 4.5);
		s[1]=new Student("Amie",20160301, 3.5);
		s[2]=new Student("Emma",20180301, 2.5);
		s[3]=new Student("Brad",20150301, 4.5);
		s[4]=new Student("Cara",20150302, 3.5);
		
		Arrays.sort(s);
		Arrays.asList(s).forEach((ob)->System.out.println(ob));
	}
	
}

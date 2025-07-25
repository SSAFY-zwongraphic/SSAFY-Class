package w0205_object;

import java.io.Serializable;

//생성자 2개, +disp():void 추가
public class User implements Serializable{
	private String name;
	private int age;
	private double score;
	
	public User() {
		super();
	}
	public User(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public void disp() {
		System.out.print("이름:"+name);
		System.out.print("  나이:"+age);
		System.out.println("  점수:"+score);
	}
}

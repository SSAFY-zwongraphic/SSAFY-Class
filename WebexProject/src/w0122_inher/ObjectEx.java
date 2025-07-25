package w0122_inher;

class Exam{
	public String str="Hello";
	
	public void view() {
		System.out.println(str);
	}
}
public class ObjectEx {
	public static void main(String[] args) {
		new Exam().view();
	}
}

//-------------------------------------------------
/*
import java.lang.String;
import java.lang.System;

class Exam extends Object{
	public String str="Hello";
	
	public Exam() {
		super();
	}
	
	public void view() {
		System.out.println(this.str.toString());
	}
}
public class ObjectEx {
	public static void main(String[] args) {
		Exam ob=new Exam();
		ob.view();
	}
}
*/
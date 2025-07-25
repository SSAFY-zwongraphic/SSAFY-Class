package w0122_inher;

class Test {
	int a;
	int b;
	static int c;

	static {
		System.out.println("static 초기화 영역");
	}
	
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		Test.c = c;
		System.out.println("객체 초기화 영역");
	}

	public void view() {
		System.out.println(a + " " + b + " " + c);
	}
}
public class StaticEx1 {
	public static void main(String[] args) {
		Test ob1 = new Test(1, 2, 3);
		Test ob2 = new Test(5, 6, 7);
		Test.c=200;    //ob1.c=100;  (권장 X)
		
		ob1.view();
		ob2.view();
	}
}









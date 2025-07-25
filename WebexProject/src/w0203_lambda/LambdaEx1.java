package w0203_lambda;

//람다식 형태-----------------------------------------
public class LambdaEx1{
	
	public static void main(String[] args) {
		Print m=()-> System.out.println("Hello Lambda");
		m.view();
	}
}
//익명 중첩클래스(anonymous inner class)-----------------
/*
public class LambdaEx1{
	
	public static void main(String[] args) {
		Print m=new Print() {
			
			@Override
			public void view() {
				System.out.println("Hello Lambda");
			}
		};
		m.view();
	}
}
*/
// LambdaEx1.class / LambdaEx1$1.class
//일반메서드 형태----------------------------------------
/*
public class LambdaEx1 implements Print{
	@Override
	public void view() {
		System.out.println("Hello Lambda");
	}
	
	public static void main(String[] args) {
		new LambdaEx1().view();
	}
}
*/
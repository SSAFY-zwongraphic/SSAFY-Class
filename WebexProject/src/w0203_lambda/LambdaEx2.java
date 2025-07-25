package w0203_lambda;

//람다식---------------------------------------------------
public class LambdaEx2 {
	public static void main(String[] args) {
		new Thread(()-> System.out.println("Hello Thread")).start();
	}
}
//익명함수-------------------------------------------------
/*
public class LambdaEx2 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello Thread");
			}			
		}).start();
	}
}
*/
//일반 메서드--------------------------------------------
/*
class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello Thread");
	}
}
public class LambdaEx2 {
	public static void main(String[] args) {
		new Thread(new MyThread()).start();
		
//		MyThread ob=new MyThread();
//		Thread th=new Thread(ob);
//		th.start();
	}
}
*/
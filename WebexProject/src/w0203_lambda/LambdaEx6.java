package w0203_lambda;

@FunctionalInterface
interface Calculate{
	public int calc(int a, int b);
	
	default public double calc(double a, double b) {  //default는 여러개 정의할수 있다
		return a/b;
	}
}
public class LambdaEx6 {
	public static void main(String[] args) {
		Calculate f1=(a,b) -> a+b;
		Calculate f2=(a,b) -> a-b;
		Calculate f3=(a,b) -> a*b;
		
		System.out.println("더하기 : " + f1.calc(2, 5));
		System.out.println("뺴기기 : " + f2.calc(2, 5));
		System.out.println("곱하기 : " + f3.calc(2, 5));
		System.out.println("나누기 : " + f1.calc(2.0, 5.0));
	}
}

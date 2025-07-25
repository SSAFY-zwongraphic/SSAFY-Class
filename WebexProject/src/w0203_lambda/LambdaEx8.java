package w0203_lambda;

@FunctionalInterface
interface Calculate2{
	public int calc(int a,int b);
}
public class LambdaEx8 {
	public static void main(String[] args) {
		Calculate2 m1=(a,b)->a+b;
		Calculate2 m2=(a,b)->a-b;
		
		int m3=m1.calc(10, 20) + m2.calc(30, 40);
		System.out.println("결과: " + m3);
	}
}

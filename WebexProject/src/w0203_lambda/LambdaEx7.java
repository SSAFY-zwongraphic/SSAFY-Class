package w0203_lambda;

/*
[문제] 람다식으로 작성하시오 (Area)
조건1) 원의넓이는 추상함수로 만들것 (size)
조건2) 사각형의넓이, 사다리꼴의넓이는 기본형으로 만들어서 작성하시오

[결과] 
원의 넓이:  314     <--- size(10)
사각형의넓이: 20     <--- size(4,5)
사다리꼴의넓이:31.5   <--- size(3,6,7)
*/
@FunctionalInterface
interface Area{
	public int size(int a);
	
	default public double size(int a, int b) {
		return a * b;
	}
	default public double size(int a, int b, int c) {
		return (a + b) * c / 2.0;
	}
}
public class LambdaEx7 {
	public static void main(String[] args) {
		Area m = (a) -> (int)(3.14 * a * a);
		System.out.println("원의 넓이: " + m.size(10));
		System.out.println("사각형의 넓이: " + m.size(4,5));
		System.out.println("사다리꼴의 넓이: " + m.size(3,6,7));
	}
}

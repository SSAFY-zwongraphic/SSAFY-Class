package w0203_lambda;

@FunctionalInterface
interface Ver{
	public String call(String v);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		Ver m1=(v1)-> "Java " + v1;
		System.out.println(m1.call("ver 17"));
		
		Ver m2=(v)-> "Spring " + v;
		System.out.println(m2.call("ver 5.0"));
		
		// equals를 사용해서 "자바"이면  "Java 17", 그렇지 않으면 "Spring 5.0" 출력
		Ver m3=(s)-> s.equals("자바")? "Ver 17" : "Ver 5.0";
		System.out.println("Java " + m3.call("자바"));
	}
}
//Java ver 17
//Spring ver 5.0
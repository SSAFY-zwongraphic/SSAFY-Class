package w0204_exception;

//사용자 정의 예외처리
/*
A
A는 소문자로 a입니다

a
a는 대문자로 A입니다

+
Exception in thread "main" w0125.exception.NotAlphabet: +는 영문 대문자 또는 소문자가 아닙니다
	at w0125.exception.ExceptionEx3.main(ExceptionEx3.java:19)
*/
class NotAlphabet extends Exception{
	public NotAlphabet(char alpa) {
		super(alpa + "는 영문 대문자 또는 소문자가 아닙니다");
	}
}
public class ExceptionEx4 {
	public static void main(String[] args){
		char alpa=args[0].charAt(0);
		try {
			if(alpa>='A' && alpa<='Z') {
				System.out.println(alpa + "는 소문자로 " + (char)(alpa+32) + "입니다");
			}else if(alpa>='a' && alpa<='z') {
				System.out.println(alpa + "는 대문자로 " + (char)(alpa-32) + "입니다");
			}else {
				throw new NotAlphabet(alpa);
			}
		}catch(NotAlphabet e) {
			e.printStackTrace();
		}
	}
}

/*
public class ExceptionEx4 {
	public static void main(String[] args) throws NotAlphabet {
		char alpa=args[0].charAt(0);
		
		if(alpa>='A' && alpa<='Z') {
			System.out.println(alpa + "는 소문자로 " + (char)(alpa+32) + "입니다");
		}else if(alpa>='a' && alpa<='z') {
			System.out.println(alpa + "는 대문자로 " + (char)(alpa-32) + "입니다");
		}else {
			throw new NotAlphabet(alpa);
		}
	}
}
*/















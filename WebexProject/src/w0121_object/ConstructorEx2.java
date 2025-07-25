package w0121_object;

public class ConstructorEx2 {
	
	public ConstructorEx2() {
		this("ABC",100);                             // 3
		System.out.println("default constructor");   // 5
	}
	
	public ConstructorEx2(String str) {
		this();                                      // 2
		System.out.println(str + " constructor");    // 6 
	}
	
	public ConstructorEx2(String str, int n) {
		System.out.println(str + " " + n +" constructor");  // 4  
	}
	
	public static void main(String[] args) {
		new ConstructorEx2("ABC");        // 1, 7
	}
}
/*
	ABC 100 constructor   
	default constructor
	ABC constructor
*/
//----------------------------------------------------------------------
/*
public class ConstructorEx2 {
	public ConstructorEx2() {
		System.out.println("default constructor");   // 4
	}
			
	public ConstructorEx2(String str) {
		this();                                      // 3
		System.out.println(str + " constructor");    // 5
	}
	
	public ConstructorEx2(String str, int n) {
		this(str);                                   // 2
		System.out.println(str + " " + n + " constructor"); // 6
	}
	
	public static void main(String[] args) {
		new ConstructorEx2("ABC", 100);    // 1, 7
	}
}*/
/*
	default constructor
	ABC constructor
	ABC 100 constructor
*/

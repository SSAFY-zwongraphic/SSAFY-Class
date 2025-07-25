package w0131_string;

public class StringBufferEx {
	public static void main(String[] args) {
//		String buf="abc";
//		buf+="123";
//		buf+="xyz";
//		System.out.println(buf);		
		//------------------------------------------------------------------
		StringBuffer buf=new StringBuffer();  // 또는  StringBuilder
		buf.append("abc");
		buf.append("123");
		buf.append("가나다");
		System.out.println("용량:" + buf.capacity());
		System.out.println("길이:" + buf.length());
		System.out.println("test1: " + buf);
		
		buf.reverse();
		System.out.println("test2: " + buf);
		
		buf.delete(3, 6);
		System.out.println("test3: " + buf);
		
		System.out.println("길이:" + buf.length());
		
		buf.trimToSize();   //불필요한 용량 줄이기
		System.out.println("용량:" + buf.capacity());		
	}
}

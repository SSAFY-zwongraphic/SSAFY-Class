package w0131_collection;

import java.util.ArrayList;
import java.util.List;

//컴파일의 문제는 없으나 실행시에 형변환의 문제가 발생할수 있다
public class ListError {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(Integer.valueOf(10));
		list.add("겨울");
		list.add(4.0);
		
		for(int i=0; i<list.size(); i++) {
			String s=(String)list.get(i); //13번째 라인에서 오류 발생(ClassCastException)
			System.out.println(s);
		}
	}
}






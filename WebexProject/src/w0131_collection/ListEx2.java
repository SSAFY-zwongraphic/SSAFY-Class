package w0131_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("one");
		list.add(2);     
		list.add(3.0f);  
		list.add(2);
		list.add(4.0f);
		list.add(4.00);
		list.add(new String("one"));
		System.out.println(list);
		
		for(Object  ob : list) {
			System.out.println(ob);
		}
		
//		Iterator<Object> iter=list.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
	}
}

package w0131_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set: 중복허용X, 순서유지X
public class SetEx {
	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set set=new HashSet();
		set.add("one");
		set.add(2);     // int(primitive type: 기본형) --> Integer.toString(2)
		set.add(3.0f);  // Flaot.toString(3.0f)
		set.add(2);
		set.add(4.0f);
		set.add(4.00);
		set.add(new String("one"));
		System.out.println(set);
		
		@SuppressWarnings("rawtypes")
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}





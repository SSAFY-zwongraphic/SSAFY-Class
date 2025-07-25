package w0131_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoNumber {
	public static void main(String[] args) {
		Set<Integer> lotto=new HashSet<>();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45+1));  //  1 - 45사이의 수 6개
		}
		
		List<Integer> lot=new ArrayList<>(lotto);
		Collections.sort(lot);
		Collections.reverse(lot);
		
		for(Integer ob:lot) {
			System.out.print(ob+"  ");
		}
	}
}






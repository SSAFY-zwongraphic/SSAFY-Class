package w0131_string;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str="학교,집,학원,,게임방,술집,도서관";
		String[] values=str.split(",");   // split은 구분자를 1개만 사용
		
		for(int i=0; i<values.length; i++)
		{
			System.out.println(values[i]);
		}
	//---------------------------------------------------------------------------
//		String str = "학교,집,학원 게임방#술집$도서관";
//
//		StringTokenizer tokens = new StringTokenizer(str, ", #$"); // 구분자: , # $
//		System.out.println("파싱할 문자열의 수:" + tokens.countTokens() + "개");
//
//		while (tokens.hasMoreElements()) {
//			System.out.println(tokens.nextToken());
//		}   
	} 
}









package w0205_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.print("Input String:");
		String str=br.readLine();    // 속도향상
		System.out.println(str);
		
		isr.close();
		br.close();
		//----------------------------------------------------------------
/*		
		InputStreamReader isr=new InputStreamReader(System.in);
		System.out.print("Input String:");
		char ch='\0';
		
		while(ch != '\n') {
			ch=(char)isr.read();      //문자스트림(InputStreamReader),한글처리O
			System.out.print(ch);
		}
*/		
		//-----------------------------------------------------------------
/*		System.out.print("Input String:");
		char ch='\0';
		
		while(ch != '\n') 
		{
			ch=(char)System.in.read(); //바이트스트림(InputStream),한글처리X
			System.out.print(ch);
		}
*/			
	} 
}

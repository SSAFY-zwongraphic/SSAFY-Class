package w0205_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BufferedReader br=new BufferedReader(new FileReader("src/w0205_file/data1.txt"));
		
		String str;
		while((str=br.readLine()) != null)
		{
			System.out.println(str);
			Thread.sleep(100);  
		}
		
		br.close();
		//----------------------------------------------------------------------
/*		InputStreamReader is=new FileReader("src/w0205_file/data1.txt");
		
		int str;
		while(true)
		{
			str=is.read();   // character 로 읽는다. 한글 처리 가능
			if(str==-1)      // -1 (End Of File: 파일의 끝)
				break; 
			
			System.out.print((char)str);
			Thread.sleep(100);  
		}
		is.close();
*/		
		//--------------------------------------------------------------------
/*		InputStream is=new FileInputStream("src/w0205_file/data1.txt");
		
		int str;
		while(true)
		{
			str=is.read();   // byte로 읽는다. 한글 깨짐
			if(str==-1)      // -1 (End Of File: 파일의 끝)
				break; 
			
			System.out.print((char)str);
			Thread.sleep(100);  // 100/1000=0.1초
		}
		is.close();		
*/		
	}
}

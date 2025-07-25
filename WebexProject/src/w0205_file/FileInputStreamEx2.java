package w0205_file;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//Reader <---- InputStreamReader  <--- FileReader
public class FileInputStreamEx2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Reader ob=new FileReader("src/w0205_file/data2.txt");
		
		int ch;
		while((ch=ob.read()) != -1) {
			System.out.print((char)ch);
			Thread.sleep(100);
		}
		ob.close();
	}
}

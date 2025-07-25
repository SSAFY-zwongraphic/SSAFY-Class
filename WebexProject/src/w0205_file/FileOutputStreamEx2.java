package w0205_file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream out=new FileOutputStream("src/w0205_file/data2.txt");
		int val;
		
		System.out.println("문자열을 입력하고 마지막줄에서 CTRL+Z로 종료하세요");
		while((val=System.in.read()) != -1)
		{
			out.write(val);
		}
		out.flush();
		out.close();
		System.out.println("data2.txt로 저장했습니다");
	}
}

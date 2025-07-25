package w0205_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		OutputStream out=new FileOutputStream("src/w0205_file/data1.txt");
		
		String name="홍길동";
		int age=25;
		double tall=183.4;
		
		out.write(name.getBytes());          // out.write(name);  이렇게 출력하면 안됨
		out.write(Integer.toString(age).getBytes());
		out.write(Double.toString(tall).getBytes());
		
		//출력 byte stream filtering
		PrintStream ps=new PrintStream(out);
		ps.printf("\n\n\r이름:%s  나이:%d  키:%.1f\n",name,age,tall);
				
		//출력 character stream filtering
		PrintWriter pw=new PrintWriter(out);
		pw.printf("\n\n\rname:%s  age:%d  tall:%.1f\n",name,age,tall);
		pw.flush();
		
		System.out.println("data1.txt로 저장했습니다");
//		pw.close();
//		ps.close();		
		out.close();
	}
}









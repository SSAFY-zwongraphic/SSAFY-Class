package w0205_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
[경로]
절대경로: 루트(root)를 기준으로 파일을 찾는다
상대경로: 현재위치를 기준으로 파일을 찾는다
         ./   --> 현재위치(생략가능)
         ../  --> 상위(한 단계 위로)
         /    --> 루트(최상위)
*/
public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		//FileWriter w=new FileWriter("C:/ssafy_13/workspace/javawork/Test2/storage/data3.txt");  //절대경로
		//FileWriter w=new FileWriter("./storage/data4.txt");   //상대경로
		File f=new File("storage/data5.txt");
		Writer w=new FileWriter(f);	
		
		StringBuilder str=new StringBuilder();
		str.append("동해물과 백두산이 마르고 닳도록\n");
		str.append("하느님이 보우하사 우리나라 만세\n");
		str.append("무궁화 삼천리 화려강상\n");
		str.append("대한사람 대한으로 길이 보전하세\n");
		
		w.write(str.toString());
		w.close();
		System.out.println("저장했습니다");
	}
}

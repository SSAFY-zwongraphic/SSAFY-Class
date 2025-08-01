package w0731_gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
// http://mvnrepository.com

public class GSONTest {
	
	public GSONTest() {
		BufferedReader reader = null;
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String s = "";
			while((s = reader.readLine()) != null) {
				sb.append(s).append("\n");
			}
			s = sb.toString();
			Gson gson = new Gson();
			//TypeToken: JSON 형태의 배열데이터를 자바객체로 받을때 사용하는 코드
			ArrayList<Todo> list = gson.fromJson(s,new TypeToken<ArrayList<Todo>>() {}.getType());
			for(Todo t : list) {
				System.out.println(t);
			}
			System.out.println(conn.getResponseCode());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new GSONTest();
	}
}
/*
[라이브러리]
https://mvnrepository.com에서 검색 gson
*/













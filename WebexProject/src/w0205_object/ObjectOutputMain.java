package w0205_object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputMain {
	public static void main(String[] args) {
		User ob1=new User("민들래",20,89.5);
		User ob2=new User("개나리",22,73.5);
		
		//IO Stream (직렬화)
		try {
		ObjectOutputStream oos=
				new ObjectOutputStream(new FileOutputStream("storage/user.txt"));
		oos.writeObject(ob1);
		oos.writeObject(ob2);
		
		System.out.println("저장되었습니다");
		oos.close();
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}




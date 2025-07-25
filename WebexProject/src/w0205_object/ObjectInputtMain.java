package w0205_object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputtMain {
	public static void main(String[] args) {
		//IO Stream (역직렬화)
		try {
			ObjectInputStream oos=
					new ObjectInputStream(new FileInputStream("storage/user.txt"));
			User ob1 = (User)oos.readObject();
			User ob2 = (User)oos.readObject();
			
			ob1.disp();
			ob2.disp();			
			oos.close();
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
}

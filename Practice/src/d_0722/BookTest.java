package d_0722;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.isbn = "1";
		b1.title = "���";
		b1.author = "�����";
		b1.publisher = "����";
		b1.price = 11700;
		b1.desc = "����� ���� å";
		Book b2 = new Book("2", "�ں�����", "EBS", "�������ǻ�", 19800, "�ں����ǿ� ���� �����ϴ� å");
		System.out.println("**********�������**********");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}

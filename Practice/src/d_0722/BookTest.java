package d_0722;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.isbn = "1";
		b1.title = "모순";
		b1.author = "양귀자";
		b1.publisher = "쓰다";
		b1.price = 11700;
		b1.desc = "사랑에 대한 책";
		Book b2 = new Book("2", "자본주의", "EBS", "가나출판사", 19800, "자본주의에 대해 설명하는 책");
		System.out.println("**********도서목록**********");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}

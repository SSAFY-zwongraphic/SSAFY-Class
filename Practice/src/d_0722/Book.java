package d_0722;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;

	Book() {
	}

	Book(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	public String toString() {
		return String.format("%s\t| %s\t\t| %s\t\t| %s\t\t| %d\t| %s\t", isbn, title, author, publisher, price, desc);
	}
}

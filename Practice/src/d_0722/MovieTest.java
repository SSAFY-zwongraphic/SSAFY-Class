package d_0722;

public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.id = 1;
		m1.title = "라따뚜이";
		m1.director = "브래드 버드";
		m1.genre = "코미디";
		m1.runningTime = 115;
		Movie m2 = new Movie(2, "트루먼쇼", "피터 위어", "코미디", 103);
		m1.printInfo();
		m2.printInfo();
	}
}

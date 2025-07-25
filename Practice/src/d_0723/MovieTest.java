package d_0723;

import d_0723.Movie;

public class MovieTest {
	public static void main(String[] args) {
		//A
		Movie m1 = new Movie();
		m1.setId(1);
		m1.setTitle("라따뚜이");
		m1.setDirector("브래드 버드");
		m1.setGenre("코미디");
		m1.setRunningTime(115);
		Movie m2 = new Movie(2, "트루먼쇼", "피터 위어", "코미디", 103);
		System.out.println(m1.toString());
		System.out.println(m2.toString());

		
		//B
		MovieManager mm = new MovieManager();
		mm.add(m1);
		mm.add(m2);
		for (int i = 0; i < mm.size; i++) {
			System.out.println(mm.getList()[i]);
		}
		//C
		System.out.println(mm.searchByTitle("라따뚜이"));
	}
}

package d_0728;

import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Movie m1 = new Movie();
		m1.setId(1);
		m1.setTitle("라따뚜이");
		m1.setDirector("브래드 버드");
		m1.setGenre("코미디");
		m1.setRunningTime(115);
		Movie m2 = new Movie(2, "트루먼쇼", "피터 위어", "코미디", 103);
		Movie m3 = new SeriesMovie(3, "가디언즈 오브 갤럭시", "제임스 건", "액션", 122, 1, "스타로드의 아빠를 찾아서");
		Movie m4 = new SeriesMovie(4, "가디언즈 오브 갤럭시", "제임스 건", "액션", 136, 3, "로켓의 과거에 대하여");

		MovieManagerImpl mm = MovieManagerImpl.getInatance();
		mm.add(m1);
		mm.add(m2);
		mm.add(m3);
		mm.add(m4);

		System.out.println("**********전체영화**********");
		for (Movie m : mm.getList()) {
			System.out.println(m);
		}

		System.out.println("**********일반 영화**********");
		for (Movie m : mm.getMovies()) {
			System.out.println(m);
		}

		System.out.println("**********시리즈 영화**********");
		for (Movie m : mm.getSeriesMovies()) {
			System.out.println(m);
		}

		System.out.println("**********평균상영시간**********");
		System.out.println((int) mm.getRunningTimeAvg() + "분\n");

		System.out.println("**********영화검색**********");
		System.out.print("검색할 영화 제목을 입력하세요: ");
		String text = sc.next();
		for (Movie m : mm.searchByTitle(text)) {
			System.out.println(m);
		}
	}
}

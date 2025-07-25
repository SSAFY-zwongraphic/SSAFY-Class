package d_0722;

public class Movie {
	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	Movie() {}
	
	Movie(int id, String title, String director, String genre, int runningTime){
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	void printInfo() {
		System.out.println("아이디: " + id);
		System.out.println("영화제목: " + title);
		System.out.println("영화감독: " + director);
		System.out.println("영화장르: " + genre);
		System.out.println("러닝타임: " + runningTime);
		System.out.println();
	}
}

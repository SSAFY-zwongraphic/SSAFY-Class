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
		System.out.println("���̵�: " + id);
		System.out.println("��ȭ����: " + title);
		System.out.println("��ȭ����: " + director);
		System.out.println("��ȭ�帣: " + genre);
		System.out.println("����Ÿ��: " + runningTime);
		System.out.println();
	}
}

package d_0722;

public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.id = 1;
		m1.title = "�������";
		m1.director = "�귡�� ����";
		m1.genre = "�ڹ̵�";
		m1.runningTime = 115;
		Movie m2 = new Movie(2, "Ʈ��ռ�", "���� ����", "�ڹ̵�", 103);
		m1.printInfo();
		m2.printInfo();
	}
}

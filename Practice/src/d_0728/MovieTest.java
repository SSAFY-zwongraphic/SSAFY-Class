package d_0728;

import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Movie m1 = new Movie();
		m1.setId(1);
		m1.setTitle("�������");
		m1.setDirector("�귡�� ����");
		m1.setGenre("�ڹ̵�");
		m1.setRunningTime(115);
		Movie m2 = new Movie(2, "Ʈ��ռ�", "���� ����", "�ڹ̵�", 103);
		Movie m3 = new SeriesMovie(3, "������� ���� ������", "���ӽ� ��", "�׼�", 122, 1, "��Ÿ�ε��� �ƺ��� ã�Ƽ�");
		Movie m4 = new SeriesMovie(4, "������� ���� ������", "���ӽ� ��", "�׼�", 136, 3, "������ ���ſ� ���Ͽ�");

		MovieManagerImpl mm = MovieManagerImpl.getInatance();
		mm.add(m1);
		mm.add(m2);
		mm.add(m3);
		mm.add(m4);

		System.out.println("**********��ü��ȭ**********");
		for (Movie m : mm.getList()) {
			System.out.println(m);
		}

		System.out.println("**********�Ϲ� ��ȭ**********");
		for (Movie m : mm.getMovies()) {
			System.out.println(m);
		}

		System.out.println("**********�ø��� ��ȭ**********");
		for (Movie m : mm.getSeriesMovies()) {
			System.out.println(m);
		}

		System.out.println("**********��ջ󿵽ð�**********");
		System.out.println((int) mm.getRunningTimeAvg() + "��\n");

		System.out.println("**********��ȭ�˻�**********");
		System.out.print("�˻��� ��ȭ ������ �Է��ϼ���: ");
		String text = sc.next();
		for (Movie m : mm.searchByTitle(text)) {
			System.out.println(m);
		}
	}
}

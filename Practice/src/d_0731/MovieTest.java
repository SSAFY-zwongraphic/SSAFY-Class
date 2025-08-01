package d_0731;

import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �̱��� ��ü ȣ�� (���ο��� loadData() �����)
		MovieManagerImpl mm = MovieManagerImpl.getInatance();

		// �׽�Ʈ�� �߰� ������ ����
		Movie m1 = new Movie(1, "�������", "�귡�� ����", "�ڹ̵�", 115);
		Movie m2 = new Movie(2, "Ʈ��ռ�", "���� ����", "�ڹ̵�", 103);
		Movie m3 = new SeriesMovie(3, "������� ���� ������", "���ӽ� ��", "�׼�", 122, 1, "��Ÿ�ε��� �ƺ��� ã�Ƽ�");
		Movie m4 = new SeriesMovie(4, "������� ���� ������", "���ӽ� ��", "�׼�", 136, 3, "������ ���ſ� ���Ͽ�");

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

		mm.saveData();
		System.out.println("\n��ȭ �����Ͱ� movie.dat ���Ͽ� ����Ǿ����ϴ�.");

		sc.close();
	}
}

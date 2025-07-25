package d_0721;

import java.util.Scanner;

public class GameTest {
	static Scanner sc = new Scanner(System.in);
	static int draw = 0;
	static int win = 0;
	static int lose = 0;

	public static void main(String[] args) {
		System.out.println("1. 5�� 3��");
		System.out.println("2. 3��  2��");
		System.out.println("3. 1�� 1��\n");
		System.out.print("��ȣ�� �Է��ϼ���.");

		int num = sc.nextInt();

		switch (num) {
		case 1:
			for (int i = 0; i < 5; i++) {
				int user = StrToInt();
				String result = rsp(user);
				System.out.println(result);

				if (win == 3) {
					System.out.println("����� ��!!!");
					break;
				} else if (lose == 3) {
					System.out.println("��ǻ�� ��!!!");
					break;
				} else if (draw == 3) {
					System.out.println("�¸��ڰ� �����ϴ�.");
					break;
				}
			}
			if (win < 3 && lose < 3 && draw < 3) {
				System.out.println("�¸��ڰ� �����ϴ�.");
			}
			break;
		case 2:
			for (int i = 0; i < 3; i++) {
				int user = StrToInt();
				String result = rsp(user);
				System.out.println(result);

				if (win == 2) {
					System.out.println("����� ��!!!");
					break;
				} else if (lose == 2) {
					System.out.println("��ǻ�� ��!!!");
					break;
				} else if (draw == 2) {
					System.out.println("�¸��ڰ� �����ϴ�.");
					break;
				}
			}
			if (win < 2 && lose < 2 && draw < 2) {
				System.out.println("�¸��ڰ� �����ϴ�.");
			}
			break;
		case 3:
			int user = StrToInt();
			String result = rsp(user);
			System.out.println(result);
			if (win == 1) {
				System.out.println("����� ��!!!");
				break;
			} else if (lose == 1) {
				System.out.println("��ǻ�� ��!!!");
				break;
			} else if (draw == 1) {
				System.out.println("�¸��ڰ� �����ϴ�.");
				break;
			}
			break;
		default:
			break;
		}
	}

	public static int StrToInt() {
		System.out.print("���������� �� �ϳ� �Է�: ");
		String s = sc.next();
		switch (s) {
		case "����":
			return 1;
		case "����":
			return 2;
		case "��":
			return 3;
		default:
			return (int) (Math.random() * 3) + 1;
		}
	}

	public static void IntToStr(int computer) {
		switch (computer) {
		case 1:
			System.out.println("��ǻ��: ����");
			break;
		case 2:
			System.out.println("��ǻ��: ����");
			break;
		case 3:
			System.out.println("��ǻ��: ��");
			break;
		}
	}

	public static String rsp(int user) {
		int computer = (int) (Math.random() * 3) + 1;
		IntToStr(computer);
		if (user == computer) {
			draw++;
			return "�����ϴ�.";
		} else if ((user == 2 && computer == 1) || (user == 3 && computer == 2) || (user == 1 && computer == 3)) {
			win++;
			return "�̰���ϴ�.";
		} else {
			lose++;
			return "�����ϴ�.";
		}
	}
}

package d_0721;

import java.util.Scanner;

public class GameTest {
	static Scanner sc = new Scanner(System.in);
	static int draw = 0;
	static int win = 0;
	static int lose = 0;

	public static void main(String[] args) {
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판  2승");
		System.out.println("3. 1판 1승\n");
		System.out.print("번호를 입력하세요.");

		int num = sc.nextInt();

		switch (num) {
		case 1:
			for (int i = 0; i < 5; i++) {
				int user = StrToInt();
				String result = rsp(user);
				System.out.println(result);

				if (win == 3) {
					System.out.println("사용자 승!!!");
					break;
				} else if (lose == 3) {
					System.out.println("컴퓨터 승!!!");
					break;
				} else if (draw == 3) {
					System.out.println("승리자가 없습니다.");
					break;
				}
			}
			if (win < 3 && lose < 3 && draw < 3) {
				System.out.println("승리자가 없습니다.");
			}
			break;
		case 2:
			for (int i = 0; i < 3; i++) {
				int user = StrToInt();
				String result = rsp(user);
				System.out.println(result);

				if (win == 2) {
					System.out.println("사용자 승!!!");
					break;
				} else if (lose == 2) {
					System.out.println("컴퓨터 승!!!");
					break;
				} else if (draw == 2) {
					System.out.println("승리자가 없습니다.");
					break;
				}
			}
			if (win < 2 && lose < 2 && draw < 2) {
				System.out.println("승리자가 없습니다.");
			}
			break;
		case 3:
			int user = StrToInt();
			String result = rsp(user);
			System.out.println(result);
			if (win == 1) {
				System.out.println("사용자 승!!!");
				break;
			} else if (lose == 1) {
				System.out.println("컴퓨터 승!!!");
				break;
			} else if (draw == 1) {
				System.out.println("승리자가 없습니다.");
				break;
			}
			break;
		default:
			break;
		}
	}

	public static int StrToInt() {
		System.out.print("가위바위보 중 하나 입력: ");
		String s = sc.next();
		switch (s) {
		case "가위":
			return 1;
		case "바위":
			return 2;
		case "보":
			return 3;
		default:
			return (int) (Math.random() * 3) + 1;
		}
	}

	public static void IntToStr(int computer) {
		switch (computer) {
		case 1:
			System.out.println("컴퓨터: 가위");
			break;
		case 2:
			System.out.println("컴퓨터: 바위");
			break;
		case 3:
			System.out.println("컴퓨터: 보");
			break;
		}
	}

	public static String rsp(int user) {
		int computer = (int) (Math.random() * 3) + 1;
		IntToStr(computer);
		if (user == computer) {
			draw++;
			return "비겼습니다.";
		} else if ((user == 2 && computer == 1) || (user == 3 && computer == 2) || (user == 1 && computer == 3)) {
			win++;
			return "이겼습니다.";
		} else {
			lose++;
			return "졌습니다.";
		}
	}
}

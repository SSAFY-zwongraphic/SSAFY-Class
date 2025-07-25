package d_0721;

public class DigitTest1 {
	public static void main(String[] args) {
		int num = 1;
		int row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("   ");
			}
			for (int j = 0; j < row - i; j++) {
				System.out.printf("%3d", num++);
			}
			System.out.println();
		}
	}
}

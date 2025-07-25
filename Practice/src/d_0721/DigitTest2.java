package d_0721;

public class DigitTest2 {
	public static void main(String[] args) {
		int num = 1;
		int row = 5;
		int rows[] = { 5, 3, 1, 3, 5 };
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < (row - rows[i]) / 2; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j < rows[i]; j++) {
				System.out.printf("%-3d", num++);
			}
			System.out.println();
		}
	}
}

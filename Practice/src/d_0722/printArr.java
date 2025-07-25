package d_0722;

public class printArr {
	static int arr[] = { 10, 20, 30 };
	static int index = 0;

	private static void printArray1() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	private static void printArray2(int index) {
		if (index >= arr.length) {
			System.out.println();
			return;
		}
		System.out.print(arr[index] + "\t");
		printArray2(index+1);
	}

	public static void main(String[] args) {
		printArray1();
		printArray2(0);
	}
}

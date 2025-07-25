package d_0721;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AppleTree {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] farm = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				farm[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int sum = 0;
				sum += farm[i][j];
				if (i - 1 >= 0) {
					sum += farm[i - 1][j];
				}
				if (i + 1 < N) {
					sum += farm[i + 1][j];
				}
				if (j - 1 >= 0) {
					sum += farm[i][j - 1];
				}
				if (j + 1 < N) {
					sum += farm[i][j + 1];
				}
				max = Math.max(max, sum);
			}
		}
		
		System.out.println(max);
	}
}

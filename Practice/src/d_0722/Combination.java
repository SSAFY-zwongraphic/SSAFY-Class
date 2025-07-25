package d_0722;

public class Combination {

	private static double combination(int n, int k) {
		if (k == 0) {
			return 1;
		}
		return ((double)n/k) * combination(n-1, k-1);
	}

	public static void main(String[] args) {
		System.out.println((int)combination(5, 2));
	}
}

// edge 케이스를 잘 고려해야겠다... (특히 k==0 또는 k==n인 경우)
// 파스칼 삼각형 이용해서 풀 수도 있음 C(n,k)=C(n−1,k−1)+C(n−1,k)
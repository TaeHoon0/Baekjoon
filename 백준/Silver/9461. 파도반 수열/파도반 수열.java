import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 초기값 P(0) = P(1) = P(2) = 1 이후 값은
	// P(n) = P(n-2) + P(n-3)으로 나타낼 수 있음

	static long[] seq = new long[101]; // 범위 1~100

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		sequence();

		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(seq[N]).append('\n');
		}

		System.out.println(sb);
	}

	public static void sequence() {
		seq[1] = 1L;
		seq[2] = 1L;
		seq[3] = 1L;

		for(int i = 4; i < 101; i++) {
			seq[i] = seq[i-2] + seq[i-3];
		}

	}
}
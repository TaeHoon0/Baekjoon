import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] coins = new int[N];

		for(int i = 0; i < N; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}

		int cnt = 0;	// 동전의 개수
		int temp = K;   // 나머지
		// 오름차순으로 동전의 가치가 주어지기 때문에 배열의 마지막부터
		// 값을 나누어 남은 나머지로 동전이 필요한 개수를 구하기
		for(int i = N - 1; i >= 0; i--){
			cnt += temp / coins[i];
			temp = temp % coins[i]; 
		}
		System.out.println(cnt);
	}
}

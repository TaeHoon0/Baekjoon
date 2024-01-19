import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	// 모든 값을 검색해가면서 비교해야 하는 문제입니다.
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(search(arr, N, M));
	}


	static int search(int[] arr, int N, int M) {
		int result = 0;

		// 3개를 고르기 때문에 첫번째 카드는 N - 2 까지
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {

					// 현재 카드의 합
					int temp = arr[i] + arr[j] + arr[k];

					// M과 세 카드의 합이 같다면 종료
					if (M == temp) {
						return temp;
					}

					// 이전값보다 크고 M보다 작으면 바꾸기
					if(result < temp && temp < M) {
						result = temp;
					}
				}
			}
		}

		return result;
	}
}
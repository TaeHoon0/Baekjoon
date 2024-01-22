import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 모든 값을 검색해가면서 비교해야 하는 문제입니다.
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int result = 0;

		for(int i = 0; i < N; i++){
			int num = i;
			int sum = 0;

			while(num != 0) {
				sum += num % 10; 	// 각 자리수 더하기
				num /= 10;
			}

			if(sum + i == N) {
				result = i;
				break;
			}
		}

		System.out.println(result);
	}
}

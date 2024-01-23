import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = Integer.MAX_VALUE;
		// 뺄셈으로 나누기
		String[] arr = br.readLine().split("-");

		for(int i = 0; i < arr.length; i++) {
			int temp = 0;
			// 덧셈으로 나누어 더하기
			String[] plus = arr[i].split("\\+");

			for(int j = 0; j < plus.length; j++){
				temp += Integer.parseInt(plus[j]);
			}

			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	// 스택을 이용하여 여는 괄호일 때, 스택에 넣고
	// 닫는 괄호일 때 pop하여 스택에 남아있는 지 확인하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			sb.append(solve(br.readLine())).append('\n');
		}

		System.out.println(sb);
	}

	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// 여는 괄호 : 스택에 넣기
			if (c == '(') {
				stack.push(c);
			} else if (stack.empty()) {    // 스택이 비었는데 닫는 괄호
				return "NO";
			} else {            // 닫는 괄호
				stack.pop();
			}
		}

		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
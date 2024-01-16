import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		boolean chk = true;

		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());

			while(cnt <= num){
				stack.push(cnt);
				sb.append("+\n");
				cnt++;
			}

			if(stack.peek() == num){
				stack.pop();
				sb.append("-\n");
			} else {
				chk = false;
				break;
			}

		}
		if(!chk)
			System.out.println("NO");
		else
			System.out.println(sb);
	}

}
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	// 순환 큐 문제입니다.
	// K-1번째까지는 다시 큐의 마지막으로 보내고 K번째를 제거하는 문제입니다.
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		int K = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();

		// 큐에 값 넣기
		for(int i = 1; i <= N; i++){
			q.add(i);
		}

		sb.append("<");

		while(!q.isEmpty()){
			//K의 배수가 아닌 값은 뽑고 다시 넣기
			for (int i = 0; i < K; i++) {
				if (i == K-1) { // 1번 사람 부터 시작하기 때문에 k-1 과 매치한다.
					if (q.size() == 1) { // 마지막 인원은 쉼표를 제외하고 넣어준다.
						sb.append(q.remove());
					} else {
						sb.append(q.remove() + ", ");
					}
				} else {
					q.add(q.remove());
				}
			}
		}

		sb.append(">");
		System.out.println(sb);
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	// 최대 힙을 사용하는 문제입니다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 자바에서 힙을 구현하기 위해 우선순위 큐를 사용
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++){
			int x = Integer.parseInt(br.readLine());

			if(x > 0) maxHeap.add(x);
			else{
				if(maxHeap.isEmpty())
					System.out.println(0);
				else
					System.out.println(maxHeap.poll());
			}

		}
	}

}
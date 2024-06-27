
import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : priorities) {
            queue.offer(i);
        }

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 기존 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}

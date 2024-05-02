import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0, cnt = 0; // 0의 갯수, 맞춘 갯수
        
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zero++;
                continue;
            } else {
                for(int j = 0; j < win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]) {
                        cnt++;
                        break;
                    }
                }
            }        
        }
        answer[0] = (zero == 0 && cnt == 0) ? 6 : 7 - cnt - zero;   // 최고 순위
        answer[1] = (cnt == 0) ? 6 : 7 - cnt;                       // 최저 순위
        
        return answer;
    }
}
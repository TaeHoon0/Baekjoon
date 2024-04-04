import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> list;
        int n = total / num;
        int start = n - num;
        
        while(true) {
            int sum = 0;
            list = new ArrayList<>();
            
            for(int i = 0; i < num; i++) {
                sum += start + i;
                list.add(start + i);
            }
            
            if(sum == total) break;
            start++;
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
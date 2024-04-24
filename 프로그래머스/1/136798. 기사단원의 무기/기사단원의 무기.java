import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i=1; i<=number; i++) {
            int sqrt = (int) Math.sqrt(i);
            ArrayList<Integer> arr = new ArrayList<>();
            
            for (int j=1; j<=sqrt; j++) {
                if (i % j == 0) {
                    arr.add(j);
                    if(i / j != j) {
                        arr.add(i / j);
                    }
                }
            }
            
            if (arr.size() > limit) answer += power;
            else answer += arr.size();
        }

        return answer;
    }
}
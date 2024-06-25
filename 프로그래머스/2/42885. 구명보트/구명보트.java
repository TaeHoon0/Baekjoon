import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int n = 0;
        for(int i = people.length - 1; i >= n; i--){
            if(people[i] + people[n] <= limit){
                answer++;
                n++;
            } else answer++;
        }
        
        return answer;
    }
}
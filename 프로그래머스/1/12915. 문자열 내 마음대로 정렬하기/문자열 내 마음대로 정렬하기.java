import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(n);
            answer[i] = c + strings[i]; // 원하는 index의 문자를 가장 앞에 오도록
        }
        
        Arrays.sort(answer);    // 후에 정렬
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1, answer[i].length());   
        }
        
        return answer;
    }
}
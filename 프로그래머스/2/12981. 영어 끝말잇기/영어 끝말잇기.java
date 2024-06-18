import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Set<String> wordsSet = new HashSet<>();
        wordsSet.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            // 중복이 아니고, 끝말잇기가 맞을 때
            if (!wordsSet.add(words[i]) || !words[i - 1].endsWith(String.valueOf(words[i].charAt(0)))) {
                answer[0] = (i % n) + 1; // 번호
                answer[1] = (i / n) + 1; // 차례
                return answer;
            }
        }
        
        return answer;
    }
}
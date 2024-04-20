import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        int max = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == p1[i % p1.length]) scores[0]++;
            if(answers[i] == p2[i % p2.length]) scores[1]++;
            if(answers[i] == p3[i % p3.length]) scores[2]++;
        }

        for(int score : scores) {
            if(max < score) max = score;    
        }
        
        for(int i = 0; i < scores.length; i++){
            if(max == scores[i]) list.add(i + 1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
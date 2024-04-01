import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];
        
        for(int i = 0; i < score.length; i++) {
            average[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        for(int i = 0; i < average.length; i++) {
            int rank = 1;
            
            for(int j = 0; j < average.length; j++) {
                if(average[i] < average[j]) rank++;
            }
            
            answer[i] = rank;
        }
        
        return answer;
    }
}
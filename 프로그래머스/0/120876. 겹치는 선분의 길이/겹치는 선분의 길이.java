class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cnt = new int[201];   // -100 ~ 100
        
        for(int i = 0; i < lines.length; i++) {
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                cnt[j]++;
            }
        }
        
        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] > 1) answer++;
        }
        
        return answer;
    }
    
}


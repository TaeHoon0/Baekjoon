class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long num_p = Long.parseLong(p);
        for(int i = 0; i <= t.length() - p.length(); i++){
            long num_t = Long.parseLong(t.substring(i, i + p.length()));
            
            if(num_t <= num_p) answer++;
        }
        
        return answer;
    }
}
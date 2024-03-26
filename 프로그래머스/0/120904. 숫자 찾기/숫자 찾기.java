class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        
        for(char c : str.toCharArray()) {
            int n = c - '0';
            answer += 1;
            if(n == k) return answer;
        } 
        
        return -1;
    }
}
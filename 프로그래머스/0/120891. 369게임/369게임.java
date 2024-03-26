class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order > 0) {
            int n = order % 10;
            if(n != 0 && n % 3 == 0) answer += 1;
            order /= 10;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            int bottle = (n / a) * b;         
            int remainder = n % a;
            
            answer += bottle;
            n = bottle + remainder;
        }
            
        return answer;
    }
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int num : array) {
            int tmp = num;
            
            while(tmp > 0) {
                if(tmp % 10 == 7) answer += 1;
                
                tmp /= 10;
            }
        }
        return answer;
    }
}
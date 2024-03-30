class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int small = Math.min(sides[0], sides[1]);
        
        answer += 2 * small - 1;
            
        
        return answer;
    }
}
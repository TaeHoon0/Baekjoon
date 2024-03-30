class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int large = 0;
        int small = 0;
        
        if(sides[0] >= sides[1]) {
            large = sides[0];
            small = sides[1];
        } else {
            large = sides[1];
            small = sides[0];
        }
        
        answer += 2 * small - 1;
            
        
        return answer;
    }
}
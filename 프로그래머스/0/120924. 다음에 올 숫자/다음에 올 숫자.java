class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean flag = false;   // true : 등차 flase : 등비
        
        if(common[2] - common[1] == common[1] - common[0]) flag = true;
        
        if(flag) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        
        
        return answer;
    }
}

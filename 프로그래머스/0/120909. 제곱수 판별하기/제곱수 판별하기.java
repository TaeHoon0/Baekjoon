class Solution {
    public int solution(int n) {
        for(int i = 1; i < 1001; i++) {
            if(Math.pow(i, 2) == n) return 1;
        }
        return 2;
    }
}
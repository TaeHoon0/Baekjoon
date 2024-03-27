class Solution {
    public int solution(int n) {
        
        for(int i = 1; i <= 11; i++) {
            int tmp = 1;
            for(int j = i; j > 0; j--) {
                tmp *= j;
            }    
            
            if(tmp > n) return i - 1;
        }
        
        return -1;
    }
}
class Solution {
    public int solution(int n, String control) {
        
        for(char c : control.toCharArray()) {
            if(c == 'w') n += 1;
            if(c == 's') n -= 1;
            if(c == 'd') n += 10;
            if(c == 'a') n -= 10;
        }
        
        return n;
    }
}
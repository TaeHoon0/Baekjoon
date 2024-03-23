class Solution {
    public int solution(String my_string, String is_suffix) {
        
        int len = my_string.length();
        for(int i = len - 1; i >= 0 ; i--) {
            if(my_string.substring(i, len).equals(is_suffix)) return 1;    
        }
        
        
        return 0;
    }
}
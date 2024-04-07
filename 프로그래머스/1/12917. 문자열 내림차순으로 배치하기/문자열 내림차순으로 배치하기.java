import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        for(char c : arr) sb.append(c);
        
        return sb.reverse().toString();
    }
}
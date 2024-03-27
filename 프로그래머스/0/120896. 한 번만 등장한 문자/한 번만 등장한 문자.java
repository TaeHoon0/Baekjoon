import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            if(s.indexOf(c) == s.lastIndexOf(c)) sb.append(c);
        }
        
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
            
        return new String(arr);
    }
}
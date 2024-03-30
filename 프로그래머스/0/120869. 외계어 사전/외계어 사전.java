import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(spell);
        
        for(String s : spell) {
            sb.append(s);
        }
        
        String str = sb.toString();
        
        for(String s : dic) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);
            
            if(word.equals(str)) return 1;
        }
        
        return 2;
    }
}
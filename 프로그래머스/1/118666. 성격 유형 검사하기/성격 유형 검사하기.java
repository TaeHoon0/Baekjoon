import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
        for(int i = 0; i < survey.length; i++) {
            int score = choices[i] - 4;
            String type = survey[i];

            if(score > 0) map.put(type.charAt(1), map.get(type.charAt(1)) + score);
            else if(score < 0) map.put(type.charAt(0), map.get(type.charAt(0)) - score);
        }
        
        sb.append(map.get('T') > map.get('R') ? 'T' : 'R');
        sb.append(map.get('F') > map.get('C') ? 'F' : 'C');
        sb.append(map.get('M') > map.get('J') ? 'M' : 'J');
        sb.append(map.get('N') > map.get('A') ? 'N' : 'A');
        
        return sb.toString();
    }
}
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(String player : participant) {
            if(map.containsKey(player)) {
                int n = map.get(player);
                map.put(player, n + 1);
            } else {
                map.put(player, 1);
            }
        }
        
        for(String player : completion) {
            if(map.get(player) == 1) map.remove(player);
            else {
                int n = map.get(player);
                map.put(player, n - 1);
            }
        }
        
        for(String player : map.keySet()) answer = player;
        
        return answer;
    }
}
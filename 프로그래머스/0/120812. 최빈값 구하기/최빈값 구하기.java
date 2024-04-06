import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int frequency = 0;          // 최대 빈도수
        boolean overlap = false;    // 중복여부
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : array) {
            if(!map.containsKey(num)) map.put(num, 1);
            else {
                int cnt = map.get(num);
                map.put(num, cnt + 1);
            }
        }
        
        for(int key : map.keySet()) {            
            if(frequency == map.get(key)) overlap = true;
            if(frequency < map.get(key)) {
                frequency = map.get(key);
                overlap = false;
                answer = key;
            }
        }
        
        return overlap ? -1 : answer;
    }
}
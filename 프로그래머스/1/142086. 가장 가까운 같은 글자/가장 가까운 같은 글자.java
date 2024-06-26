import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                answer[i] = -1;
                map.put(arr[i], i);
            }else {
                int index = map.get(arr[i]);
                answer[i] = i - index;
                map.put(arr[i], i);
            }
        }
        
        return answer;
    }
}
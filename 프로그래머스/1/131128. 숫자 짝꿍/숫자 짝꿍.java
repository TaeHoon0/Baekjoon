import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        HashMap<Integer, Integer> mapX = new HashMap<>();
        HashMap<Integer, Integer> mapY = new HashMap<>();
        StringBuilder couple = new StringBuilder();
        
        // 0 ~ 9 초기화
        for(int i = 0; i < 10; i++) {
            mapX.put(i, -1);
            mapY.put(i, -1);
        }
        
        // X, Y가 갖고 있는 수 체크
        for(char c : X.toCharArray()) mapX.put(c - '0', mapX.getOrDefault(c - '0', 0) + 1);
        for(char c : Y.toCharArray()) mapY.put(c - '0', mapY.getOrDefault(c - '0', 0) + 1);
          
        // X, Y 비교하여 List 추가
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j <= (Math.min(mapX.get(i), mapY.get(i))); j++) {
                couple.append(i);
            }
        }
        
        if(couple.toString().equals("")) return "-1";
        if(couple.toString().endsWith("0")) return "0";
        return couple.reverse().toString();
    }
}
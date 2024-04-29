import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challenge = new int[N + 1]; // 도전한 사람 수
        double[] fail = new double[N + 1];  // 실패율
        int num = stages.length; // 총 사용자 수 
        Map<Integer, Double> map = new HashMap<>();
        
        for(int stage : stages) {
            for(int i = 0; i < stage; i++) challenge[i]++; // 스테이지에 도전한 사람 수
            
            fail[stage - 1]++; // 스테이지에 머무르는 사람 수
        }
        
        // 실패율 구하기
        for(int i = 0; i < fail.length - 1; i++) {
            if(challenge[i] != 0) fail[i] = (double) fail[i] / challenge[i];
            
            map.put(i + 1, fail[i]); // 스테이지, 실패율
        }
        
        List<Integer> result = new ArrayList<>(map.keySet());
        
        // 내림차순 정렬
        result.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
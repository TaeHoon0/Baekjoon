import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> type = new HashMap<>();
        for( String[] cloth : clothes ){
            
            //이미 있는 경우 값을 1 증가
            if(type.containsKey(cloth[1]) ){
                type.put(cloth[1], type.get(cloth[1])+1);
            } else {
            	//없는 경우 값을 1로 저장한다.
                type.put(cloth[1], 1);
            }
        }
        
        for( String key : type.keySet()){
            answer *= type.get(key)+1;
        }
        
        answer -= 1;
        
        return answer;
    }
}
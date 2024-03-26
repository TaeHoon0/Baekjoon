import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(direction.equals("right")) {
            list.add(numbers[numbers.length - 1]);
            int[] temp = Arrays.copyOfRange(numbers, 0, numbers.length - 1);
            for(int i : temp) {
                list.add(i);
            }
        } 
        
        if(direction.equals("left")) {
            list.add(numbers[1]);
            int[] temp = Arrays.copyOfRange(numbers, 2, numbers.length);
            for(int i : temp) {
                list.add(i);
            }
            
            list.add(numbers[0]);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);    
        }
        
        return answer;
    }
}
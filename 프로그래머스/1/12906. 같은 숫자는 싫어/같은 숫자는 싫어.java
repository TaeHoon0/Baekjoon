import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        stack.add(arr[0]);
        list.add(arr[0]);
        
        for(int n : arr) {
            if(stack.peek() != n) {
                stack.add(n);
                list.add(n);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
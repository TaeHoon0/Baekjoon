import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};    
        
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        
        for(int n : arr) if(n < min) min = n;
        
        for(int n : arr) if(n != min) list.add(n);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
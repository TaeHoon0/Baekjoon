import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        
        Arrays.sort(array);
        
        for(int num : array) {
            if(Math.abs(n - num) < Math.abs(n - min)) min = num;
        }
        
        return min;
    }
}

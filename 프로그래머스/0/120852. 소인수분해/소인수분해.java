import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        int tmp = n;
        int divisor = 2;

        while(divisor <= n) {
            if(tmp % divisor == 0) {
                set.add(divisor);
                tmp /= divisor;
            } else {
                divisor += 1;
            }
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        
        return arr;
    }
}